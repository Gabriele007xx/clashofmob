package net.gabriele.clashofmobs.entity.witch;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.WitchEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WitchRenderer<Type extends WitchEntity> extends MobRenderer<Type, WitchModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Clashofmobs.MOD_ID,
            "textures/entities/witch.png");


    public WitchRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new WitchModel<>(p_174304_.bakeLayer(WitchModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type p_114482_) {
        return TEXTURE;
    }
}
