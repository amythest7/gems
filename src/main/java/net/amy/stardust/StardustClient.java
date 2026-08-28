package net.amy.stardust;

import net.amy.stardust.keymapping.ModKeyMappings;
import net.amy.stardust.menu.ModMenuTypes;
import net.amy.stardust.menu.custom.GemFaceterScreen;
import net.amy.stardust.networking.packet.RingEffectPayloadC2S;
import net.amy.stardust.particle.ModParticles;
import net.amy.stardust.recipe.ModRecipes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.core.particles.SimpleParticleType;


public class StardustClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModKeyMappings.register();
        ClientTickEvents.END_CLIENT_TICK.register(StardustClient::onEndTick);

        registerFlameParticle(ModParticles.RUBY_FLAME);
        registerFlameParticle(ModParticles.SAPPHIRE_FLAME);
        registerFlameParticle(ModParticles.EMERALD_FLAME);
        registerFlameParticle(ModParticles.TOPAZ_FLAME);
        registerFlameParticle(ModParticles.CITRINE_FLAME);
        registerFlameParticle(ModParticles.SPINEL_FLAME);
        registerFlameParticle(ModParticles.AMETHYST_FLAME);
        registerFlameParticle(ModParticles.AQUAMARINE_FLAME);

        MenuScreens.register(ModMenuTypes.GEM_FACETER_MENU, GemFaceterScreen::new);

    }

   public static void onEndTick(Minecraft client) {
        if(ModKeyMappings.RING_EFFECT.consumeClick()) {
            ClientPlayNetworking.send(new RingEffectPayloadC2S("RingEffectTriggered", 0));

        }
   }

   private static void registerFlameParticle(SimpleParticleType particle) {
       ParticleProviderRegistry.getInstance().register(particle, FlameParticle.Provider::new);
   }
}
