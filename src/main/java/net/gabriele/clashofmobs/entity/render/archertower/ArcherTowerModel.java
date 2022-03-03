package net.gabriele.clashofmobs.entity.render.archertower;

// Made with Blockbench 4.1.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.gabriele.clashofmobs.entity.ArcherTowerEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class ArcherTowerModel<Type extends ArcherTowerEntity> extends EntityModel<Type> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("clashofmobs", "archertower"), "main");
    private final ModelPart bb_main;

    public ArcherTowerModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 112).addBox(-17.0F, -60.0F, -9.0F, 37.0F, 60.0F, 35.0F, new CubeDeformation(0.0F))
                .texOffs(0, 221).addBox(-24.0F, -58.0F, -14.0F, 7.0F, 58.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 221).addBox(-24.0F, -58.0F, 26.0F, 7.0F, 58.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 221).addBox(20.0F, -58.0F, -14.0F, 7.0F, 58.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 221).addBox(20.0F, -58.0F, 26.0F, 7.0F, 58.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 32).addBox(-24.0F, -64.0F, -14.0F, 51.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 32).addBox(-24.0F, -64.0F, 26.0F, 51.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-24.0F, -64.0F, -9.0F, 7.0F, 5.0F, 35.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(20.0F, -64.0F, -9.0F, 7.0F, 5.0F, 35.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(-1.0F, -92.0F, 5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(0, 69).addBox(-1.0F, -84.0F, 7.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(41, 91).addBox(7.0F, -84.0F, 7.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(41, 91).addBox(-5.0F, -84.0F, 7.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 91).addBox(3.0F, -72.0F, 7.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 91).mirror().addBox(-1.0F, -72.0F, 7.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 512, 512);
    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bb_main.render(poseStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

    }
}
