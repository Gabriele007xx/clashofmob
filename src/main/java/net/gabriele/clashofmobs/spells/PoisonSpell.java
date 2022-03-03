package net.gabriele.clashofmobs.spells;

import net.gabriele.clashofmobs.entity.AoE.poison_area.PoisonEntity;
import net.gabriele.clashofmobs.entity.EntityInit;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class PoisonSpell extends SpellItem{
    public PoisonSpell(int p_86, int p_87, float p_88, Effect p_89) {
        super(1, 1, 2, Effect.HARMFUL);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        if(!level.isClientSide())
        {
           PoisonEntity entity = new PoisonEntity(EntityInit.POISON_AREA.get(), level);
           entity.moveTo(context.getClickedPos().getX(),context.getClickedPos().getY() + 1, context.getClickedPos().getZ());
           level.addFreshEntity(entity);
        }
        return super.useOn(context);
    }
}
