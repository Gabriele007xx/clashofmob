package net.gabriele.clashofmobs.entity.xbow;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.XbowEntity;
import net.gabriele.clashofmobs.entity.render.valkyrie.ValkyrieModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class XbowRenderer<Type extends XbowEntity> extends MobRenderer<Type, XbowModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Clashofmobs.MOD_ID,
            "textures/entities/xbow.png");


    public XbowRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new XbowModel<>(p_174304_.bakeLayer(XbowModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type p_114482_) {
        return TEXTURE;
    }
}
