package com.example.zelliesdentalmints.common.register;

import com.example.zelliesdentalmints.ExampleAddon;
import com.example.zelliesdentalmints.common.stand.SoftAndWetEntity;
import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public interface EntityTypeRegistry {
    DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ExampleAddon.MOD_ID, Registries.ENTITY_TYPE);

    RegistrySupplier<EntityType<SoftAndWetEntity>> SOFT_AND_WET = REGISTRY.register("soft_and_wet", () ->
            EntityType.Builder.of((EntityType.EntityFactory<SoftAndWetEntity>)
                            (t, level) -> new SoftAndWetEntity(level),
                            MobCategory.CREATURE)
                    .sized(0.6f, 1.8f)
                    .build("soft_and_wet"));

    static void registerAttributes() {
        EntityAttributeRegistry.register(SOFT_AND_WET, SoftAndWetEntity::createMobAttributes);
    }
}
