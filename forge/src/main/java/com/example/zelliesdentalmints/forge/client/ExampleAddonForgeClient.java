package com.example.zelliesdentalmints.forge.client;

import com.example.zelliesdentalmints.ExampleAddon;
import com.example.zelliesdentalmints.client.ExampleAddonClient;
import com.example.zelliesdentalmints.client.register.EntityRendererRegister;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD, modid = ExampleAddon.MOD_ID)
public class ExampleAddonForgeClient {
    @SubscribeEvent
    public static void handleClientSetup(final FMLClientSetupEvent event) {
        ExampleAddonClient.init();
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onRegisterEntityRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        EntityRendererRegister.register(new EntityRendererRegister.EntityRendererRegistrar() {
            @Override
            public <T extends Entity> void register(Supplier<? extends EntityType<? extends T>> type, EntityRendererProvider<T> rendererProvider) {
                event.registerEntityRenderer(type.get(), rendererProvider);
            }
        });
    }
}
