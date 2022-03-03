package net.gabriele.clashofmobs.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

import javax.annotation.Nullable;

public class WitchEntity extends ArcherEntity{
    protected WitchEntity(EntityType<? extends AbstractSkeleton> p_32133_, Level p_32134_) {
        super(p_32133_, p_32134_);
    }

    @Override
    public boolean hurt(DamageSource p_21016_, float p_21017_) {
        Level world = this.level;
        BlockPos position = this.blockPosition();
        spawnSkeletons(world,position);
        return super.hurt(p_21016_, p_21017_);
    }
    public static AttributeSupplier.Builder createAttributes()
    {
        return Monster.createMonsterAttributes().
                add(Attributes.MAX_HEALTH, 100f).
                add(Attributes.MOVEMENT_SPEED, 0.2f);
    }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_32146_, DifficultyInstance p_32147_, MobSpawnType p_32148_, @Nullable SpawnGroupData p_32149_, @Nullable CompoundTag p_32150_) {
        Level world = this.level;
        BlockPos position = this.blockPosition();
        spawnSkeletons(world,position);
        return super.finalizeSpawn(p_32146_, p_32147_, p_32148_, p_32149_, p_32150_);
    }
    public void performRangedAttack(LivingEntity p_32141_, float p_32142_) {
        ItemStack itemstack = this.getProjectile(this.getItemInHand(ProjectileUtil.getWeaponHoldingHand(this, item -> item instanceof net.minecraft.world.item.BowItem)));
        AbstractArrow abstractarrow = this.getArrow(itemstack, p_32142_);
        if (this.getMainHandItem().getItem() instanceof net.minecraft.world.item.BowItem)
            abstractarrow = ((net.minecraft.world.item.BowItem)this.getMainHandItem().getItem()).customArrow(abstractarrow);
        double d0 = p_32141_.getX() - this.getX();
        double d1 = p_32141_.getY(0.3333333333333333D) - abstractarrow.getY();
        double d2 = p_32141_.getZ() - this.getZ();
        double d3 = Math.sqrt(d0 * d0 + d2 * d2);
        abstractarrow.setBaseDamage(110f);
        abstractarrow.shoot(d0, d1 + d3 * (double)0.2F, d2, 1.6F, (float)(14 - this.level.getDifficulty().getId() * 4));
        this.playSound(SoundEvents.SKELETON_SHOOT, 1.0F, 1.0F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
        this.level.addFreshEntity(abstractarrow);
    }
    public void spawnSkeletons(Level world,BlockPos pos)
    {
        if(!world.isClientSide())
        {
            ServerLevel livello = (ServerLevel) world;
            EntityType.SKELETON.spawn(livello,null,null,pos,MobSpawnType.TRIGGERED,true,true);
            EntityType.SKELETON.spawn(livello,null,null,pos,MobSpawnType.TRIGGERED,true,true);
            EntityType.SKELETON.spawn(livello,null,null,pos,MobSpawnType.TRIGGERED,true,true);
            EntityType.SKELETON.spawn(livello,null,null,pos,MobSpawnType.TRIGGERED,true,true);

        }

    }
}
