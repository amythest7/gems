package net.amy.stardust.block.entity.custom;

import net.amy.stardust.block.entity.ImplementedInventory;
import net.amy.stardust.block.entity.ModBlockEntities;
import net.amy.stardust.item.ModItems;
import net.amy.stardust.menu.custom.GemFaceterMenu;
import net.amy.stardust.recipe.ModRecipes;
import net.amy.stardust.recipe.custom.GemFacetingRecipe;
import net.amy.stardust.recipe.custom.GemFacetingRecipeInput;
import net.fabricmc.fabric.api.menu.v1.ExtendedMenuProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.Containers;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.jspecify.annotations.Nullable;

import java.util.Optional;

public class GemFaceterBlockEntity extends BlockEntity implements ExtendedMenuProvider<BlockPos>, ImplementedInventory {
    public final NonNullList<ItemStack> inventory = NonNullList.withSize(2, ItemStack.EMPTY);

    private static final int INPUT_SLOT = 0;
    private static final int OUTPUT_SLOT = 1;

    private final ContainerData data;
    private int progress = 0;
    private int maxProgress = 72;

    


    public GemFaceterBlockEntity(BlockPos worldPosition, BlockState blockState) {
        super(ModBlockEntities.GEM_FACETER_BE ,worldPosition, blockState);
        this.data = new ContainerData() {
            @Override
            public int get(int dataId) {
                return switch (dataId) {
                    case 0 -> GemFaceterBlockEntity.this.progress;
                    case 1 -> GemFaceterBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int dataId, int value) {
                switch (dataId) {
                    case 0 -> GemFaceterBlockEntity.this.progress = value;
                    case 1 -> GemFaceterBlockEntity.this.maxProgress = value;
                };
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
        output.putInt("crystallizer.progress", progress);
        output.putInt("crystallizer.max_progress", maxProgress);

        ContainerHelper.saveAllItems(output, inventory);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        progress = input.getIntOr("crystallizer.progress", 0);
        maxProgress = input.getIntOr("crystallizer.max_progress", 72);

        ContainerHelper.loadAllItems(input, inventory);
    }

    public void drops() {
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public BlockPos getScreenOpeningData(ServerPlayer player) {
        return this.worldPosition;
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.stardust.gem_faceter");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int containerId, Inventory inventory, Player player) {
        return new GemFaceterMenu(containerId, inventory, this, this.data);
    }

    @Override
    public NonNullList<ItemStack> getItems() {
        return inventory;
    }

    public void tick(Level level, BlockPos pos, BlockState state) {
        if(hasRecipe() && isOutputSlotEmptyOrReceivable()) {
            increaseCraftingProgress();
            setChanged(level, pos, state);

            if(hasCraftingFinished()) {
                craftItem();
                resetProgress();
            }
        } else {
            resetProgress();
        }
    }


    private boolean hasRecipe() {
        Optional<RecipeHolder<GemFacetingRecipe>> recipe = getCurrentRecipe();
        if (recipe.isEmpty()) {
            return false;
        }

        ItemStack output = recipe.get().value().assemble(new GemFacetingRecipeInput(inventory.get(INPUT_SLOT)));



        boolean isItemOutputRight = canInsertItemIntoOutputSlot(output);
        boolean isAmountRight = canInsertAmountIntoOutputSlot(output.getCount());

        return isItemOutputRight && isAmountRight;
    }

    private Optional<RecipeHolder<GemFacetingRecipe>> getCurrentRecipe() {
        return ((ServerLevel) level).recipeAccess()
                .getRecipeFor(ModRecipes.GEM_FACETING_RECIPE_TYPE, new GemFacetingRecipeInput(inventory.get(INPUT_SLOT)),level);
    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        int maxCount = inventory.get(OUTPUT_SLOT).isEmpty() ? 64 : inventory.get(OUTPUT_SLOT).getMaxStackSize();
        int currentCount = inventory.get(OUTPUT_SLOT).getCount();

        return maxCount >= currentCount + count;
    }

    private boolean canInsertItemIntoOutputSlot(ItemStack output) {
        return inventory.get(OUTPUT_SLOT).isEmpty() ||
                inventory.get(OUTPUT_SLOT).is(output.getItem());
    }


    private void craftItem() {
        Optional<RecipeHolder<GemFacetingRecipe>> recipe = getCurrentRecipe();

        ItemStack output = recipe.get().value().assemble(new GemFacetingRecipeInput(inventory.get(INPUT_SLOT)));


        inventory.set(INPUT_SLOT, inventory.get(INPUT_SLOT).copyWithCount(inventory.get(INPUT_SLOT).getCount() - 1));
        inventory.set(OUTPUT_SLOT, output.copyWithCount(inventory.get(OUTPUT_SLOT).getCount() + output.getCount()));
    }

    private boolean isOutputSlotEmptyOrReceivable() {
        return inventory.get(OUTPUT_SLOT).isEmpty() ||
                inventory.get(OUTPUT_SLOT).getCount() < inventory.get(OUTPUT_SLOT).getMaxStackSize();
    }

    private void increaseCraftingProgress() {
        progress++;
    }

    private boolean hasCraftingFinished() {
        return progress >= maxProgress;
    }

    private void resetProgress() {
        progress = 0;
        maxProgress = 72;
    }



    @Override
    public @Nullable Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }

    @Override
    public void setChanged() {
        super.setChanged();
        if(!level.isClientSide()) {
            level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
        }
    }
}
