package net.amy.gems.item.custom;

import net.minecraft.core.Holder;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class GoldRingItem extends RingItem {


    public Holder<MobEffect> effect;

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