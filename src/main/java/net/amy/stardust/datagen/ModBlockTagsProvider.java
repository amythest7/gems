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
                .add(DEEPSLATE_AQUAMARINE_ORE)

                .add(STARDUST_LANTERN)
                .add(RUBY_LANTERN)
                .add(SAPPHIRE_LANTERN)
                .add(TOPAZ_LANTERN)
                .add(CITRINE_LANTERN)
                .add(EMERALD_LANTERN)
                .add(EMPTY_LANTERN)
                .add(AMETHYST_LANTERN)
                .add(AQUAMARINE_LANTERN)
                .add(SPINEL_LANTERN)
        
                
                .add(RUBY_BLOCK)
                .add(SAPPHIRE_BLOCK)
                .add(TOPAZ_BLOCK)
                .add(CITRINE_BLOCK)
                .add(AQUAMARINE_BLOCK)
                .add(SPINEL_BLOCK)
                .add(AMETHYST_GEM_BLOCK);

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
                .add(DEEPSLATE_AQUAMARINE_ORE)

                .add(STARDUST_LANTERN)
                .add(RUBY_LANTERN)
                .add(SAPPHIRE_LANTERN)
                .add(TOPAZ_LANTERN)
                .add(CITRINE_LANTERN)
                .add(EMERALD_LANTERN)
                .add(EMPTY_LANTERN)
                .add(AMETHYST_LANTERN)
                .add(AQUAMARINE_LANTERN)
                .add(SPINEL_LANTERN)

                .add(RUBY_BLOCK)
                .add(SAPPHIRE_BLOCK)
                .add(TOPAZ_BLOCK)
                .add(CITRINE_BLOCK)
                .add(AQUAMARINE_BLOCK)
                .add(SPINEL_BLOCK)
                .add(AMETHYST_GEM_BLOCK);

    }
}

