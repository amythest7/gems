package net.amy.stardust.sounds;

import net.amy.stardust.Stardust;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;

import static net.amy.stardust.Stardust.MOD_ID;

public class ModSoundEvents {

    public static final Holder.Reference<SoundEvent> MUSIC_DISC_DESTRUCTOR =
            registerSoundEvent("destructor");


    private static Holder.Reference<SoundEvent> registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, name);
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, Identifier.fromNamespaceAndPath(MOD_ID, name),
                SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(MOD_ID, name)) );
    }

    public static void registerSounds() {
        Stardust.LOGGER.info("Registering Mod Sounds for " + MOD_ID);
    }
}
