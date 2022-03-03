package net.gabriele.clashofmobs.entity.render.valkyrie;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.ValkyrieEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ValkyrieRenderer<Type extends ValkyrieEntity> extends MobRenderer<Type, ValkyrieModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Clashofmobs.MOD_ID,
            "textures/entities/valkyrie.png");


    public ValkyrieRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new ValkyrieModel<>(p_174304_.bakeLayer(ValkyrieModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type p_114482_) {
        return TEXTURE;
    }
}
