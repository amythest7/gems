package net.amy.gems.creativemodtab;

import net.amy.gems.Gems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static net.amy.gems.Gems.MOD_ID;
import static net.amy.gems.block.ModBlocks.*;
import static net.amy.gems.block.ModBlocks.AMETHYST_TORCH;
import static net.amy.gems.block.ModBlocks.AQUAMARINE_TORCH;
import static net.amy.gems.block.ModBlocks.CITRINE_TORCH;
import static net.amy.gems.block.ModBlocks.EMERALD_TORCH;
import static net.amy.gems.block.ModBlocks.RUBY_TORCH;
import static net.amy.gems.block.ModBlocks.SAPPHIRE_TORCH;
import static net.amy.gems.block.ModBlocks.SPINEL_TORCH;
import static net.amy.gems.block.ModBlocks.TOPAZ_TORCH;
import static net.amy.gems.item.ModItems.*;
import static net.minecraft.world.item.Items.*;


public class ModCreativeModeTabs {

    public static final CreativeModeTab STARDUST_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "stardust_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(STARDUST))
                    .title(Component.translatable("creativemodetab.gems.stardust_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(UNREFINED_STARDUST);
                        output.accept(STARDUST);
                        output.accept(CRYSTALLISED_STARDUST);
                        output.accept(CRYSTALLISED_STARDUST_BLOCK);
                        output.accept(STARDUST_ORE);
                        output.accept(STARDUST_GLAIVE);

                        output.accept(STARDUST_RING);
                        output.accept(AMETHYST_STARDUST_RING);
                        output.accept(AQUAMARINE_STARDUST_RING);
                        output.accept(CITRINE_STARDUST_RING);
                        output.accept(DIAMOND_STARDUST_RING);
                        output.accept(EMERALD_STARDUST_RING);
                        output.accept(RUBY_STARDUST_RING);
                        output.accept(SAPPHIRE_STARDUST_RING);
                        output.accept(SPINEL_STARDUST_RING);
                        output.accept(TOPAZ_STARDUST_RING);


                        output.accept(STARDUST_LANTERN);

                        output.accept(MUSIC_DISC_DESTRUCTOR);




                    })

