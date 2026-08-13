package net.amy.stardust.worldgen;

import net.amy.stardust.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

import static net.amy.stardust.Stardust.MOD_ID;

public class ModConfiguredFeatures {

    public static void configure(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceableRule = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceableRule = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        //RuleTest endstoneReplaceableRule = new TagMatchTest(BlockTags.ENDS)
        List<OreConfiguration.TargetBlockState> rubyOreConfig =
                List.of(
                        OreConfiguration.target(stoneReplaceableRule, ModBlocks.RUBY_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceableRule, ModBlocks.DEEPSLATE_RUBY_ORE.defaultBlockState())
                );
        context.register(
                RUBY_ORE_VEIN_CONFIGURED_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(rubyOreConfig, 3))
        );

        List<OreConfiguration.TargetBlockState> sapphireOreConfig =
                List.of(
                        OreConfiguration.target(stoneReplaceableRule, ModBlocks.SAPPHIRE_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceableRule, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.defaultBlockState())
                );
        context.register(
                SAPPHIRE_ORE_VEIN_CONFIGURED_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(rubyOreConfig, 3))
        );
        List<OreConfiguration.TargetBlockState> topazOreConfig =
                List.of(
                        OreConfiguration.target(stoneReplaceableRule, ModBlocks.TOPAZ_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceableRule, ModBlocks.DEEPSLATE_TOPAZ_ORE.defaultBlockState())
                );
        context.register(
                TOPAZ_ORE_VEIN_CONFIGURED_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(rubyOreConfig, 3))
        );
        List<OreConfiguration.TargetBlockState> citrineOreConfig =
                List.of(
                        OreConfiguration.target(stoneReplaceableRule, ModBlocks.CITRINE_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceableRule, ModBlocks.DEEPSLATE_CITRINE_ORE.defaultBlockState())
                );
        context.register(
                CITRINE_ORE_VEIN_CONFIGURED_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(rubyOreConfig, 3))
        );
        List<OreConfiguration.TargetBlockState> spinelOreConfig =
                List.of(
                        OreConfiguration.target(stoneReplaceableRule, ModBlocks.SPINEL_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceableRule, ModBlocks.DEEPSLATE_SPINEL_ORE.defaultBlockState())
                );
        context.register(
                SPINEL_ORE_VEIN_CONFIGURED_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(rubyOreConfig, 3))
        );
        List<OreConfiguration.TargetBlockState> amethystOreConfig =
                List.of(
                        OreConfiguration.target(stoneReplaceableRule, ModBlocks.AMETHYST_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceableRule, ModBlocks.DEEPSLATE_AMETHYST_ORE.defaultBlockState())
                );
        context.register(
                AMETHYST_ORE_VEIN_CONFIGURED_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(rubyOreConfig, 3))
        );
        List<OreConfiguration.TargetBlockState> aquamarineOreConfig =
                List.of(
                        OreConfiguration.target(stoneReplaceableRule, ModBlocks.AQUAMARINE_ORE.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceableRule, ModBlocks.DEEPSLATE_AQUAMARINE_ORE.defaultBlockState())
                );
        context.register(
                AQUAMARINE_ORE_VEIN_CONFIGURED_KEY,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreConfiguration(rubyOreConfig, 3))
        );
    }
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE_VEIN_CONFIGURED_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "ruby_ore_vein")
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_VEIN_CONFIGURED_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "sapphire_ore_vein")
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_VEIN_CONFIGURED_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "topaz_ore_vein")
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPINEL_ORE_VEIN_CONFIGURED_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "spinel_ore_vein")
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> AMETHYST_ORE_VEIN_CONFIGURED_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "amethyst_ore_vein")
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> CITRINE_ORE_VEIN_CONFIGURED_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "citrine_ore_vein")
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> AQUAMARINE_ORE_VEIN_CONFIGURED_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "aquamarine_ore_vein")
            );
    public static final ResourceKey<ConfiguredFeature<?, ?>> STARDUST_ORE_VEIN_CONFIGURED_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "stardust_ore_vein")
            );
}
