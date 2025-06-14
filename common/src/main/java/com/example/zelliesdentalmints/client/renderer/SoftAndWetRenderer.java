package com.example.zelliesdentalmints.client.renderer;

import com.example.zelliesdentalmints.client.renderer.model.SoftAndWetModel;
import com.example.zelliesdentalmints.common.stand.SoftAndWetEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mod.azure.azurelib.cache.object.BakedGeoModel;
import net.arna.jcraft.client.renderer.entity.stands.StandEntityRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SoftAndWetRenderer extends StandEntityRenderer<SoftAndWetEntity> {
    public SoftAndWetRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SoftAndWetModel());
    }

    @Override
    public void actuallyRender(PoseStack poseStack, SoftAndWetEntity animatable, BakedGeoModel model, RenderType renderType,
                               MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick,
                               int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        float a = getAlpha(animatable, partialTick);
        super.actuallyRender(poseStack, animatable, model, renderType, bufferSource, buffer, isReRender, partialTick,
                packedLight, packedOverlay, red, green, blue, a);
    }
}
