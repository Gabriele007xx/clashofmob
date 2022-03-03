package net.gabriele.clashofmobs.spells;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;

public class PoisonSpell extends SpellItem{
    public PoisonSpell(int p_86, int p_87, float p_88, Effect p_89) {
        super(1, 1, 2, Effect.HARMFUL);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {

        return super.useOn(context);
    }
}
