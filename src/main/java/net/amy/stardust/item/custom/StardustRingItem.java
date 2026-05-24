package net.amy.stardust.item.custom;

import net.minecraft.core.Holder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class StardustRingItem extends Item {
    private Holder<MobEffect> effect;

    public StardustRingItem(Properties properties, Holder<MobEffect> effect) {
        super(properties.stacksTo(1).useCooldown(135));
        this.effect = effect;
    }

    public StardustRingItem(Properties properties) {
        super(properties.stacksTo(1));

    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        player.addEffect(new MobEffectInstance(effect, 1800, 2));
        return InteractionResult.SUCCESS;
    }
}
