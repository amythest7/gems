package net.amy.stardust;

import eu.pb4.trinkets.api.TrinketsApi;
import net.amy.stardust.item.custom.RingItem;
import net.amy.stardust.keymapping.ModKeyMappings;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;


public class StardustModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModKeyMappings.register();
        ClientTickEvents.END_CLIENT_TICK.register(StardustModClient::onEndTick);
    }

   public static void onEndTick(Minecraft client) {
       Player player = client.player;
        if(ModKeyMappings.RING_EFFECT.consumeClick()) {
            for (var slot : TrinketsApi.getAttachment(player).equipped(t -> t.getItem() instanceof RingItem, true)) {
                ItemStack stack = slot.get();
                if(!player.getCooldowns().isOnCooldown(stack)) {
                    stack.use(Minecraft.getInstance().level, player, InteractionHand.MAIN_HAND);
                }
            }

        }
   }
}
