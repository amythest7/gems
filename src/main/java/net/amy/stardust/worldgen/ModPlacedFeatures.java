package net.amy.stardust.worldgen;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static net.amy.stardust.Stardust.MOD_ID;

public class ModPlacedFeatures {
    public static void configure(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        List<PlacementModifier> gemVeinModifiers = List.of(
                CountPlacement.of(100),
                BiomeFilter.biome(),
                InSquarePlacement.spread(),
                HeightRangePlacement.of(UniformHeight.of(VerticalAnchor.BOTTOM, VerticalAnchor.absolute(480)))
        );
        context.register(
                RUBY_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE_VEIN_CONFIGURED_KEY),
                        gemVeinModifiers
                )
        );
        context.register(
                SAPPHIRE_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_VEIN_CONFIGURED_KEY),
                        gemVeinModifiers
                )
        );
        context.register(
                SPINEL_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(ModConfiguredFeatures.SPINEL_ORE_VEIN_CONFIGURED_KEY),
                        gemVeinModifiers
                )
        );
        context.register(
                TOPAZ_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(ModConfiguredFeatures.TOPAZ_ORE_VEIN_CONFIGURED_KEY),
                        gemVeinModifiers
                )
        );
        context.register(
                CITRINE_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(ModConfiguredFeatures.CITRINE_ORE_VEIN_CONFIGURED_KEY),
                        gemVeinModifiers
                )
        );
        context.register(
                AMETHYST_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(ModConfiguredFeatures.AMETHYST_ORE_VEIN_CONFIGURED_KEY),
                        gemVeinModifiers
                )
        );
        context.register(
                AQUAMARINE_ORE_PLACED_KEY,
                new PlacedFeature(
                        configuredFeatures.getOrThrow(ModConfiguredFeatures.AQUAMARINE_ORE_VEIN_CONFIGURED_KEY),
                        gemVeinModifiers
                )
        );
    }
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY =
          ResourceKey.create(
                  Registries.PLACED_FEATURE,
                  Identifier.fromNamespaceAndPath(MOD_ID, "ruby_ore_vein")
          );
    public static final ResourceKey<PlacedFeature> AQUAMARINE_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "aquamarine_ore_vein")
            );
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "sapphire_ore_vein")
            );
    public static final ResourceKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "topaz_ore_vein")
            );
    public static final ResourceKey<PlacedFeature> AMETHYST_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "amethyst_ore_vein")
            );
    public static final ResourceKey<PlacedFeature> SPINEL_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "spinel_ore_vein")
            );
    public static final ResourceKey<PlacedFeature> CITRINE_ORE_PLACED_KEY =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "citrine_ore_vein")
            );
}
