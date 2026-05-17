package net.amy.stardust;

import net.amy.stardust.block.ModBlocks;
import net.amy.stardust.creativemodtab.ModCreativeModeTabs;
import net.amy.stardust.item.ModItems;
import net.fabricmc.api.ModInitializer;

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
		//Registries.TRIM_MATERIAL, ModTrimMaterials::bootstrap;

	}
}