                    .build());

    public static final CreativeModeTab GEM_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "gem_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(RUBY))
                    .title(Component.translatable("creativemodetab.gems.gem_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(AMETHYST);
                        output.accept(AQUAMARINE);
                        output.accept(CITRINE);
                        output.accept(DIAMOND);
                        output.accept(EMERALD);
                        output.accept(RUBY);
                        output.accept(SAPPHIRE);
                        output.accept(SPINEL);
                        output.accept(TOPAZ);

                        output.accept(RAW_AMETHYST);
                        output.accept(RAW_AQUAMARINE);
                        output.accept(RAW_CITRINE);
                        output.accept(RAW_DIAMOND);
                        output.accept(RAW_EMERALD);
                        output.accept(RAW_RUBY);
                        output.accept(RAW_SAPPHIRE);
                        output.accept(RAW_SPINEL);
                        output.accept(RAW_TOPAZ);

                        output.accept(AMETHYST_GEM_BLOCK);
                        output.accept(AQUAMARINE_BLOCK);
                        output.accept(CITRINE_BLOCK);
                        output.accept(DIAMOND_BLOCK);
                        output.accept(EMERALD_BLOCK);
                        output.accept(RUBY_BLOCK);
                        output.accept(SAPPHIRE_BLOCK);
                        output.accept(SPINEL_BLOCK);
                        output.accept(TOPAZ_BLOCK);

                        output.accept(AMETHYST_ORE);
                        output.accept(AQUAMARINE_ORE);
                        output.accept(CITRINE_ORE);
                        output.accept(DIAMOND_ORE);
                        output.accept(EMERALD_ORE);
                        output.accept(RUBY_ORE);
                        output.accept(SAPPHIRE_ORE);
                        output.accept(SPINEL_ORE);
                        output.accept(TOPAZ_ORE);

                        output.accept(DEEPSLATE_AMETHYST_ORE);
                        output.accept(DEEPSLATE_AQUAMARINE_ORE);
                        output.accept(DEEPSLATE_CITRINE_ORE);
                        output.accept(DEEPSLATE_DIAMOND_ORE);
                        output.accept(DEEPSLATE_EMERALD_ORE);
                        output.accept(DEEPSLATE_RUBY_ORE);
                        output.accept(DEEPSLATE_SAPPHIRE_ORE);
                        output.accept(DEEPSLATE_SPINEL_ORE);
                        output.accept(DEEPSLATE_TOPAZ_ORE);

                        output.accept(AMETHYST_GOLD_RING);
                        output.accept(AQUAMARINE_GOLD_RING);
                        output.accept(CITRINE_GOLD_RING);
                        output.accept(DIAMOND_GOLD_RING);
                        output.accept(EMERALD_GOLD_RING);
                        output.accept(RUBY_GOLD_RING);
                        output.accept(SAPPHIRE_GOLD_RING);
                        output.accept(SPINEL_GOLD_RING);
                        output.accept(TOPAZ_GOLD_RING);

                        output.accept(AMETHYST_NETHERITE_RING);
                        output.accept(AQUAMARINE_NETHERITE_RING);
                        output.accept(CITRINE_NETHERITE_RING);
                        output.accept(DIAMOND_NETHERITE_RING);
                        output.accept(EMERALD_NETHERITE_RING);
                        output.accept(RUBY_NETHERITE_RING);
                        output.accept(SAPPHIRE_NETHERITE_RING);
                        output.accept(SPINEL_NETHERITE_RING);
                        output.accept(TOPAZ_NETHERITE_RING);

                        output.accept(AMETHYST_STARDUST_RING);
                        output.accept(AQUAMARINE_STARDUST_RING);
                        output.accept(CITRINE_STARDUST_RING);
                        output.accept(DIAMOND_STARDUST_RING);
                        output.accept(EMERALD_STARDUST_RING);
                        output.accept(RUBY_STARDUST_RING);
                        output.accept(SAPPHIRE_STARDUST_RING);
                        output.accept(SPINEL_STARDUST_RING);
                        output.accept(TOPAZ_STARDUST_RING);

                        output.accept(AMETHYST_TORCH);
                        output.accept(AQUAMARINE_TORCH);
                        output.accept(CITRINE_TORCH);
                        output.accept(EMERALD_TORCH);
                        output.accept(RUBY_TORCH);
                        output.accept(SAPPHIRE_TORCH);
                        output.accept(SPINEL_TORCH);
                        output.accept(TOPAZ_TORCH);

                        output.accept(AMETHYST_LANTERN);
                        output.accept(AQUAMARINE_LANTERN);
                        output.accept(CITRINE_LANTERN);
                        output.accept(EMERALD_LANTERN);
                        output.accept(RUBY_LANTERN);
                        output.accept(SAPPHIRE_LANTERN);
                        output.accept(SPINEL_LANTERN);
                        output.accept(TOPAZ_LANTERN);

                        output.accept(AMETHYST_HEART);
                        output.accept(AQUAMARINE_HEART);
                        output.accept(CITRINE_HEART);
                        output.accept(EMERALD_HEART);
                        output.accept(RUBY_HEART);
                        output.accept(SAPPHIRE_HEART);
                        output.accept(SPINEL_HEART);
                        output.accept(TOPAZ_HEART);

                        output.accept(OMEGA_HEART);
                        output.accept(GOLD_RING);
                        output.accept(NETHERITE_RING);
                        output.accept(STARDUST_RING);
                        output.accept(EMPTY_LANTERN);
                        output.accept(GEM_FACETER);




                    })

                    .build());

    public static final CreativeModeTab MUSIC_DISC_ITEMS_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "music_disc_items"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(MUSIC_DISC_CAT))
                    .title(Component.translatable("creativemodetab.gems.music_disc_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(MUSIC_DISC_WAIT);
                        output.accept(MUSIC_DISC_11);
                        output.accept(MUSIC_DISC_13);
                        output.accept(MUSIC_DISC_CAT);
                        output.accept(MUSIC_DISC_BLOCKS);
                        output.accept(MUSIC_DISC_CHIRP);
                        output.accept(MUSIC_DISC_FAR);
                        output.accept(MUSIC_DISC_MALL);
                        output.accept(MUSIC_DISC_MELLOHI);
                        output.accept(MUSIC_DISC_STAL);
                        output.accept(MUSIC_DISC_STRAD);
                        output.accept(MUSIC_DISC_WARD);

                        output.accept(MUSIC_DISC_PIGSTEP);

                        output.accept(MUSIC_DISC_OTHERSIDE);
                        output.accept(MUSIC_DISC_5);

                        output.accept(MUSIC_DISC_RELIC);

                        output.accept(MUSIC_DISC_CREATOR);
                        output.accept(MUSIC_DISC_CREATOR_MUSIC_BOX);
                        output.accept(MUSIC_DISC_DESTRUCTOR);
                        output.accept(MUSIC_DISC_PRECIPICE);

                        output.accept(MUSIC_DISC_LAVA_CHICKEN);
                        output.accept(MUSIC_DISC_TEARS);

                        output.accept(MUSIC_DISC_BOUNCE);
                    })
                    .build());

    public static void registerModCreativeModeTabs() {
        Gems.LOGGER.info("Registering Creative Mod Tabs for " + MOD_ID);
    }
}
