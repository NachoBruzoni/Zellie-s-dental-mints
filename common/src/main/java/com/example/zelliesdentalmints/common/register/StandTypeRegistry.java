package com.example.zelliesdentalmints.common.register;

import com.example.zelliesdentalmints.ExampleAddon;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.arna.jcraft.api.JRegistries;
import net.arna.jcraft.api.stand.StandType;

public interface StandTypeRegistry {
    DeferredRegister<StandType> REGISTRY = DeferredRegister.create(ExampleAddon.MOD_ID, JRegistries.STAND_TYPE_REGISTRY_KEY);

    RegistrySupplier<StandType> SOFT_AND_WET = REGISTRY.register(ExampleAddon.id("soft_and_wet"), () ->
            StandType.of(ExampleAddon.id("soft_and_wet"), EntityTypeRegistry.SOFT_AND_WET));
}
