package net.gabriele.clashofmobs.entity.pekka;

// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.gabriele.clashofmobs.Clashofmobs;
import net.gabriele.clashofmobs.entity.PekkaEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class PekkaModel<Type extends PekkaEntity> extends EntityModel<Type> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Clashofmobs.MOD_ID, "pekkamodel"), "main");
    private final ModelPart bb_main;

    public PekkaModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -38.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(23, 22).addBox(-5.0F, -28.0F, -3.0F, 10.0F, 14.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(-5.0F, -14.0F, -3.0F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(55, 22).mirror().addBox(5.0F, -28.0F, -3.0F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 22).addBox(0.0F, -14.0F, -3.0F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(55, 22).addBox(-10.0F, -28.0F, -3.0F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 42).addBox(-9.0F, -17.0F, -19.0F, 1.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(79, 0).addBox(-2.0F, -42.0F, -6.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(79, 0).addBox(-2.0F, -42.0F, 5.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 64);
    }



    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bb_main.render(poseStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

    }
}
