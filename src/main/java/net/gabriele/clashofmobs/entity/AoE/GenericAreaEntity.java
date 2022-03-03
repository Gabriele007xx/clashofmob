package net.gabriele.clashofmobs.entity.AoE;

import net.gabriele.clashofmobs.spells.Effect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public class GenericAreaEntity extends PathfinderMob {
    protected int DURATION;
    protected int age=0;
    protected Effect effect;
    protected int INTERVAL;
    protected float radius;
    protected GenericAreaEntity(EntityType<? extends PathfinderMob> p_21683_, Level p_21684_) {
        super(p_21683_, p_21684_);

    }
    @Override
    protected void registerGoals() {
        super.registerGoals();
    }

    @Override
    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    @Override
    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
    }

    @Override
    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
    }

    @Override
    public void baseTick() {
        super.baseTick();
        this.grow();
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        return false;
    }

    @Override
    protected void doPush(Entity entityIn) {
    }

    @Override
    protected void pushEntities() {
    }

    public void aiStep() {
        super.aiStep();
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
        builder = builder.add(Attributes.MAX_HEALTH, 1);
        builder = builder.add(Attributes.ARMOR, 0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
        return builder;
    }

    public void grow() {
        this.age++;
        if (this.age++ >= DURATION) {
            this.discard();
        }
    }
    public void setRadius(float p_134)
    {
        this.radius = p_134;
    }
    public void setEffect(Effect p_135)
    {
        this.effect = p_135;
    }
    public void setINTERVAL(int p_136)
    {
        this.INTERVAL = p_136;
    }


}
