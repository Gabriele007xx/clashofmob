package net.gabriele.clashofmobs.entity.render;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.DragonEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DragonRenderer<Type extends DragonEntity> extends MobRenderer<Type, DragonEntityModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Clashofmobs.MOD_ID,
            "textures/entities/dragon.png");


    public DragonRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new DragonEntityModel<>(p_174304_.bakeLayer(DragonEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type p_114482_) {
        return TEXTURE;
    }
}
