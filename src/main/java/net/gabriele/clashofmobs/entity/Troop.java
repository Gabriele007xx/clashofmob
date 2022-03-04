package net.gabriele.clashofmobs.entity;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class Troop extends Monster {
    protected Troop(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
        xpReward = 0;
        setNoAi(false);
    }
    public MobType getMobType() {
        return MobType.UNDEFINED;
    }
    protected SoundEvent getAmbientSound() {
        return null;
    }

    protected SoundEvent getHurtSound(DamageSource p_34327_) {
        return SoundEvents.GENERIC_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.GENERIC_DEATH;
    }


}
