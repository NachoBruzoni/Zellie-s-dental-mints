package com.example.zelliesdentalmints.fabric.datagen;

import com.example.zelliesdentalmints.fabric.datagen.movesets.SoftAndWetMoveSetProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ExampleAddonDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGen) {
        FabricDataGenerator.Pack pack = dataGen.createPack();
        pack.addProvider(SoftAndWetMoveSetProvider::new);
        pack.addProvider(ExampleAddonStandDataProvider::new);
    }
}
