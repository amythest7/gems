package net.amy.stardust.block;

import net.amy.stardust.Stardust;
import net.amy.stardust.particle.ModParticles;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
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

    public static final Block RUBY_BLOCK = registerBlock(
            "ruby_block", properties -> new Block(properties
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BANJO)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL))
    );

    public static final Block SAPPHIRE_BLOCK = registerBlock(
            "sapphire_block", properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLUE)
                    .instrument(NoteBlockInstrument.BANJO)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL))
    );

    public static final Block TOPAZ_BLOCK = registerBlock(
            "topaz_block", properties -> new Block(properties
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BANJO)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL))
    );

    public static final Block CITRINE_BLOCK = registerBlock(
            "citrine_block", properties -> new Block(properties
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BANJO)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL))
    );
    public static final Block AQUAMARINE_BLOCK = registerBlock(
            "aquamarine_block", properties -> new Block(properties
                    .mapColor(MapColor.COLOR_CYAN)
                    .instrument(NoteBlockInstrument.BANJO)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL))
    );
    public static final Block SPINEL_BLOCK = registerBlock(
            "spinel_block", properties -> new Block(properties
                    .mapColor(MapColor.COLOR_PINK)
                    .instrument(NoteBlockInstrument.BANJO)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL))
    );

    public static final Block AMETHYST_GEM_BLOCK = registerBlock(
            "amethyst_gem_block", properties -> new Block(properties
                    .mapColor(MapColor.COLOR_PURPLE)
                    .instrument(NoteBlockInstrument.BANJO)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.AMETHYST))
    );


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

    public static final Block AMETHYST_TORCH = registerBlockWithoutItem(
            "amethyst_torch", properties -> new TorchBlock(ModParticles.AMETHYST_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));

    public static final Block RUBY_TORCH = registerBlockWithoutItem(
            "ruby_torch",
            properties -> new TorchBlock(ModParticles.RUBY_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block SAPPHIRE_TORCH = registerBlockWithoutItem(
            "sapphire_torch",
            properties -> new TorchBlock(ModParticles.SAPPHIRE_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block TOPAZ_TORCH = registerBlockWithoutItem(
            "topaz_torch",
            properties -> new TorchBlock(ModParticles.TOPAZ_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block CITRINE_TORCH = registerBlockWithoutItem(
            "citrine_torch",
            properties -> new TorchBlock(ModParticles.CITRINE_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block SPINEL_TORCH = registerBlockWithoutItem(
            "spinel_torch",
            properties -> new TorchBlock(ModParticles.SPINEL_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));

    public static final Block AQUAMARINE_TORCH = registerBlockWithoutItem(
            "aquamarine_torch",
            properties -> new TorchBlock(ModParticles.AQUAMARINE_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));


    public static final Block EMERALD_TORCH = registerBlockWithoutItem(
            "emerald_torch",
            properties -> new TorchBlock(ModParticles.EMERALD_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));

    public static final Block AMETHYST_WALL_TORCH = registerBlock(
            "amethyst_wall_torch", properties -> new WallTorchBlock(ModParticles.AMETHYST_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));

    public static final Block RUBY_WALL_TORCH = registerBlock(
            "ruby_wall_torch", properties -> new WallTorchBlock(ModParticles.RUBY_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)) );
    public static final Block SAPPHIRE_WALL_TORCH = registerBlock(
            "sapphire_wall_torch", properties -> new WallTorchBlock(ModParticles.SAPPHIRE_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block TOPAZ_WALL_TORCH = registerBlock(
            "topaz_wall_torch", properties -> new WallTorchBlock(ModParticles.TOPAZ_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block CITRINE_WALL_TORCH = registerBlock(
            "citrine_wall_torch", properties -> new WallTorchBlock(ModParticles.CITRINE_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block SPINEL_WALL_TORCH = registerBlock(
            "spinel_wall_torch", properties -> new WallTorchBlock(ModParticles.SPINEL_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));

    public static final Block AQUAMARINE_WALL_TORCH = registerBlock(
            "aquamarine_wall_torch", properties -> new WallTorchBlock(ModParticles.AQUAMARINE_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));


    public static final Block EMERALD_WALL_TORCH = registerBlock(
            "emerald_wall_torch", properties -> new WallTorchBlock(ModParticles.EMERALD_FLAME,
                    properties.noCollision()
                            .instabreak()
                            .lightLevel(statex -> 14)
                            .sound(SoundType.WOOD)
                            .pushReaction(PushReaction.DESTROY)));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name))));
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name), toRegister);
    }

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
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
