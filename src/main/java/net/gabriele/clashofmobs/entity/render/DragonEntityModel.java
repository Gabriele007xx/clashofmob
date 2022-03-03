package net.gabriele.clashofmobs.entity.render;

// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.DragonEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class DragonEntityModel<Type extends DragonEntity> extends EntityModel<Type> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Clashofmobs.MOD_ID, "dragon"), "main");
    private final ModelPart bb_main;

    public DragonEntityModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(250, 0).addBox(-5.0F, -20.0F, 28.0F, 10.0F, 10.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(332, 0).addBox(-4.0F, -18.0F, 53.0F, 7.0F, 7.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(200, 43).addBox(-5.0F, -39.0F, -46.0F, 10.0F, 10.0F, 18.0F, new CubeDeformation(0.0F))
                .texOffs(0, 46).addBox(-5.0F, -39.0F, -66.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(30, 76).addBox(16.5F, -2.0F, 3.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(30, 76).addBox(19.0F, -2.0F, 1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(30, 76).addBox(14.0F, -2.0F, 1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(30, 76).addBox(-18.0F, -2.0F, 1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(30, 76).addBox(-13.0F, -2.0F, 1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(30, 76).addBox(-15.5F, -2.0F, 3.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 76).addBox(14.0F, -26.0F, -43.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 76).addBox(-15.0F, -26.0F, -43.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(200, 43).addBox(-5.0F, -41.0F, -58.0F, 10.0F, 10.0F, 18.0F, new CubeDeformation(0.0F))
                .texOffs(0, 46).addBox(-5.0F, -33.0F, -66.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(30, 76).addBox(-0.5F, -43.0F, -49.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(30, 76).addBox(2.0F, -43.0F, -51.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(30, 76).addBox(-3.0F, -43.0F, -51.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 70).addBox(2.0F, -41.0F, -61.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 70).addBox(-4.0F, -41.0F, -61.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(3, 163).addBox(2.0F, -34.0F, -65.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(3, 163).addBox(2.0F, -34.0F, -61.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(3, 163).addBox(-4.0F, -34.0F, -61.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(3, 163).addBox(-4.0F, -34.0F, -65.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(3, 163).addBox(-4.0F, -38.0F, -65.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(3, 163).addBox(-4.0F, -38.0F, -62.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(3, 163).addBox(2.0F, -38.0F, -65.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(3, 163).addBox(2.0F, -38.0F, -61.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-34, 187).addBox(24.0F, -31.0F, 13.0F, 73.0F, 0.0F, 35.0F, new CubeDeformation(0.0F))
                .texOffs(-34, 187).mirror().addBox(-70.0F, -31.0F, 13.0F, 73.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(14.0F, 6.0F, -10.0F, 0.48F, 3.1416F, 0.0F));

        PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 76).addBox(0.0F, -36.0F, -17.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 76).addBox(29.0F, -36.0F, -17.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, 6.0F, -10.0F, 0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 132).addBox(-32.0F, -15.0F, 20.0F, 7.0F, 15.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(4, 132).addBox(0.0F, -15.0F, 20.0F, 7.0F, 15.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 6.0F, -10.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(136, 0).addBox(-25.0F, -32.0F, -40.0F, 25.0F, 15.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 6.0F, -10.0F, -0.48F, 0.0F, 0.0F));

        PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-25.0F, -34.0F, -7.0F, 25.0F, 15.0F, 42.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 6.0F, -10.0F, -0.1745F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 512, 256);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bb_main.render(poseStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

    }
}