package net.amy.gems.sounds;

import net.amy.gems.Gems;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

import static net.amy.gems.Gems.MOD_ID;

public class ModSoundEvents {

    public static final Holder.Reference<SoundEvent> MUSIC_DISC_DESTRUCTOR =
            registerSoundEvent("destructor");



    private static Holder.Reference<SoundEvent> registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, name);
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id,
                SoundEvent.createVariableRangeEvent(id));
    }

    private static Holder.Reference<SoundEvent> registerSoundEventFromVanilla(String name) {
        Identifier id = Identifier.withDefaultNamespace(name);
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id,
                SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerSounds() {
        Gems.LOGGER.info("Registering Mod Sounds for " + MOD_ID);
    }
}
