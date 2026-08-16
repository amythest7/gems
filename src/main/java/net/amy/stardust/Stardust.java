package net.amy.stardust;

import net.amy.stardust.block.ModBlocks;
import net.amy.stardust.creativemodtab.ModCreativeModeTabs;
import net.amy.stardust.item.ModItems;
import net.amy.stardust.keymapping.ModKeyMappings;
import net.amy.stardust.networking.ModPackets;
import net.amy.stardust.particle.AmethystFlameParticle;
import net.amy.stardust.particle.ModParticles;
import net.amy.stardust.sounds.ModSoundEvents;
import net.amy.stardust.trim.ModTrimMaterials;
import net.amy.stardust.worldgen.ModPlacedFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stardust implements ModInitializer {
	public static final String MOD_ID = "stardust";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSoundEvents.registerSounds();
		ModParticles.registerParticles();
		ModPackets.registerPackets();

		ParticleProviderRegistry.getInstance().register(ModParticles.AMETHYST_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.RUBY_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.SAPPHIRE_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.EMERALD_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.TOPAZ_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.CITRINE_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.SPINEL_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.AQUAMARINE_FLAME, AmethystFlameParticle.Provider::new);

		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModPlacedFeatures.RUBY_ORE_PLACED_KEY
		);
		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY
		);
		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModPlacedFeatures.SPINEL_ORE_PLACED_KEY
		);
		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModPlacedFeatures.AMETHYST_ORE_PLACED_KEY
		);
		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModPlacedFeatures.AQUAMARINE_ORE_PLACED_KEY
		);
		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModPlacedFeatures.CITRINE_ORE_PLACED_KEY
		);
		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModPlacedFeatures.TOPAZ_ORE_PLACED_KEY
		);
		BiomeModifications.addFeature(
				BiomeSelectors.foundInTheEnd(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModPlacedFeatures.STARDUST_ORE_PLACED_KEY
		);
	}

}