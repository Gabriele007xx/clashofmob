package net.gabriele.clashofmobs.spells;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;


public class SpellItem extends Item {
    private final int cost;
    private float radius;
    private final Effect effect;
    private int damage;
    public SpellItem(int p_86,int p_87, float p_88,Effect p_89) {
        super(new Item.Properties().tab(CreativeModeTab.TAB_BREWING).stacksTo(1).rarity(Rarity.COMMON));
        this.damage = p_86;
        this.cost = p_87;
        this.radius = p_88;
        this.effect = p_89;
    }
    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        ItemStack item = context.getItemInHand();
        item.shrink(1);
        return InteractionResult.PASS;
    }
    @Override
    public int getUseDuration(ItemStack itemstack)
    {
        return 0;
    }
    public int getCost() {
        return this.cost;
    }
    public Effect getEffect() {
        return this.effect;
    }
    public float getRadius()
    {
        return this.radius;
    }


}
