package net.gabriele.clashofmobs.entity.render.pekka;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.DragonEntity;
import net.gabriele.clashofmobs.entity.PekkaEntity;
import net.gabriele.clashofmobs.entity.pekka.PekkaModel;
import net.gabriele.clashofmobs.entity.render.DragonEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PekkaRender<Type extends PekkaEntity> extends MobRenderer<Type, PekkaModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Clashofmobs.MOD_ID,
            "textures/entities/pekka.png");


    public PekkaRender(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new PekkaModel<>(p_174304_.bakeLayer(PekkaModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type p_114482_) {
        return TEXTURE;
    }
}
