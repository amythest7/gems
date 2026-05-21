package net.amy.stardust.item;

import net.amy.stardust.Stardust;
import net.amy.stardust.item.custom.GlaiveItem;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ToolMaterial;

import java.util.function.Function;

import static net.amy.stardust.Stardust.MOD_ID;

public class ModItems {

    public static Item STARDUST = registerItem("stardust", Item::new);
    public static Item UNREFINED_STARDUST = registerItem("unrefined_stardust", Item::new);
    public static Item CRYSTALLISED_STARDUST = registerItem("crystallised_stardust", Item::new);

    public static Item RUBY = registerItem("ruby", Item::new);
    public static Item SAPPHIRE = registerItem("sapphire", Item::new);
    public static Item TOPAZ = registerItem("topaz", Item::new);
    public static Item AMETHYST = registerItem("amethyst", Item::new);
    public static Item CITRINE = registerItem("citrine", Item::new);
    public static Item SPINEL = registerItem("spinel", Item::new);
    public static Item AQUAMARINE = registerItem("aquamarine", Item::new);

    public static Item GOLD_RING = registerItem("gold_ring", Item::new);
    public static Item RUBY_GOLD_RING = registerItem("gold_ring_ruby", Item::new);
    public static Item SAPPHIRE_GOLD_RING = registerItem("gold_ring_sapphire", Item::new);
    public static Item TOPAZ_GOLD_RING = registerItem("gold_ring_topaz", Item::new);
    public static Item AMETHYST_GOLD_RING = registerItem("gold_ring_amethyst", Item::new);
    public static Item CITRINE_GOLD_RING = registerItem("gold_ring_citrine", Item::new);
    public static Item SPINEL_GOLD_RING = registerItem("gold_ring_spinel", Item::new);
    public static Item EMERALD_GOLD_RING = registerItem("gold_ring_emerald", Item::new);
    public static Item DIAMOND_GOLD_RING = registerItem("gold_ring_diamond", Item::new);

    public static Item STARDUST_RING = registerItem("stardust_ring", Item::new);
    public static Item RUBY_STARDUST_RING = registerItem("stardust_ring_ruby", Item::new);
    public static Item SAPPHIRE_STARDUST_RING = registerItem("stardust_ring_sapphire", Item::new);
    public static Item TOPAZ_STARDUST_RING = registerItem("stardust_ring_topaz", Item::new);
    public static Item AMETHYST_STARDUST_RING = registerItem("stardust_ring_amethyst", Item::new);
    public static Item CITRINE_STARDUST_RING = registerItem("stardust_ring_citrine", Item::new);
    public static Item SPINEL_STARDUST_RING = registerItem("stardust_ring_spinel", Item::new);
    public static Item EMERALD_STARDUST_RING = registerItem("stardust_ring_emerald", Item::new);
    public static Item DIAMOND_STARDUST_RING = registerItem("stardust_ring_diamond", Item::new);

    public static Item NETHERITE_RING = registerItem("netherite_ring", Item::new);
    public static Item RUBY_NETHERITE_RING = registerItem("netherite_ring_ruby", Item::new);
    public static Item SAPPHIRE_NETHERITE_RING = registerItem("netherite_ring_sapphire", Item::new);
    public static Item TOPAZ_NETHERITE_RING = registerItem("netherite_ring_topaz", Item::new);
    public static Item AMETHYST_NETHERITE_RING = registerItem("netherite_ring_amethyst", Item::new);
    public static Item CITRINE_NETHERITE_RING = registerItem("netherite_ring_citrine", Item::new);
    public static Item SPINEL_NETHERITE_RING = registerItem("netherite_ring_spinel", Item::new);
    public static Item EMERALD_NETHERITE_RING = registerItem("netherite_ring_emerald", Item::new);
    public static Item DIAMOND_NETHERITE_RING = registerItem("netherite_ring_diamond", Item::new);

    public static Item AQUAMARINE_GOLD_RING = registerItem("gold_ring_aquamarine", Item::new);
    public static Item AQUAMARINE_STARDUST_RING = registerItem("stardust_ring_aquamarine", Item::new);
    public static Item AQUAMARINE_NETHERITE_RING = registerItem("netherite_ring_aquamarine", Item::new);

    public static Item STARDUST_GLAIVE = registerItem("stardust_glaive", properties -> new GlaiveItem(
            ToolMaterial.DIAMOND, 6f, -2.6f, properties
            .attributes(GlaiveItem.createAttributes(ToolMaterial.DIAMOND,6, -2.6f, 0.5f))
            .durability(ToolMaterial.DIAMOND.durability())
            .rarity(Rarity.RARE)
            ));





    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(
                BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name),
                function.apply(new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name)))));
    }

    public static void registerModItems() {
        Stardust.LOGGER.info("Registering Mod Items for " + MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(UNREFINED_STARDUST);
            output.accept(STARDUST);
            output.accept(CRYSTALLISED_STARDUST);

            output.accept(RUBY);
            output.accept(CITRINE);
            output.accept(TOPAZ);
            output.accept(AQUAMARINE);
            output.accept(SAPPHIRE);
            output.accept(AMETHYST);
            output.accept(SPINEL);


        });
    }

}
