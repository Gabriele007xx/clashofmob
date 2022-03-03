package net.gabriele.clashofmobs.entity;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;

public class WallBreakerEntity extends HogRiderEntity{
    private final float ExplosionPower = 7f;
    protected WallBreakerEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }
    public static AttributeSupplier.Builder createAttributes()
    {
        return Mob.createMobAttributes().
                add(Attributes.MAX_HEALTH, 72f).
                add(Attributes.ATTACK_DAMAGE, 2f).
                add(Attributes.MOVEMENT_SPEED, 0.25f);
    }

    @Override
    public void die(DamageSource p_21014_) {
        super.die(p_21014_);
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        Level world = this.level;
        esplosione(x,y,z,world);

    }
    private void esplosione(double x,double y,double z,Level world)
    {
        if(!world.isClientSide()) {
            world.explode(null, x, y, z, ExplosionPower, Explosion.BlockInteraction.BREAK);
        }
    }
}
