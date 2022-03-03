package net.gabriele.clashofmobs.entity.render.AoE.poison;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.AoE.poison_area.PoisonEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PoisonRenderer<Type extends PoisonEntity> extends MobRenderer<Type, PoisonModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Clashofmobs.MOD_ID,
            "textures/entities/poison.png");


    public PoisonRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new PoisonModel<>(p_174304_.bakeLayer(PoisonModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type p_114482_) {
        return TEXTURE;
    }
}
