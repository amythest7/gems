package net.amy.stardust.trim;

import net.amy.stardust.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Util;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

import java.util.Map;

import static net.amy.stardust.Stardust.MOD_ID;

public class ModTrimMaterials {
    public static final MaterialAssetGroup RUBY_MATERIAL = MaterialAssetGroup.create("ruby");


    public static final ResourceKey<TrimMaterial> RUBY = ResourceKey.create(Registries.TRIM_MATERIAL,
            Identifier.fromNamespaceAndPath(MOD_ID, "ruby"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, RUBY, Style.EMPTY.withColor(TextColor.parseColor("#c70e0e").getOrThrow()), RUBY_MATERIAL);

    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> armorTrimKey, Style style, MaterialAssetGroup assets) {
        Component description = Component.translatable(Util.makeDescriptionId("trim_material", armorTrimKey.identifier()))
                .withStyle(style);
        TrimMaterial trimMaterial = new TrimMaterial(assets, description);

        context.register(armorTrimKey, trimMaterial);
    }
}
