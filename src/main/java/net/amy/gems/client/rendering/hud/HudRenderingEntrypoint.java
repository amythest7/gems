package net.amy.gems.client.rendering.hud;

import eu.pb4.trinkets.api.TrinketsApi;
import net.amy.gems.item.ModItems;
import net.amy.gems.item.custom.RingItem;
import net.amy.gems.item.custom.SoulItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;

import java.util.List;

import static net.amy.gems.Gems.MOD_ID;

public class HudRenderingEntrypoint implements ClientModInitializer {

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

