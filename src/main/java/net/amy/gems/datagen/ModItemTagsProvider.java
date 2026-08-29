package net.amy.gems.datagen;

import net.amy.gems.item.ModItems;
import net.amy.gems.tag.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

import static net.amy.gems.item.ModItems.*;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {

    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        tag(ModTags.Items.GEMS)
                .add(ModItems.getRK(RUBY))
                .add(ModItems.getRK(SAPPHIRE))
                .add(ModItems.getRK(Items.EMERALD))
                .add(ModItems.getRK(Items.DIAMOND))
                .add(ModItems.getRK(TOPAZ))
                .add(ModItems.getRK(CITRINE))
                .add(ModItems.getRK(SPINEL))
                .add(ModItems.getRK(AMETHYST))
                .add(ModItems.getRK(AQUAMARINE));

    }
}
