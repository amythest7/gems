package net.amy.gems.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

import static net.amy.gems.block.ModBlocks.*;
import static net.amy.gems.block.ModBlocks.AMETHYST_TORCH;
import static net.amy.gems.block.ModBlocks.AQUAMARINE_TORCH;
import static net.amy.gems.block.ModBlocks.CITRINE_TORCH;
import static net.amy.gems.block.ModBlocks.EMERALD_TORCH;
import static net.amy.gems.block.ModBlocks.RUBY_TORCH;
import static net.amy.gems.block.ModBlocks.SAPPHIRE_TORCH;
import static net.amy.gems.block.ModBlocks.SPINEL_TORCH;
import static net.amy.gems.block.ModBlocks.TOPAZ_TORCH;
import static net.amy.gems.item.ModItems.*;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(CRYSTALLISED_STARDUST_BLOCK);

        dropSelf(STARDUST_LANTERN);
        dropSelf(RUBY_LANTERN);
        dropSelf(SAPPHIRE_LANTERN);
        dropSelf(TOPAZ_LANTERN);
        dropSelf(CITRINE_LANTERN);
        dropSelf(EMERALD_LANTERN);
        dropSelf(EMPTY_LANTERN);
        dropSelf(AMETHYST_LANTERN);
        dropSelf(AQUAMARINE_LANTERN);
        dropSelf(SPINEL_LANTERN);

        dropSelf(RUBY_TORCH);
        dropSelf(SAPPHIRE_TORCH);
        dropSelf(TOPAZ_TORCH);
        dropSelf(CITRINE_TORCH);
        dropSelf(EMERALD_TORCH);
        dropSelf(AMETHYST_TORCH);
        dropSelf(AQUAMARINE_TORCH);
        dropSelf(SPINEL_TORCH);


        dropSelf(RUBY_BLOCK);
        dropSelf(SAPPHIRE_BLOCK);
        dropSelf(TOPAZ_BLOCK);
        dropSelf(CITRINE_BLOCK);
        dropSelf(AQUAMARINE_BLOCK);
        dropSelf(SPINEL_BLOCK);
        dropSelf(AMETHYST_GEM_BLOCK);

        add(STARDUST_ORE, createMultipleOreDrops(STARDUST_ORE, UNREFINED_STARDUST, 1f, 3f));

        add(SAPPHIRE_ORE, createOreDrop(SAPPHIRE_ORE, RAW_SAPPHIRE));
        add(RUBY_ORE, createOreDrop(RUBY_ORE, RAW_RUBY));
        add(DEEPSLATE_SAPPHIRE_ORE, createOreDrop(DEEPSLATE_SAPPHIRE_ORE, RAW_SAPPHIRE));
        add(DEEPSLATE_RUBY_ORE, createOreDrop(DEEPSLATE_RUBY_ORE, RAW_RUBY));

        add(AMETHYST_ORE, createOreDrop(AMETHYST_ORE, RAW_AMETHYST));
        add(TOPAZ_ORE, createOreDrop(TOPAZ_ORE, RAW_TOPAZ));
        add(DEEPSLATE_AMETHYST_ORE, createOreDrop(DEEPSLATE_AMETHYST_ORE, RAW_AMETHYST));
        add(DEEPSLATE_TOPAZ_ORE, createOreDrop(DEEPSLATE_TOPAZ_ORE, RAW_TOPAZ));

        add(CITRINE_ORE, createOreDrop(CITRINE_ORE, RAW_CITRINE));
        add(DEEPSLATE_CITRINE_ORE, createOreDrop(DEEPSLATE_CITRINE_ORE, RAW_CITRINE));

        add(SPINEL_ORE, createOreDrop(SPINEL_ORE, RAW_SPINEL));
        add(DEEPSLATE_SPINEL_ORE, createOreDrop(DEEPSLATE_SPINEL_ORE, RAW_SPINEL));

        add(AQUAMARINE_ORE, createOreDrop(AQUAMARINE_ORE, RAW_AQUAMARINE));
        add(DEEPSLATE_AQUAMARINE_ORE, createOreDrop(DEEPSLATE_AQUAMARINE_ORE, RAW_AQUAMARINE));

        /*add(SAPPHIRE_ORE, createOreDrop(SAPPHIRE_ORE, SAPPHIRE));
        add(RUBY_ORE, createOreDrop(RUBY_ORE, RUBY));
        add(DEEPSLATE_SAPPHIRE_ORE, createOreDrop(DEEPSLATE_SAPPHIRE_ORE, SAPPHIRE));
        add(DEEPSLATE_RUBY_ORE, createOreDrop(DEEPSLATE_RUBY_ORE, RUBY));

        add(AMETHYST_ORE, createOreDrop(AMETHYST_ORE, AMETHYST));
        add(TOPAZ_ORE, createOreDrop(TOPAZ_ORE, TOPAZ));
        add(DEEPSLATE_AMETHYST_ORE, createOreDrop(DEEPSLATE_AMETHYST_ORE, AMETHYST));
        add(DEEPSLATE_TOPAZ_ORE, createOreDrop(DEEPSLATE_TOPAZ_ORE, TOPAZ));

        add(CITRINE_ORE, createOreDrop(CITRINE_ORE, CITRINE));
        add(DEEPSLATE_CITRINE_ORE, createOreDrop(DEEPSLATE_CITRINE_ORE, CITRINE));

        add(SPINEL_ORE, createOreDrop(SPINEL_ORE, SPINEL));
        add(DEEPSLATE_SPINEL_ORE, createOreDrop(DEEPSLATE_SPINEL_ORE, SPINEL));

        add(AQUAMARINE_ORE, createOreDrop(AQUAMARINE_ORE, AQUAMARINE));
        add(DEEPSLATE_AQUAMARINE_ORE, createOreDrop(DEEPSLATE_AQUAMARINE_ORE, AQUAMARINE));*/


    }

    public LootTable.Builder createMultipleOreDrops(final Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(
                        block,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

}
