package com.example.zelliesdentalmints.fabric.datagen;

import com.example.zelliesdentalmints.common.register.StandTypeRegistry;
import com.example.zelliesdentalmints.common.stand.SoftAndWetEntity;
import net.arna.jcraft.api.stand.StandData;
import net.arna.jcraft.fabric.api.JCraftStandDataProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.resources.ResourceLocation;

import java.util.function.BiConsumer;

public class ExampleAddonStandDataProvider extends JCraftStandDataProvider {
    public ExampleAddonStandDataProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    protected void configure(BiConsumer<ResourceLocation, StandData> provider) {
        provider.accept(StandTypeRegistry.SOFT_AND_WET.getId(), SoftAndWetEntity.DATA);
    }
}
