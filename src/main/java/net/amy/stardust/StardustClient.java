package net.amy.stardust;

import eu.pb4.trinkets.api.TrinketsApi;
import net.amy.stardust.item.custom.RingItem;
import net.amy.stardust.keymapping.ModKeyMappings;
import net.amy.stardust.networking.packet.RingEffectPayloadC2S;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;


public class StardustClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModKeyMappings.register();
        ClientTickEvents.END_CLIENT_TICK.register(StardustClient::onEndTick);
    }

   public static void onEndTick(Minecraft client) {
        if(ModKeyMappings.RING_EFFECT.consumeClick()) {
            ClientPlayNetworking.send(new RingEffectPayloadC2S("RingEffectTriggered", 0));

        }
   }
}
