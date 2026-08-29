package net.amy.gems.menu;

import net.amy.gems.Gems;
import net.amy.gems.menu.custom.GemFaceterMenu;
import net.fabricmc.fabric.api.menu.v1.ExtendedMenuType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.MenuType;

import static net.amy.gems.Gems.MOD_ID;

public class ModMenuTypes {

    public static final MenuType<GemFaceterMenu> GEM_FACETER_MENU =
            Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(MOD_ID, "gem_faceter_menu"),
                    new ExtendedMenuType<>(GemFaceterMenu::new, BlockPos.STREAM_CODEC));


    public static void registerModMenuTypes() {
        Gems.LOGGER.info("Registering ModMenuTypes for " + MOD_ID);
    }
}