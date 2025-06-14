package com.example.zelliesdentalmints.client.register;

import com.example.zelliesdentalmints.client.renderer.SoftAndWetRenderer;
import com.example.zelliesdentalmints.common.register.EntityTypeRegistry;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import java.util.function.Supplier;

public interface EntityRendererRegister {
    static void register(EntityRendererRegistrar registrar) {
        registrar.register(EntityTypeRegistry.SOFT_AND_WET, SoftAndWetRenderer::new);
    }

    @FunctionalInterface
    interface EntityRendererRegistrar {
        <T extends Entity> void register(Supplier<? extends EntityType<? extends T>> type,
                                         EntityRendererProvider<T> rendererProvider);
    }
}
