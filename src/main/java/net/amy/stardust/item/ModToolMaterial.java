package net.amy.stardust.item;

import net.amy.stardust.tag.ModTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;


public class ModToolMaterial {
    public static final ToolMaterial STARDUST = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_STARDUST_TOOL,
            3250, 10.0F, 5.0F, 17, ModTags.Items.STARDUST_TOOL_MATERIAL);

}
