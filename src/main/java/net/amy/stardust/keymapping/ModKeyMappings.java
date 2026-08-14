package net.amy.stardust.keymapping;

import com.mojang.blaze3d.platform.InputConstants;
import net.amy.stardust.Stardust;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

import static net.amy.stardust.Stardust.MOD_ID;

public class ModKeyMappings {

    public static final KeyMapping RING_EFFECT = KeyMappingHelper.registerKeyMapping(
            new KeyMapping("key.stardust.ring_effect",
                    InputConstants.Type.KEYSYM,
                    GLFW.GLFW_KEY_Y,
                    KeyMapping.Category.GAMEPLAY)
    );


    public static void register() {
        Stardust.LOGGER.info("Registering KeyMappings for " + MOD_ID);
    }
}
