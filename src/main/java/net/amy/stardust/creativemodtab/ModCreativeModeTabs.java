package net.amy.stardust.creativemodtab;

import net.amy.stardust.Stardust;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static net.amy.stardust.Stardust.MOD_ID;
import static net.amy.stardust.block.ModBlocks.*;
import static net.amy.stardust.item.ModItems.*;
import static net.minecraft.world.item.Items.*;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeModeTabs {

    public static final CreativeModeTab STARDUST_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "stardust_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(STARDUST))
                    .title(Component.translatable("creativemodetab.stardust.stardust_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(UNREFINED_STARDUST);
                        output.accept(STARDUST);
                        output.accept(CRYSTALLISED_STARDUST);
                        output.accept(CRYSTALLISED_STARDUST_BLOCK);
                        output.accept(STARDUST_ORE);
                        output.accept(STARDUST_GLAIVE);

                        output.accept(STARDUST_RING);
                        output.accept(AMETHYST_STARDUST_RING);
                        output.accept(CITRINE_STARDUST_RING);
                        output.accept(DIAMOND_STARDUST_RING);
                        output.accept(EMERALD_STARDUST_RING);
                        output.accept(RUBY_STARDUST_RING);
                        output.accept(SAPPHIRE_STARDUST_RING);
                        output.accept(SPINEL_STARDUST_RING);
                        output.accept(TOPAZ_STARDUST_RING);




                    })

                    .build());

    public static final CreativeModeTab GEM_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "gem_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(RUBY))
                    .title(Component.translatable("creativemodetab.stardust.gem_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(AMETHYST);
                        output.accept(CITRINE);
                        output.accept(DIAMOND);
                        output.accept(EMERALD);
                        output.accept(RUBY);
                        output.accept(SAPPHIRE);
                        output.accept(SPINEL);
                        output.accept(TOPAZ);

                        output.accept(AMETHYST_ORE);
                        output.accept(CITRINE_ORE);
                        output.accept(DIAMOND_ORE);
                        output.accept(EMERALD_ORE);
                        output.accept(RUBY_ORE);
                        output.accept(SAPPHIRE_ORE);
                        output.accept(SPINEL_ORE);
                        output.accept(TOPAZ_ORE);

                        output.accept(DEEPSLATE_AMETHYST_ORE);
                        output.accept(DEEPSLATE_CITRINE_ORE);
                        output.accept(DEEPSLATE_DIAMOND_ORE);
                        output.accept(DEEPSLATE_EMERALD_ORE);
                        output.accept(DEEPSLATE_RUBY_ORE);
                        output.accept(DEEPSLATE_SAPPHIRE_ORE);
                        output.accept(DEEPSLATE_SPINEL_ORE);
                        output.accept(DEEPSLATE_TOPAZ_ORE);

                        output.accept(GOLD_RING);
                        output.accept(AMETHYST_GOLD_RING);
                        output.accept(CITRINE_GOLD_RING);
                        output.accept(DIAMOND_GOLD_RING);
                        output.accept(EMERALD_GOLD_RING);
                        output.accept(RUBY_GOLD_RING);
                        output.accept(SAPPHIRE_GOLD_RING);
                        output.accept(SPINEL_GOLD_RING);
                        output.accept(TOPAZ_GOLD_RING);
                        







                    })

                    .build());

    public static void registerModCreativeModeTabs() {
        Stardust.LOGGER.info("Registering Creative Mod Tabs for " + MOD_ID);
    }
}
