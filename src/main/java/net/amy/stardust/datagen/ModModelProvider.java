package net.amy.stardust.datagen;

import net.amy.stardust.trim.ModTrimMaterials;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterials;

import java.util.List;

import static net.amy.stardust.block.ModBlocks.*;
import static net.amy.stardust.item.ModItems.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(CRYSTALLISED_STARDUST_BLOCK);
        blockModelGenerators.createTrivialCube(STARDUST_ORE);

        blockModelGenerators.createTrivialCube(RUBY_ORE);
        blockModelGenerators.createTrivialCube(SAPPHIRE_ORE);
        blockModelGenerators.createTrivialCube(DEEPSLATE_RUBY_ORE);
        blockModelGenerators.createTrivialCube(DEEPSLATE_SAPPHIRE_ORE);
        blockModelGenerators.createTrivialCube(TOPAZ_ORE);
        blockModelGenerators.createTrivialCube(AMETHYST_ORE);
        blockModelGenerators.createTrivialCube(DEEPSLATE_TOPAZ_ORE);
        blockModelGenerators.createTrivialCube(DEEPSLATE_AMETHYST_ORE);
        blockModelGenerators.createTrivialCube(CITRINE_ORE);
        blockModelGenerators.createTrivialCube(DEEPSLATE_CITRINE_ORE);
        blockModelGenerators.createTrivialCube(SPINEL_ORE);
        blockModelGenerators.createTrivialCube(DEEPSLATE_SPINEL_ORE);
        blockModelGenerators.createTrivialCube(AQUAMARINE_ORE);
        blockModelGenerators.createTrivialCube(DEEPSLATE_AQUAMARINE_ORE);

        blockModelGenerators.createLantern(STARDUST_LANTERN);
        blockModelGenerators.createLantern(RUBY_LANTERN);
        blockModelGenerators.createLantern(SAPPHIRE_LANTERN);
        blockModelGenerators.createLantern(TOPAZ_LANTERN);
        blockModelGenerators.createLantern(CITRINE_LANTERN);
        blockModelGenerators.createLantern(EMERALD_LANTERN);
        blockModelGenerators.createLantern(EMPTY_LANTERN);
        blockModelGenerators.createLantern(AMETHYST_LANTERN);
        blockModelGenerators.createLantern(AQUAMARINE_LANTERN);
        blockModelGenerators.createLantern(SPINEL_LANTERN);
        
        blockModelGenerators.createTrivialCube(RUBY_BLOCK);
        blockModelGenerators.createTrivialCube(SAPPHIRE_BLOCK);
        blockModelGenerators.createTrivialCube(TOPAZ_BLOCK);
        blockModelGenerators.createTrivialCube(CITRINE_BLOCK);
        blockModelGenerators.createTrivialCube(AQUAMARINE_BLOCK);
        blockModelGenerators.createTrivialCube(SPINEL_BLOCK);
        blockModelGenerators.createTrivialCube(AMETHYST_GEM_BLOCK);


    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(STARDUST, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(UNREFINED_STARDUST, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(CRYSTALLISED_STARDUST, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(STARDUST_GLAIVE, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TOPAZ, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(AMETHYST, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(CITRINE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SPINEL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(AQUAMARINE, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(RUBY_GOLD_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SAPPHIRE_GOLD_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TOPAZ_GOLD_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(AMETHYST_GOLD_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(CITRINE_GOLD_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SPINEL_GOLD_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(GOLD_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EMERALD_GOLD_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(DIAMOND_GOLD_RING, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(RUBY_STARDUST_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SAPPHIRE_STARDUST_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TOPAZ_STARDUST_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(AMETHYST_STARDUST_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(CITRINE_STARDUST_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SPINEL_STARDUST_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(STARDUST_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EMERALD_STARDUST_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(DIAMOND_STARDUST_RING, ModelTemplates.FLAT_ITEM);
        
        itemModelGenerators.generateFlatItem(RUBY_NETHERITE_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SAPPHIRE_NETHERITE_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(TOPAZ_NETHERITE_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(AMETHYST_NETHERITE_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(CITRINE_NETHERITE_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SPINEL_NETHERITE_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(NETHERITE_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(EMERALD_NETHERITE_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(DIAMOND_NETHERITE_RING, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(AQUAMARINE_GOLD_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(AQUAMARINE_NETHERITE_RING, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(AQUAMARINE_STARDUST_RING, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(MUSIC_DISC_DESTRUCTOR, ModelTemplates.MUSIC_DISC);
        

    }
}
