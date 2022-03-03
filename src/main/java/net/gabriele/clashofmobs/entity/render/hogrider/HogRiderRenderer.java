package net.gabriele.clashofmobs.entity.render.hogrider;


import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.DragonEntity;
import net.gabriele.clashofmobs.entity.HogRiderEntity;
import net.gabriele.clashofmobs.entity.render.DragonEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class HogRiderRenderer <Type extends HogRiderEntity> extends MobRenderer<Type, HogRiderModel<Type>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Clashofmobs.MOD_ID,
            "textures/entities/pig_rider.png");

    public HogRiderRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new HogRiderModel<>(p_174304_.bakeLayer(HogRiderModel.LAYER_LOCATION)),0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type p_114482_) {
        return TEXTURE;
    }

}
