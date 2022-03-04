package net.gabriele.clashofmobs.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class PekkaEntity extends Troop{
    protected PekkaEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, XbowEntity.class, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, ArcherTowerEntity.class, true));
        this.goalSelector.addGoal(3,new MeleeAttackGoal(this,1.2,false));
        this.goalSelector.addGoal(4,new RandomStrollGoal(this,1));
        this.goalSelector.addGoal(5,new FloatGoal(this));
    }
    public static AttributeSupplier.Builder createAttributes()
    {
        return Mob.createMobAttributes().
                add(Attributes.MAX_HEALTH, 4000f).
                add(Attributes.ATTACK_DAMAGE, 410f).
                add(Attributes.MOVEMENT_SPEED, 0.2f);
    }
}
