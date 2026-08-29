package net.amy.gems;

import net.amy.gems.datagen.*;
import net.amy.gems.datagen.advancement.ModAdvancementsProvider;
import net.amy.gems.worldgen.ModConfiguredFeatures;
import net.amy.gems.worldgen.ModPlacedFeatures;
import net.amy.gems.worldgen.ModWorldgenProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class GemsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModRegistryDataGenerator::new);
		pack.addProvider(ModWorldgenProvider::new);
		pack.addProvider(ModAdvancementsProvider::new);

	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		DataGeneratorEntrypoint.super.buildRegistry(registryBuilder);

		registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::configure);
		registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::configure);
	}

}
