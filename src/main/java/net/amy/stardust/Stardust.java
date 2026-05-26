package net.amy.stardust;

import net.amy.stardust.block.ModBlocks;
import net.amy.stardust.creativemodtab.ModCreativeModeTabs;
import net.amy.stardust.item.ModItems;
import net.amy.stardust.particle.AmethystFlameParticle;
import net.amy.stardust.particle.ModParticles;
import net.amy.stardust.sounds.ModSoundEvents;
import net.amy.stardust.trim.ModTrimMaterials;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
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

		ParticleProviderRegistry.getInstance().register(ModParticles.AMETHYST_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.RUBY_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.SAPPHIRE_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.EMERALD_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.TOPAZ_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.CITRINE_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.SPINEL_FLAME, AmethystFlameParticle.Provider::new);
		ParticleProviderRegistry.getInstance().register(ModParticles.AQUAMARINE_FLAME, AmethystFlameParticle.Provider::new);


	}

}