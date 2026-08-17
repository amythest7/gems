package net.amy.stardust;

import net.amy.stardust.datagen.*;
import net.amy.stardust.datagen.advancement.ModAdvancementsProvider;
import net.amy.stardust.worldgen.ModConfiguredFeatures;
import net.amy.stardust.worldgen.ModPlacedFeatures;
import net.amy.stardust.worldgen.ModWorldgenProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class StardustDataGenerator implements DataGeneratorEntrypoint {
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
