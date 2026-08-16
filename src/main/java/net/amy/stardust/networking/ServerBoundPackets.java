package net.amy.stardust.networking;

import eu.pb4.trinkets.api.TrinketsApi;
import net.amy.stardust.item.custom.RingItem;
import net.amy.stardust.networking.packet.RingEffectPayloadC2S;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class ServerBoundPackets {
    public static void handleRingEffectPayload(RingEffectPayloadC2S ringEffectPayloadC2S, ServerPlayNetworking.Context context) {
        Player player = context.player();
        for (var slot : TrinketsApi.getAttachment(player).equipped(t -> t.getItem() instanceof RingItem, true)) {
            ItemStack stack = slot.get();
            if (!player.getCooldowns().isOnCooldown(stack)) {
                stack.use(Minecraft.getInstance().level, player, InteractionHand.MAIN_HAND);
            }
        }
    }
}
