package net.amy.gems.datagen.advancement;

import eu.pb4.trinkets.api.TrinketsApi;
import net.amy.gems.item.ModItems;
import net.amy.gems.item.custom.RingItem;
import net.amy.gems.item.custom.SoulItem;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.advancements.triggers.InventoryChangeTrigger;
import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.data.advancements.AdvancementSubProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import static net.amy.gems.Gems.MOD_ID;

public class ModAdvancementsProvider extends AdvancementProvider {
    public ModAdvancementsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, List.of(new GemsAdvancements()));
    }


    public static class GemsAdvancements implements AdvancementSubProvider {



        public static List<Item> RINGS = List.of(ModItems.RUBY_GOLD_RING, ModItems.SAPPHIRE_GOLD_RING, ModItems.EMERALD_GOLD_RING, ModItems.DIAMOND_GOLD_RING, ModItems.AMETHYST_GOLD_RING, ModItems.AQUAMARINE_GOLD_RING, ModItems.SPINEL_GOLD_RING, ModItems.TOPAZ_GOLD_RING, ModItems.CITRINE_GOLD_RING);

        @Override
        public void generate(HolderLookup.Provider registries, Consumer<AdvancementHolder> output) {
            var items = registries.lookupOrThrow(Registries.ITEM);
            var blocks = registries.lookupOrThrow(Registries.BLOCK);


            AdvancementHolder root = Advancement.Builder.advancement()
                    .display(
                            Items.IRON_PICKAXE,
                            Component.translatable("advancement.gems.root.title"),
                            Component.translatable("advancement.gems.root.description"),
                            Identifier.withDefaultNamespace("block/deepslate"),
                            AdvancementType.TASK,
                            false,
                            false,
                            false
                    )
                    .addCriterion("has_ruby", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, Items.IRON_PICKAXE)))
                    .save(output, MOD_ID + ":gems/root");

            AdvancementHolder gemRing = Advancement.Builder.advancement()
                    .parent(root)
                    .display(
                            ModItems.DIAMOND_GOLD_RING,
                            Component.translatable("advancement.gems.gem_ring.title"),
                            Component.translatable("advancement.gems.gem_ring.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .requirements(AdvancementRequirements.Strategy.OR)
                    .addCriterion("has_ring", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.DIAMOND_GOLD_RING)))
                    .save(output, MOD_ID + ":gems/gem_ring");

            AdvancementHolder gemNetheriteRing = Advancement.Builder.advancement()
                    .parent(gemRing)
                    .display(
                            ModItems.DIAMOND_NETHERITE_RING,
                            Component.translatable("advancement.gems.gem_netherite_ring.title"),
                            Component.translatable("advancement.gems.gem_netherite_ring.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .requirements(AdvancementRequirements.Strategy.OR)
                    .addCriterion("has_ring", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.DIAMOND_NETHERITE_RING)))
                    .save(output, MOD_ID + ":gems/gem_netherite_ring");

            AdvancementHolder gemGemsRing = Advancement.Builder.advancement()
                    .parent(gemNetheriteRing)
                    .display(
                            ModItems.DIAMOND_STARDUST_RING,
                            Component.translatable("advancement.gems.gem_stardust_ring.title"),
                            Component.translatable("advancement.gems.gem_stardust_ring.description"),
                            null,
                            AdvancementType.CHALLENGE,
                            true,
                            true,
                            true
                    )
                    .requirements(AdvancementRequirements.Strategy.OR)
                    .addCriterion("has_ring", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.DIAMOND_STARDUST_RING)))
                    .save(output, MOD_ID + ":gems/gem_stardust_ring");



            AdvancementHolder determination = Advancement.Builder.advancement()
                    .parent(root)
                    .display(
                            ModItems.RUBY_HEART,
                            Component.translatable("advancement.gems.determination.title"),
                            Component.translatable("advancement.gems.determination.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_determination_soul", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.RUBY_HEART)))
                    .save(output, MOD_ID + ":gems/determination");

            AdvancementHolder bravery = Advancement.Builder.advancement()
                    .parent(root)
                    .display(
                            ModItems.CITRINE_HEART,
                            Component.translatable("advancement.gems.bravery.title"),
                            Component.translatable("advancement.gems.bravery.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_bravery_soul", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.CITRINE_HEART)))
                    .save(output, MOD_ID + ":gems/bravery");

            AdvancementHolder justice = Advancement.Builder.advancement()
                    .parent(root)
                    .display(
                            ModItems.TOPAZ_HEART,
                            Component.translatable("advancement.gems.justice.title"),
                            Component.translatable("advancement.gems.justice.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_justice_soul", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.TOPAZ_HEART)))
                    .save(output, MOD_ID + ":gems/justice");

            AdvancementHolder kindness = Advancement.Builder.advancement()
                    .parent(root)
                    .display(
                            ModItems.EMERALD_HEART,
                            Component.translatable("advancement.gems.kindness.title"),
                            Component.translatable("advancement.gems.kindness.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_kindness_soul", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.EMERALD_HEART)))
                    .save(output, MOD_ID + ":gems/kindness");

            AdvancementHolder patience = Advancement.Builder.advancement()
                    .parent(root)
                    .display(
                            ModItems.AQUAMARINE_HEART,
                            Component.translatable("advancement.gems.patience.title"),
                            Component.translatable("advancement.gems.patience.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_patience_soul", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.AQUAMARINE_HEART)))
                    .save(output, MOD_ID + ":gems/patience");

            AdvancementHolder integrity = Advancement.Builder.advancement()
                    .parent(root)
                    .display(
                            ModItems.SAPPHIRE_HEART,
                            Component.translatable("advancement.gems.integrity.title"),
                            Component.translatable("advancement.gems.integrity.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_integrity_soul", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.SAPPHIRE_HEART)))
                    .save(output, MOD_ID + ":gems/integrity");

            AdvancementHolder perseverance = Advancement.Builder.advancement()
                    .parent(root)
                    .display(
                            ModItems.AMETHYST_HEART,
                            Component.translatable("advancement.gems.perseverance.title"),
                            Component.translatable("advancement.gems.perseverance.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_perseverance_soul", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.AMETHYST_HEART)))
                    .save(output, MOD_ID + ":gems/perseverance");

            AdvancementHolder doki = Advancement.Builder.advancement()
                    .parent(root)
                    .display(
                            ModItems.SPINEL_HEART,
                            Component.translatable("advancement.gems.doki.title"),
                            Component.translatable("advancement.gems.doki.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_doki_soul", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.SPINEL_HEART)))
                    .save(output, MOD_ID + ":gems/doki");

            AdvancementHolder maxDoki = Advancement.Builder.advancement()
                    .parent(doki)
                    .display(
                            ModItems.SPINEL_HEART,
                            Component.translatable("advancement.gems.max_doki.title"),
                            Component.translatable("advancement.gems.max_doki.description"),
                            null,
                            AdvancementType.CHALLENGE,
                            true,
                            true,
                            true
                    ) //TODO Make it look for 15 instances not 15 in a stack
                    .requirements(AdvancementRequirements.Strategy.AND)
                    .addCriterion("has_max_doki_soul", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.SPINEL_HEART)))


                    .save(output, MOD_ID + ":gems/max_doki");

            AdvancementHolder omega = Advancement.Builder.advancement()
                    .parent(determination)
                    .display(
                            ModItems.OMEGA_HEART,
                            Component.translatable("advancement.gems.omega.title"),
                            Component.translatable("advancement.gems.omega.description"),
                            null,
                            AdvancementType.CHALLENGE,
                            true,
                            true,
                            true
                    )
                    .addCriterion("has_omega_soul", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ModItems.OMEGA_HEART)))
                    .save(output, MOD_ID + ":gems/omega");



        }
        private static Advancement.Builder createRingAdvancement(final Advancement.Builder advancement, final HolderGetter<Item> items) {
            for (Item ring : RINGS) {
                advancement.addCriterion(BuiltInRegistries.ITEM.getKey(ring).getPath(), InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, ring)));
            }

            return advancement;
        }

    }

}
