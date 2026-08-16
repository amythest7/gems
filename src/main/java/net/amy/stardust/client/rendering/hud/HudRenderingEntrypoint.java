package net.amy.stardust.client.rendering.hud;

import eu.pb4.trinkets.api.TrinketsApi;
import net.amy.stardust.item.ModItems;
import net.amy.stardust.item.custom.RingItem;
import net.amy.stardust.item.custom.SoulItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ARGB;
import net.minecraft.util.Mth;
import net.minecraft.util.Util;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;

import java.util.List;

import static net.amy.stardust.Stardust.MOD_ID;


/*public class HudRenderingEntrypoint implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Attach our rendering code to before the chat hud layer. Our layer will render right before the chat. The API will take care of z spacing.
        HudElementRegistry.attachElementBefore(VanillaHudElements.CHAT, Identifier.fromNamespaceAndPath(MOD_ID, "before_chat"), HudRenderingEntrypoint::extract);
    }

    private static void extract(GuiGraphicsExtractor graphics, DeltaTracker tickCounter) {
        int color = 0xFFFF0000; // Red
        int targetColor = 0xFF00FF00; // Green
        Player player = Minecraft.getInstance().player;

        // You can use the Util.getMillis() function to get the current time in milliseconds.
        // Divide by 1000 to get seconds.
        double currentTime = Util.getMillis() / 1000.0;

        // "lerp" simply means "linear interpolation", which is a fancy way of saying "blend".
        float lerpedAmount = Mth.abs(Mth.sin((float) currentTime));
        int lerpedColor = ARGB.linearLerp(lerpedAmount, color, targetColor);

        // Draw a square with the lerped color.
        // x1, x2, y1, y2, color
        for (var slot : TrinketsApi.getAttachment(player).equipped(t -> t.getItem() instanceof SoulItem, false)) {
            System.out.println("Found Soul");
            graphics.fill(0, 0, 10, 10, lerpedColor);
        }
    }
}*/
public class HudRenderingEntrypoint implements ClientModInitializer {
    // check if a soul is equipped, if yes get the soul's texture
    @Override
    public void onInitializeClient() {
        HudElementRegistry.attachElementBefore(VanillaHudElements.HOTBAR, Identifier.fromNamespaceAndPath(MOD_ID, "before_hotbar"), HudRenderingEntrypoint::extract);
    }

    private static final Identifier SOUL_CONTAINER_HUD = Identifier.fromNamespaceAndPath(MOD_ID, "textures/gui/sprites/hud/soul_container.png");
    private static final Identifier RING_WITH_GEM_CONTAINER_HUD = Identifier.fromNamespaceAndPath(MOD_ID, "textures/gui/sprites/hud/ring_with_gem_container.png");
    private static final Identifier RING_CONTAINER_HUD = Identifier.fromNamespaceAndPath(MOD_ID, "textures/gui/sprites/hud/ring_container.png");

    private static final List<Item> PLAIN_RINGS = List.of(ModItems.GOLD_RING, ModItems.NETHERITE_RING, ModItems.STARDUST_RING);



    private static void extract(GuiGraphicsExtractor graphics, DeltaTracker tickCounter) {

        int RING_X = (graphics.guiWidth()/2)-117;
        int RING_Y = graphics.guiHeight()-40;
        Player player = Minecraft.getInstance().player;


        if (player.gameMode() != GameType.CREATIVE) {
            for (var slot : TrinketsApi.getAttachment(player).equipped(t -> t.getItem() instanceof SoulItem, true)) {
                ItemStack stack = slot.get();
                String currentSoul = stack.getItem().getDescriptionId().split("\\.")[2];
                Identifier soulHud = Identifier.fromNamespaceAndPath(MOD_ID, "textures/item/" + currentSoul + ".png");
                graphics.blit(RenderPipelines.GUI_TEXTURED, SOUL_CONTAINER_HUD, (graphics.guiWidth() / 2) - 8, graphics.guiHeight() - 52, 0, 0, 16, 16, 16, 16);
                graphics.blit(RenderPipelines.GUI_TEXTURED, soulHud, (graphics.guiWidth() / 2) - 8, graphics.guiHeight() - 52, 0, 0, 16, 16, 16, 16);
                break;
            }
            for (var slot : TrinketsApi.getAttachment(player).equipped(t -> t.getItem() instanceof RingItem, true)) {
                ItemStack stack = slot.get();
                String currentRing = stack.getItem().getDescriptionId().split("\\.")[2];
                Identifier ringHud = Identifier.fromNamespaceAndPath(MOD_ID, "textures/item/" + currentRing + ".png");
                if (PLAIN_RINGS.contains(stack.getItem())) {
                    graphics.blit(RenderPipelines.GUI_TEXTURED, RING_CONTAINER_HUD, RING_X, RING_Y, 0, 0, 16, 16, 16, 16);
                }
                else {
                    graphics.blit(RenderPipelines.GUI_TEXTURED, RING_WITH_GEM_CONTAINER_HUD, RING_X, RING_Y, 0, 0, 16, 16, 16, 16);
                }
                graphics.blit(RenderPipelines.GUI_TEXTURED, ringHud, RING_X, RING_Y, 0, 0, 16, 16, 16, 16);
                break;
            }
        }
    }
}

