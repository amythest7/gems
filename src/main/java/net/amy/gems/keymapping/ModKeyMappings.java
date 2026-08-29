package net.amy.gems.keymapping;

import com.mojang.blaze3d.platform.InputConstants;
import net.amy.gems.Gems;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

import static net.amy.gems.Gems.MOD_ID;

public class ModKeyMappings {

    public static final KeyMapping RING_EFFECT = KeyMappingHelper.registerKeyMapping(
            new KeyMapping("key.stardust.ring_effect",
                    InputConstants.Type.KEYSYM,
                    GLFW.GLFW_KEY_Y,
                    KeyMapping.Category.GAMEPLAY)
    );


    public static void register() {
        Gems.LOGGER.info("Registering KeyMappings for " + MOD_ID);
    }
}
