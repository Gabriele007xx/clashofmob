package net.gabriele.clashofmobs.entity.render.wallbreaker;


import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.DragonEntity;
import net.gabriele.clashofmobs.entity.WallBreakerEntity;
import net.gabriele.clashofmobs.entity.render.DragonEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WallBreakerRenderer<Type extends WallBreakerEntity> extends MobRenderer<Type, WallBreakerModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Clashofmobs.MOD_ID,
            "textures/entities/wall_breaker_.png");

    public WallBreakerRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new WallBreakerModel<>(p_174304_.bakeLayer(WallBreakerModel.LAYER_LOCATION)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(Type p_114482_) {
        return TEXTURE;
    }
}
