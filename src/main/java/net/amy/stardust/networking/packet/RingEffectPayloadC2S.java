package net.amy.stardust.networking.packet;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.RegistryFileCodec;

import static net.amy.stardust.Stardust.MOD_ID;

public record RingEffectPayloadC2S(String name, int value) implements CustomPacketPayload {
    public static final Type<RingEffectPayloadC2S> TYPE = new Type<>(
            Identifier.fromNamespaceAndPath(MOD_ID, "ring_effect_payload"));

    public static final StreamCodec<RegistryFriendlyByteBuf, RingEffectPayloadC2S> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.STRING_UTF8,
            RingEffectPayloadC2S::name,

            ByteBufCodecs.VAR_INT,
            RingEffectPayloadC2S::value,

            RingEffectPayloadC2S::new);


    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
