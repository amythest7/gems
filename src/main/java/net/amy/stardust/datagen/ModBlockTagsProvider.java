package net.amy.stardust.datagen;

import net.amy.stardust.block.ModBlocks;
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
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(STARDUST_ORE))
                .add(ModBlocks.getRK(CRYSTALLISED_STARDUST_BLOCK))
                .add(ModBlocks.getRK(RUBY_ORE))
                .add(ModBlocks.getRK(SAPPHIRE_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_RUBY_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_SAPPHIRE_ORE))
                .add(ModBlocks.getRK(TOPAZ_ORE))
                .add(ModBlocks.getRK(AMETHYST_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_TOPAZ_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_AMETHYST_ORE))
                .add(ModBlocks.getRK(CITRINE_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_CITRINE_ORE))
                .add(ModBlocks.getRK(SPINEL_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_SPINEL_ORE))
                .add(ModBlocks.getRK(AQUAMARINE_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_AQUAMARINE_ORE))

                .add(ModBlocks.getRK(STARDUST_LANTERN))
                .add(ModBlocks.getRK(RUBY_LANTERN))
                .add(ModBlocks.getRK(SAPPHIRE_LANTERN))
                .add(ModBlocks.getRK(TOPAZ_LANTERN))
                .add(ModBlocks.getRK(CITRINE_LANTERN))
                .add(ModBlocks.getRK(EMERALD_LANTERN))
                .add(ModBlocks.getRK(EMPTY_LANTERN))
                .add(ModBlocks.getRK(AMETHYST_LANTERN))
                .add(ModBlocks.getRK(AQUAMARINE_LANTERN))
                .add(ModBlocks.getRK(SPINEL_LANTERN))

                .add(ModBlocks.getRK(RUBY_BLOCK))
                .add(ModBlocks.getRK(SAPPHIRE_BLOCK))
                .add(ModBlocks.getRK(TOPAZ_BLOCK))
                .add(ModBlocks.getRK(CITRINE_BLOCK))
                .add(ModBlocks.getRK(AQUAMARINE_BLOCK))
                .add(ModBlocks.getRK(SPINEL_BLOCK))
                .add(ModBlocks.getRK(AMETHYST_GEM_BLOCK));

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.getRK(STARDUST_ORE))
                .add(ModBlocks.getRK(CRYSTALLISED_STARDUST_BLOCK));

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(RUBY_ORE))
                .add(ModBlocks.getRK(SAPPHIRE_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_RUBY_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_SAPPHIRE_ORE))
                .add(ModBlocks.getRK(TOPAZ_ORE))
                .add(ModBlocks.getRK(AMETHYST_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_TOPAZ_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_AMETHYST_ORE))
                .add(ModBlocks.getRK(CITRINE_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_CITRINE_ORE))
                .add(ModBlocks.getRK(SPINEL_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_SPINEL_ORE))
                .add(ModBlocks.getRK(AQUAMARINE_ORE))
                .add(ModBlocks.getRK(DEEPSLATE_AQUAMARINE_ORE))

                .add(ModBlocks.getRK(STARDUST_LANTERN))
                .add(ModBlocks.getRK(RUBY_LANTERN))
                .add(ModBlocks.getRK(SAPPHIRE_LANTERN))
                .add(ModBlocks.getRK(TOPAZ_LANTERN))
                .add(ModBlocks.getRK(CITRINE_LANTERN))
                .add(ModBlocks.getRK(EMERALD_LANTERN))
                .add(ModBlocks.getRK(EMPTY_LANTERN))
                .add(ModBlocks.getRK(AMETHYST_LANTERN))
                .add(ModBlocks.getRK(AQUAMARINE_LANTERN))
                .add(ModBlocks.getRK(SPINEL_LANTERN))

                .add(ModBlocks.getRK(RUBY_BLOCK))
                .add(ModBlocks.getRK(SAPPHIRE_BLOCK))
                .add(ModBlocks.getRK(TOPAZ_BLOCK))
                .add(ModBlocks.getRK(CITRINE_BLOCK))
                .add(ModBlocks.getRK(AQUAMARINE_BLOCK))
                .add(ModBlocks.getRK(SPINEL_BLOCK))
                .add(ModBlocks.getRK(AMETHYST_GEM_BLOCK));

        tag(BlockTags.WALL_POST_OVERRIDE)
                .add(ModBlocks.getRK(AMETHYST_TORCH))
                .add(ModBlocks.getRK(RUBY_TORCH))
                .add(ModBlocks.getRK(SAPPHIRE_TORCH))
                .add(ModBlocks.getRK(EMERALD_TORCH))
                .add(ModBlocks.getRK(TOPAZ_TORCH))
                .add(ModBlocks.getRK(CITRINE_TORCH))
                .add(ModBlocks.getRK(SPINEL_TORCH))
                .add(ModBlocks.getRK(AQUAMARINE_TORCH));
    }
}

