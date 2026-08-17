package net.amy.stardust.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static net.amy.stardust.Stardust.MOD_ID;

public class ModTags {
    public static class Blocks {
        public static TagKey<Block> NEEDS_STARDUST_TOOL = createTag("needs_stardust_tool");
        public static TagKey<Block> INCORRECT_FOR_STARDUST_TOOL = createTag("incorrect_for_stardust_tool");
        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name));
        }
    }

    public static class Items {
        public static TagKey<Item> STARDUST_TOOL_MATERIAL = createTag("stardust_tool_material");
        public static TagKey<Item> GEMS = createTag("gems");


        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
        }
    }
}
