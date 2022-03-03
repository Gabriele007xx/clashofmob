package net.gabriele.clashofmobs.entity.render.archer;

import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.ArcherEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ArcherRenderer<Type extends ArcherEntity> extends MobRenderer<Type, ArcherEntityModel<Type>> {

        private static final ResourceLocation TEXTURE = new ResourceLocation(Clashofmobs.MOD_ID,
                "textures/entities/archer.png");


        public ArcherRenderer(EntityRendererProvider.Context p_174304_) {
            super(p_174304_, new ArcherEntityModel<>(p_174304_.bakeLayer(ArcherEntityModel.LAYER_LOCATION)), 0.5f);
        }

        @Override
        public ResourceLocation getTextureLocation(Type p_114482_) {
            return TEXTURE;
        }
    }
