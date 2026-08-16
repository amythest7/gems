package net.amy.stardust.networking;

import net.amy.stardust.networking.packet.RingEffectPayloadC2S;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.RegistryFriendlyByteBuf;

public class ModPackets {


    private static void registerClientbound(PayloadTypeRegistry<RegistryFriendlyByteBuf> registry) {

    }

    private static void registerServerbound(PayloadTypeRegistry<RegistryFriendlyByteBuf> registry) {
        registry.register(RingEffectPayloadC2S.TYPE, RingEffectPayloadC2S.STREAM_CODEC);

        ServerPlayNetworking.registerGlobalReceiver(RingEffectPayloadC2S.TYPE, ServerBoundPackets::handleRingEffectPayload);
    }

    public static void registerPackets() {
        registerClientbound(PayloadTypeRegistry.clientboundPlay());
        registerServerbound(PayloadTypeRegistry.serverboundPlay());
    }
}
