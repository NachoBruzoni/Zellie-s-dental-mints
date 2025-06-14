package com.example.zelliesdentalmints.client.renderer.model;

import com.example.zelliesdentalmints.common.register.StandTypeRegistry;
import com.example.zelliesdentalmints.common.stand.SoftAndWetEntity;
import net.arna.jcraft.client.model.entity.stand.StandEntityModel;

public class SoftAndWetModel extends StandEntityModel<SoftAndWetEntity> {
    public SoftAndWetModel() {
        super(StandTypeRegistry.SOFT_AND_WET.get());
    }
}
