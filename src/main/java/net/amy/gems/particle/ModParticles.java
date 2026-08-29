package net.amy.gems.particle;


import net.amy.gems.Gems;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;

import net.minecraft.resources.Identifier;


import static net.amy.gems.Gems.MOD_ID;

public class ModParticles {

    public static final SimpleParticleType AMETHYST_FLAME =
            registerParticle("amethyst_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType RUBY_FLAME =
            registerParticle("ruby_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType SAPPHIRE_FLAME =
            registerParticle("sapphire_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType EMERALD_FLAME =
            registerParticle("emerald_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType TOPAZ_FLAME =
            registerParticle("topaz_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType CITRINE_FLAME =
            registerParticle("citrine_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType SPINEL_FLAME =
            registerParticle("spinel_flame", FabricParticleTypes.simple());
    public static final SimpleParticleType AQUAMARINE_FLAME =
            registerParticle("aquamarine_flame", FabricParticleTypes.simple());

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(BuiltInRegistries.PARTICLE_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        Gems.LOGGER.info("Registering Particles for: " + MOD_ID);
    }
}
