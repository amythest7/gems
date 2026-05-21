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
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

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

    public static final Block STARDUST_LANTERN = registerBlock(
            "stardust_lantern",
            properties -> new LanternBlock(
                    properties.mapColor(MapColor.METAL)
                    .forceSolidOn()
                    .strength(3.5F)
                    .sound(SoundType.LANTERN)
                    .lightLevel(statex -> 15)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block RUBY_LANTERN = registerBlock(
            "ruby_lantern",
            properties -> new LanternBlock(
                    properties.mapColor(MapColor.METAL)
                            .forceSolidOn()
                            .strength(3.5F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(statex -> 15)
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block SAPPHIRE_LANTERN = registerBlock(
            "sapphire_lantern",
            properties -> new LanternBlock(
                    properties.mapColor(MapColor.METAL)
                            .forceSolidOn()
                            .strength(3.5F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(statex -> 15)
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block TOPAZ_LANTERN = registerBlock(
            "topaz_lantern",
            properties -> new LanternBlock(
                    properties.mapColor(MapColor.METAL)
                            .forceSolidOn()
                            .strength(3.5F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(statex -> 15)
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block CITRINE_LANTERN = registerBlock(
            "citrine_lantern",
            properties -> new LanternBlock(
                    properties.mapColor(MapColor.METAL)
                            .forceSolidOn()
                            .strength(3.5F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(statex -> 15)
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block SPINEL_LANTERN = registerBlock(
            "spinel_lantern",
            properties -> new LanternBlock(
                    properties.mapColor(MapColor.METAL)
                            .forceSolidOn()
                            .strength(3.5F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(statex -> 15)
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)));

    public static final Block AQUAMARINE_LANTERN = registerBlock(
            "aquamarine_lantern",
            properties -> new LanternBlock(
                    properties.mapColor(MapColor.METAL)
                            .forceSolidOn()
                            .strength(3.5F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(statex -> 15)
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)));

    public static final Block AMETHYST_LANTERN = registerBlock(
            "amethyst_lantern",
            properties -> new LanternBlock(
                    properties.mapColor(MapColor.METAL)
                            .forceSolidOn()
                            .strength(3.5F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(statex -> 15)
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)));

    public static final Block EMPTY_LANTERN = registerBlock(
            "empty_lantern",
            properties -> new LanternBlock(
                    properties.mapColor(MapColor.METAL)
                            .forceSolidOn()
                            .strength(3.5F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(statex -> 0)
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)));

    public static final Block EMERALD_LANTERN = registerBlock(
            "emerald_lantern",
            properties -> new LanternBlock(
                    properties.mapColor(MapColor.METAL)
                            .forceSolidOn()
                            .strength(3.5F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(statex -> 15)
                            .noOcclusion()
                            .pushReaction(PushReaction.DESTROY)));


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
