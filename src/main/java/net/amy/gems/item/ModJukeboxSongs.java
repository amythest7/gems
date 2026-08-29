package net.amy.gems.item;

import net.amy.gems.sounds.ModSoundEvents;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Util;
import net.minecraft.world.item.JukeboxSong;

import static net.amy.gems.Gems.MOD_ID;

public interface ModJukeboxSongs {
    ResourceKey<JukeboxSong> DESTRUCTOR = create("destructor");



    private static ResourceKey<JukeboxSong> create(final String id) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath(MOD_ID, id));
    }


    private static void register(
            final BootstrapContext<JukeboxSong> context,
            final ResourceKey<JukeboxSong> registryKey,
            final Holder.Reference<SoundEvent> soundEvent,
            final int lengthInSeconds,
            final int comparatorOutput
    ) {
        context.register(
                registryKey,
                new JukeboxSong(soundEvent, Component.translatable(Util.makeDescriptionId("jukebox_song", registryKey.identifier())),
                        lengthInSeconds, comparatorOutput)
        );
    }

    static void bootstrap(final BootstrapContext<JukeboxSong> context) {
        register(context, DESTRUCTOR, ModSoundEvents.MUSIC_DISC_DESTRUCTOR, 307, 12);


    }

}
