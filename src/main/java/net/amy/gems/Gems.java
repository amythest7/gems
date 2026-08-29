package net.amy.gems;

import net.amy.gems.block.ModBlocks;
import net.amy.gems.block.entity.ModBlockEntities;
import net.amy.gems.creativemodtab.ModCreativeModeTabs;
import net.amy.gems.item.ModItems;
import net.amy.gems.menu.ModMenuTypes;
import net.amy.gems.networking.ModPackets;
import net.amy.gems.particle.ModParticles;
import net.amy.gems.recipe.ModRecipes;
import net.amy.gems.sounds.ModSoundEvents;
import net.amy.gems.worldgen.ModPlacedFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Predicate;

public class Gems implements ModInitializer {
	public static final String MOD_ID = "gems";

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


