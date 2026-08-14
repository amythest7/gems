package net.amy.stardust.item.custom;

import eu.pb4.trinkets.api.callback.TrinketCallback;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;

import java.util.function.Consumer;

public class GoldRingItem extends RingItem {


    private Holder<MobEffect> effect;

    public GoldRingItem(Properties properties, Holder<MobEffect> effect) {
        super(properties.stacksTo(1).useCooldown(45));
        this.effect = effect;
    }

    public GoldRingItem(Properties properties) {
        super(properties.stacksTo(1));

    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        if(effect != null) {
            player.addEffect(new MobEffectInstance(effect, 600));
            player.awardStat(Stats.ITEM_USED.get(this));
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

}