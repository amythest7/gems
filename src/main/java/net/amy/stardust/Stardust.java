package net.amy.stardust;

import net.amy.stardust.block.ModBlocks;
import net.amy.stardust.block.entity.ModBlockEntities;
import net.amy.stardust.creativemodtab.ModCreativeModeTabs;
import net.amy.stardust.item.ModItems;
import net.amy.stardust.menu.ModMenuTypes;
import net.amy.stardust.networking.ModPackets;
import net.amy.stardust.particle.ModParticles;
import net.amy.stardust.recipe.ModRecipes;
import net.amy.stardust.sounds.ModSoundEvents;
import net.amy.stardust.worldgen.ModPlacedFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.recipe.v1.sync.RecipeSynchronization;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Predicate;

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
		ModBlockEntities.registerBlockEntities();
		ModMenuTypes.registerModMenuTypes();
		ModRecipes.registerModRecipes();

		oreBiomeModifications(BiomeSelectors.foundInOverworld(), ModPlacedFeatures.RUBY_ORE_PLACED_KEY);
		oreBiomeModifications(BiomeSelectors.foundInOverworld(), ModPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);
		oreBiomeModifications(BiomeSelectors.foundInOverworld(), ModPlacedFeatures.TOPAZ_ORE_PLACED_KEY);
		oreBiomeModifications(BiomeSelectors.foundInOverworld(), ModPlacedFeatures.CITRINE_ORE_PLACED_KEY);
		oreBiomeModifications(BiomeSelectors.foundInOverworld(), ModPlacedFeatures.SPINEL_ORE_PLACED_KEY);
		oreBiomeModifications(BiomeSelectors.foundInOverworld(), ModPlacedFeatures.AQUAMARINE_ORE_PLACED_KEY);
		oreBiomeModifications(BiomeSelectors.foundInOverworld(), ModPlacedFeatures.AMETHYST_ORE_PLACED_KEY);
		oreBiomeModifications(BiomeSelectors.foundInTheEnd(), ModPlacedFeatures.STARDUST_ORE_PLACED_KEY);

		//RecipeSynchronization.synchronizeRecipeSerializer(ModRecipes.GEM_FACETING_RECIPE_SERIALIZER);
		//Minecraft.getInstance().level.recipeAccess().getSynchronizedRecipes().getAllOfType(ModRecipes.GEM_FACETING_RECIPE_TYPE);


	}

	private static void oreBiomeModifications(Predicate<BiomeSelectionContext> biome , ResourceKey<PlacedFeature> featureKey) {
		BiomeModifications.addFeature(
				biome,
				GenerationStep.Decoration.UNDERGROUND_ORES,
				featureKey
		);
	}




}


