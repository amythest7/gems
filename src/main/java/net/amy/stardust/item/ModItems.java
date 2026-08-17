package net.amy.stardust.item;

import net.amy.stardust.Stardust;
import net.amy.stardust.block.ModBlocks;
import net.amy.stardust.item.custom.*;
import net.amy.stardust.sounds.ModSoundEvents;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.AttackRange;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;
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

    public static Item RUBY_HEART = registerItem("ruby_heart", properties -> new SoulItem(properties.stacksTo(1)));
    public static Item SAPPHIRE_HEART = registerItem("sapphire_heart", properties -> new SoulItem(properties.stacksTo(1)));
    public static Item TOPAZ_HEART = registerItem("topaz_heart", properties -> new SoulItem(properties.stacksTo(1)));
    public static Item AMETHYST_HEART = registerItem("amethyst_heart", properties -> new SoulItem(properties.stacksTo(1)));
    public static Item CITRINE_HEART = registerItem("citrine_heart", properties -> new SoulItem(properties.stacksTo(1)));
    public static Item SPINEL_HEART = registerItem("spinel_heart", properties -> new SoulItem(properties.stacksTo(1)));
    public static Item AQUAMARINE_HEART = registerItem("aquamarine_heart", properties -> new SoulItem(properties.stacksTo(1)));
    public static Item EMERALD_HEART = registerItem("emerald_heart", properties -> new SoulItem(properties.stacksTo(1)));
    public static Item OMEGA_HEART = registerItem("omega_heart", properties -> new SoulItem(properties.stacksTo(1)));
    
    public static final Item AMETHYST_TORCH = registerItem( "amethyst_torch", properties ->
            new StandingAndWallBlockItem(
                    ModBlocks.AMETHYST_TORCH,
                    ModBlocks.AMETHYST_WALL_TORCH,
                    Direction.DOWN ,
                    properties));
    public static final Item RUBY_TORCH = registerItem( "ruby_torch", properties ->
            new StandingAndWallBlockItem(
                    ModBlocks.RUBY_TORCH,
                    ModBlocks.RUBY_WALL_TORCH,
                    Direction.DOWN ,
                    properties));
    public static final Item SAPPHIRE_TORCH = registerItem( "sapphire_torch", properties ->
            new StandingAndWallBlockItem(
                    ModBlocks.SAPPHIRE_TORCH,
                    ModBlocks.SAPPHIRE_WALL_TORCH,
                    Direction.DOWN ,
                    properties));
    public static final Item EMERALD_TORCH = registerItem( "emerald_torch", properties ->
            new StandingAndWallBlockItem(
                    ModBlocks.EMERALD_TORCH,
                    ModBlocks.EMERALD_WALL_TORCH,
                    Direction.DOWN ,
                    properties));
    public static final Item TOPAZ_TORCH = registerItem( "topaz_torch", properties ->
            new StandingAndWallBlockItem(
                    ModBlocks.TOPAZ_TORCH,
                    ModBlocks.TOPAZ_WALL_TORCH,
                    Direction.DOWN ,
                    properties));
    public static final Item SPINEL_TORCH = registerItem( "spinel_torch", properties ->
            new StandingAndWallBlockItem(
                    ModBlocks.SPINEL_TORCH,
                    ModBlocks.SPINEL_WALL_TORCH,
                    Direction.DOWN ,
                    properties));
    public static final Item CITRINE_TORCH = registerItem( "citrine_torch", properties ->
            new StandingAndWallBlockItem(
                    ModBlocks.CITRINE_TORCH,
                    ModBlocks.CITRINE_WALL_TORCH,
                    Direction.DOWN ,
                    properties));
    public static final Item AQUAMARINE_TORCH = registerItem( "aquamarine_torch", properties ->
            new StandingAndWallBlockItem(
                    ModBlocks.AQUAMARINE_TORCH,
                    ModBlocks.AQUAMARINE_WALL_TORCH,
                    Direction.DOWN ,
                    properties));
    

    public static Item GOLD_RING = registerItem("gold_ring", GoldRingItem::new);
    public static Item RUBY_GOLD_RING = registerItem("gold_ring_ruby", properties -> new GoldRingItem(properties.stacksTo(1), MobEffects.REGENERATION) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.gold_ring_ruby"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item SAPPHIRE_GOLD_RING = registerItem("gold_ring_sapphire", properties -> new GoldRingItem(properties, MobEffects.NIGHT_VISION){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.gold_ring_sapphire"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item TOPAZ_GOLD_RING = registerItem("gold_ring_topaz", properties -> new GoldRingItem(properties, MobEffects.HASTE){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.gold_ring_topaz"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item AMETHYST_GOLD_RING = registerItem("gold_ring_amethyst", properties -> new GoldRingItem(properties, MobEffects.ABSORPTION){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.gold_ring_amethyst"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item CITRINE_GOLD_RING = registerItem("gold_ring_citrine", properties -> new GoldRingItem(properties, MobEffects.FIRE_RESISTANCE){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.gold_ring_citrine"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item SPINEL_GOLD_RING = registerItem("gold_ring_spinel", properties -> new GoldRingItem(properties, MobEffects.SATURATION){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.gold_ring_spinel"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item EMERALD_GOLD_RING = registerItem("gold_ring_emerald", properties -> new GoldRingItem(properties, MobEffects.HERO_OF_THE_VILLAGE){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.gold_ring_emerald"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item DIAMOND_GOLD_RING = registerItem("gold_ring_diamond", properties -> new GoldRingItem(properties, MobEffects.SPEED){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.gold_ring_diamond"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });

    public static Item STARDUST_RING = registerItem("stardust_ring", StardustRingItem::new);
    public static Item RUBY_STARDUST_RING = registerItem("stardust_ring_ruby", properties -> new StardustRingItem(properties, MobEffects.REGENERATION) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.stardust_ring_ruby"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item SAPPHIRE_STARDUST_RING = registerItem("stardust_ring_sapphire", properties -> new StardustRingItem(properties, MobEffects.NIGHT_VISION){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.stardust_ring_sapphire"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item TOPAZ_STARDUST_RING = registerItem("stardust_ring_topaz", properties -> new StardustRingItem(properties, MobEffects.HASTE){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.stardust_ring_topaz"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item AMETHYST_STARDUST_RING = registerItem("stardust_ring_amethyst", properties -> new StardustRingItem(properties, MobEffects.ABSORPTION){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.stardust_ring_amethyst"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item CITRINE_STARDUST_RING = registerItem("stardust_ring_citrine", properties -> new StardustRingItem(properties, MobEffects.FIRE_RESISTANCE){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.stardust_ring_citrine"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item SPINEL_STARDUST_RING = registerItem("stardust_ring_spinel", properties -> new StardustRingItem(properties, MobEffects.SATURATION){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.stardust_ring_spinel"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item EMERALD_STARDUST_RING = registerItem("stardust_ring_emerald", properties -> new StardustRingItem(properties, MobEffects.HERO_OF_THE_VILLAGE){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.stardust_ring_emerald"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item DIAMOND_STARDUST_RING = registerItem("stardust_ring_diamond", properties -> new StardustRingItem(properties, MobEffects.SPEED){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.stardust_ring_diamond"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item NETHERITE_RING = registerItem("netherite_ring", NetheriteRingItem::new);
    public static Item RUBY_NETHERITE_RING = registerItem("netherite_ring_ruby", properties -> new NetheriteRingItem(properties, MobEffects.REGENERATION) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.netherite_ring_ruby"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item SAPPHIRE_NETHERITE_RING = registerItem("netherite_ring_sapphire", properties -> new NetheriteRingItem(properties, MobEffects.NIGHT_VISION){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.netherite_ring_sapphire"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item TOPAZ_NETHERITE_RING = registerItem("netherite_ring_topaz", properties -> new NetheriteRingItem(properties, MobEffects.HASTE){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.netherite_ring_topaz"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item AMETHYST_NETHERITE_RING = registerItem("netherite_ring_amethyst", properties -> new NetheriteRingItem(properties, MobEffects.ABSORPTION){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.netherite_ring_amethyst"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item CITRINE_NETHERITE_RING = registerItem("netherite_ring_citrine", properties -> new NetheriteRingItem(properties, MobEffects.FIRE_RESISTANCE){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.netherite_ring_citrine"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item SPINEL_NETHERITE_RING = registerItem("netherite_ring_spinel", properties -> new NetheriteRingItem(properties, MobEffects.SATURATION){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.netherite_ring_spinel"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item EMERALD_NETHERITE_RING = registerItem("netherite_ring_emerald", properties -> new NetheriteRingItem(properties, MobEffects.HERO_OF_THE_VILLAGE){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.netherite_ring_emerald"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item DIAMOND_NETHERITE_RING = registerItem("netherite_ring_diamond", properties -> new NetheriteRingItem(properties, MobEffects.SPEED){
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.netherite_ring_diamond"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item AQUAMARINE_GOLD_RING = registerItem("gold_ring_aquamarine", properties -> new GoldRingItem(properties, MobEffects.WATER_BREATHING) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.gold_ring_aquamarine"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item AQUAMARINE_NETHERITE_RING = registerItem("netherite_ring_aquamarine", properties -> new NetheriteRingItem(properties, MobEffects.WATER_BREATHING) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.netherite_ring_aquamarine"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item AQUAMARINE_STARDUST_RING = registerItem("stardust_ring_aquamarine", properties -> new StardustRingItem(properties, MobEffects.WATER_BREATHING) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display,
                                    Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.stardust.stardust_ring_aquamarine"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static Item MUSIC_DISC_DESTRUCTOR = registerItem("music_disc_destructor", properties -> new Item(properties.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.DESTRUCTOR)));
    public static Item MUSIC_DISC_INFINITE_AMETHYST = registerItem("music_disc_infinite_amethyst", properties -> new Item(properties.stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(ModJukeboxSongs.INFINITE_AMETHYST)));
    
    public static Item STARDUST_GLAIVE = registerItem("stardust_glaive", properties -> new GlaiveItem(
            ModToolMaterial.STARDUST, 6f, -2.6f, 0.5f, properties
            .attributes(GlaiveItem.createAttributes(ModToolMaterial.STARDUST, 6f, -2.6f, 0.5f))
            .durability(ModToolMaterial.STARDUST.durability())
            .component(DataComponents.ATTACK_RANGE, new AttackRange(2.0F, 4.5F, 2.0F, 6.5F, 0.125F, 0.5F))
            .rarity(Rarity.RARE)
            .stacksTo(1)
            ));


    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }


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
