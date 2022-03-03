package net.gabriele.clashofmobs.entity;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.level.Level;

public class DragonEntity extends Ghast {

    public DragonEntity(EntityType<? extends Ghast> p_32725_, Level p_32726_) {
        super(p_32725_, p_32726_);
    }
    public static AttributeSupplier.Builder createAttributes()
    {
        return Mob.createMobAttributes().
                add(Attributes.MAX_HEALTH, 2000f).
                add(Attributes.MOVEMENT_SPEED, 0.2f);
    }
    public SoundSource getSoundSource() {
        return SoundSource.HOSTILE;
    }

    protected SoundEvent getAmbientSound() {
        return null;
    }

    protected SoundEvent getHurtSound(DamageSource p_32750_) {
        return SoundEvents.ENDER_DRAGON_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENDERMAN_DEATH;
    }
    public int getExplosionPower() {
        return 4;
    }
}
