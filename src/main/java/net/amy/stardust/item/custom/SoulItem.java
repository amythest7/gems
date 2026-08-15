package net.amy.stardust.item.custom;

import eu.pb4.trinkets.api.callback.TrinketCallback;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.Item;

public class SoulItem extends Item implements TrinketCallback {
    public SoulItem(Properties properties, MobEffect effect) {
        super(properties);
    }
}
