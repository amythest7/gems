package net.amy.stardust.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

import static net.amy.stardust.block.ModBlocks.*;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {


    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(STARDUST_ORE)
                .add(CRYSTALLISED_STARDUST_BLOCK)
                .add(RUBY_ORE)
                .add(SAPPHIRE_ORE)
                .add(DEEPSLATE_RUBY_ORE)
                .add(DEEPSLATE_SAPPHIRE_ORE)
                .add(TOPAZ_ORE)
                .add(AMETHYST_ORE)
                .add(DEEPSLATE_TOPAZ_ORE)
                .add(DEEPSLATE_AMETHYST_ORE)
                .add(CITRINE_ORE)
                .add(DEEPSLATE_CITRINE_ORE)
                .add(SPINEL_ORE)
                .add(DEEPSLATE_SPINEL_ORE)
                .add(AQUAMARINE_ORE)
                .add(DEEPSLATE_AQUAMARINE_ORE);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(STARDUST_ORE)
                .add(CRYSTALLISED_STARDUST_BLOCK);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(RUBY_ORE)
                .add(SAPPHIRE_ORE)
                .add(DEEPSLATE_RUBY_ORE)
                .add(DEEPSLATE_SAPPHIRE_ORE)
                .add(TOPAZ_ORE)
                .add(AMETHYST_ORE)
                .add(DEEPSLATE_TOPAZ_ORE)
                .add(DEEPSLATE_AMETHYST_ORE)
                .add(CITRINE_ORE)
                .add(DEEPSLATE_CITRINE_ORE)
                .add(SPINEL_ORE)
                .add(DEEPSLATE_SPINEL_ORE)
                .add(AQUAMARINE_ORE)
                .add(DEEPSLATE_AQUAMARINE_ORE);

    }
}

