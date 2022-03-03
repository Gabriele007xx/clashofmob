package net.gabriele.clashofmobs.entity.xbow;

// Made with Blockbench 4.1.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.gabriele.clashofmobs.entity.XbowEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 4.1.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class XbowModel<Type extends XbowEntity> extends EntityModel<Type> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("clashofmobs", "xbowmodel"), "main");
    private final ModelPart bb_main;

    public XbowModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -4.0F, -10.0F, 28.0F, 4.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(15, 35).addBox(-12.0F, -6.0F, -4.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(0, 75).addBox(-7.0F, -24.0F, -3.0F, 6.0F, 6.0F, 15.0F, new CubeDeformation(0.0F))
                .texOffs(0, 55).addBox(-6.0F, -18.0F, 8.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(3, 77).addBox(-7.0F, -26.0F, -3.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(2, 77).addBox(-2.0F, -26.0F, -3.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(96, 42).addBox(-2.0F, -30.0F, 5.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(96, 42).addBox(-7.0F, -30.0F, 5.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(101, 47).addBox(-6.0F, -30.0F, 5.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(94, 69).addBox(-15.0F, -24.0F, -3.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(94, 68).addBox(-1.0F, -24.0F, -3.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 98).addBox(-13.0F, -23.0F, -10.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

        PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 98).addBox(6.0F, -23.0F, -5.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

        PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(94, 69).addBox(-17.0F, -24.0F, -12.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7418F, 0.0F));

        PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(94, 69).addBox(3.0F, -24.0F, -7.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7418F, 0.0F));

        PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 35).addBox(-14.0F, -23.0F, 13.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, -0.6545F));

        PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 35).addBox(5.0F, -19.0F, 14.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.6545F));

        PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 35).addBox(-14.0F, -23.0F, -8.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, -0.6545F));

        PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 35).addBox(5.0F, -18.0F, -9.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.6545F));

        return LayerDefinition.create(meshdefinition, 256, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bb_main.render(poseStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

    }
}