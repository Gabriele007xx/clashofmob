package net.gabriele.clashofmobs.item.custom;

import net.gabriele.clashofmobs.item.ModItems;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier DARK_ELIXIR = new ForgeTier(1,200,1f,20,20, Tags.Blocks.NEEDS_GOLD_TOOL,
            ()-> Ingredient.of(ModItems.DARK_ELIXIR.get()));
}
