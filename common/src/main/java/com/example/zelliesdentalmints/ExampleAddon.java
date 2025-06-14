package com.example.zelliesdentalmints;

import com.example.zelliesdentalmints.common.register.EntityTypeRegistry;
import com.example.zelliesdentalmints.common.register.StandTypeRegistry;
import net.minecraft.resources.ResourceLocation;

public final class ExampleAddon {
    public static final String MOD_ID = "zelliesdentalmints";

    public static void init() {
        EntityTypeRegistry.REGISTRY.register();
        StandTypeRegistry.REGISTRY.register();

        EntityTypeRegistry.registerAttributes();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
