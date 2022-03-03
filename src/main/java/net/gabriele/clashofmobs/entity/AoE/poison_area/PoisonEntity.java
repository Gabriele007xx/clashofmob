package net.gabriele.clashofmobs.entity.AoE.poison_area;

import net.gabriele.clashofmobs.entity.AoE.GenericAreaEntity;
import net.gabriele.clashofmobs.spells.Effect;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PoisonEntity extends GenericAreaEntity {
    private final int iniDamage=1;
    private final int maxDamage=10;
    private int DPS = 1;
    private int CURRENT=0;
    private int INTERVAL=40;
    public PoisonEntity(EntityType<? extends PathfinderMob> p_21683_, Level p_21684_) {
        super(p_21683_, p_21684_);
        this.setRadius(2f);
        this.setEffect(Effect.HARMFUL);
        this.setINTERVAL(20);
        this.DURATION = 400;
    }


    @Override
    public void baseTick() {
        super.baseTick();
        this.damage(this.level,this.getX(),this.getY(),this.getZ(),this.DPS,this.radius);
        this.charge();

    }
    public void aiStep() {
        super.aiStep();
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        Entity entity = this;
        Level world = this.level;
    }
    public void charge()
    {
        this.CURRENT++;
        if(CURRENT % INTERVAL == 0)
        {
            DPS++;
        }
    }
    public static void damage(LevelAccessor world, double x, double y, double z, int damage, float radius) {
        {
            final Vec3 _center = new Vec3(x, y, z);
            List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(radius / 2d), e -> true).stream()
                    .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
            for (Entity entityiterator : _entfound) {
                entityiterator.hurt(DamageSource.MAGIC, damage);
            }
        }
    }


}
