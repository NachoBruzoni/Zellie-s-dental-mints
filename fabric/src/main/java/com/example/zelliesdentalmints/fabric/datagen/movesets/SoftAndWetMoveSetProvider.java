package com.example.zelliesdentalmints.fabric.datagen.movesets;

import com.example.zelliesdentalmints.common.register.StandTypeRegistry;
import com.example.zelliesdentalmints.common.stand.SoftAndWetEntity;
import net.arna.jcraft.api.attack.MoveMap;
import net.arna.jcraft.api.attack.MoveSet;
import net.arna.jcraft.fabric.api.JCraftMoveSetProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import java.util.function.Consumer;

public class SoftAndWetMoveSetProvider extends JCraftMoveSetProvider<SoftAndWetEntity, SoftAndWetEntity.State> {
    public SoftAndWetMoveSetProvider(FabricDataOutput dataOutput) {
        super(dataOutput, MoveMap.Entry.codecFor(SoftAndWetEntity.State.class), StandTypeRegistry.SOFT_AND_WET.getId());
    }

    @Override
    protected void configureMoveSets(Consumer<MoveSet<SoftAndWetEntity, SoftAndWetEntity.State>> provider) {
        provider.accept(SoftAndWetEntity.MOVE_SET);
    }
}
