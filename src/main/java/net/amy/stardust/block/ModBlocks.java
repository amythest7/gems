package net.amy.stardust.block;

import net.amy.stardust.Stardust;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

import static net.amy.stardust.Stardust.MOD_ID;

public class ModBlocks {

    public static final Block CRYSTALLISED_STARDUST_BLOCK = registerBlock("crystallised_stardust_block", properties -> new Block(properties.strength(4f)
            .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block STARDUST_ORE = registerBlock("stardust_ore", properties -> new DropExperienceBlock(
            UniformInt.of(2, 3),
            properties.strength(6.0f, 3.0f)
            .requiresCorrectToolForDrops()));

    public static final Block RUBY_ORE = registerBlock("ruby_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(3.0f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(4.5f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(3.0f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(4.5f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block AMETHYST_ORE = registerBlock("amethyst_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(3.0f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block DEEPSLATE_AMETHYST_ORE = registerBlock("deepslate_amethyst_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(4.5f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block TOPAZ_ORE = registerBlock("topaz_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(3.0f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(4.5f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block CITRINE_ORE = registerBlock("citrine_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(3.0f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(4.5f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block SPINEL_ORE = registerBlock("spinel_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(3.0f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block DEEPSLATE_SPINEL_ORE = registerBlock("deepslate_spinel_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(4.5f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(3.0f, 3.0f)
                    .requiresCorrectToolForDrops()));

    public static final Block DEEPSLATE_AQUAMARINE_ORE = registerBlock("deepslate_aquamarine_ore", properties -> new DropExperienceBlock(
            UniformInt.of(3, 7),
            properties.strength(4.5f, 3.0f)
                    .requiresCorrectToolForDrops()));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Stardust.LOGGER.info("Registering Mod Blocks for " + MOD_ID);
    }
}
