package net.gabriele.clashofmobs.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class ValkyrieEntity extends HogRiderEntity {
    protected ValkyrieEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }
    public static AttributeSupplier.Builder createAttributes()
    {
        return Mob.createMobAttributes().
                add(Attributes.MAX_HEALTH, 900f).
                add(Attributes.ATTACK_DAMAGE, 133f).
                add(Attributes.MOVEMENT_SPEED, 0.25f);
    }
}
