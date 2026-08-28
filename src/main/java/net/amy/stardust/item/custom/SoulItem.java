package net.amy.stardust.item.custom;

import eu.pb4.trinkets.api.TrinketsApi;
import eu.pb4.trinkets.api.callback.TrinketCallback;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.Nullable;

public class SoulItem extends Item implements TrinketCallback {

    public SoulItem(Properties properties) {
        super(properties);

    }
    //TODO Add functionality to souls

    //Temp functionality
    @Override
    public void inventoryTick(ItemStack itemStack, ServerLevel level, Entity owner, @Nullable EquipmentSlot slot) {
        super.inventoryTick(itemStack, level, owner, slot);
        if(!level.isClientSide()) {
            if(owner instanceof Player player) {
                    player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 4, true, false));
            }
        }
    }
}
