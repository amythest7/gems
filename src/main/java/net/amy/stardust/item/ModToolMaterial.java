package net.amy.stardust.item;

import net.amy.stardust.tag.ModTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;


public record ModToolMaterial (TagKey<Block> incorrectBlocksForDrops, int durability, float speed, float attackDamageBonus, float attackRangeBonus,  int enchantmentValue, TagKey<Item> repairItems){
    public static final ToolMaterial STARDUST = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_STARDUST_TOOL,
            2031, 9.0F, 4.0F, 15, ModTags.Items.STARDUST_TOOL_MATERIAL);

}
