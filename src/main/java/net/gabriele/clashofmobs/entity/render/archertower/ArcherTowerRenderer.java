package net.gabriele.clashofmobs.entity.render.archertower;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.ArcherTowerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ArcherTowerRenderer<Type extends ArcherTowerEntity> extends MobRenderer<Type, ArcherTowerModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Clashofmobs.MOD_ID,
            "textures/entities/archertower.png");

    public ArcherTowerRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new ArcherTowerModel<>(p_174304_.bakeLayer(ArcherTowerModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type p_114482_) {
        return TEXTURE;
    }
}
