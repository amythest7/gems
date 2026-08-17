package net.amy.stardust.item.custom;


import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.AttackRange;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.component.Weapon;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;

import static net.amy.stardust.Stardust.MOD_ID;

public class GlaiveItem extends Item {
    private static final Identifier INTERACTION_RANGE_MODIFIER_ID =
            Identifier.fromNamespaceAndPath(MOD_ID, "interaction_range_bonus");

    float attackReachBaseline;

    public GlaiveItem( ToolMaterial material, float attackDamageBaseline, float attackSpeedBaseline, float attackReachBaseline, Properties properties) {
        super(properties.sword(material, attackDamageBaseline, attackSpeedBaseline));
        this.attackReachBaseline = attackReachBaseline;
    }

    public static ItemAttributeModifiers createAttributes(ToolMaterial material, float attackDamageBaseline, float attackSpeedBaseline, float attackReachBaseline) {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, attackDamageBaseline + material.attackDamageBonus(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, attackSpeedBaseline + material.speed(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(INTERACTION_RANGE_MODIFIER_ID, attackReachBaseline, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .build();
    }

    public static Tool createToolProperties() {
        return new Tool(List.of(), 1.0F, 2, false);
    }

    @Override
    public void postHurtEnemy(ItemStack itemStack, LivingEntity mob, LivingEntity attacker) {
        super.postHurtEnemy(itemStack, mob, attacker);
            itemStack.hurtAndBreak(1, attacker, EquipmentSlot.MAINHAND);


    }
}



