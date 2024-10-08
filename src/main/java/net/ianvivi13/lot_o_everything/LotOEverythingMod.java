package net.ianvivi13.lot_o_everything;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.ianvivi13.lot_o_everything.block.entity.ModBlockEntities;
import net.ianvivi13.lot_o_everything.entity.ModEntities;
import net.ianvivi13.lot_o_everything.entity.client.ModBoatRenderer;
import net.ianvivi13.lot_o_everything.tabs.ModCreativeModeTabs;
import net.ianvivi13.lot_o_everything.item.ModItems;
import net.ianvivi13.lot_o_everything.util.ModWoodTypes;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import java.util.Map;

@Mod(LotOEverythingMod.MOD_ID)
public class LotOEverythingMod {
    public static final String MOD_ID = "lot_o_everything";

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final Map<RegistryObject<Block>, RegistryObject<Block>> POTTED_PLANTS = Maps.newHashMap();
    public static void addPottedPlant(RegistryObject<Block> plant, RegistryObject<Block> flowerPot) {
        POTTED_PLANTS.put(plant, flowerPot);
    }

    public LotOEverythingMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_LOG.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STRIPPED_ICE_LOG.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_WOOD.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STRIPPED_ICE_WOOD.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_PLANKS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_SLAB.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_STAIRS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_LEAVES.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_TRAPDOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_FENCE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_FENCE_GATE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_BUTTON.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_PRESSURE_PLATE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_SIGN.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_WALL_SIGN.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_HANGING_SIGN.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICE_WALL_HANGING_SIGN.get(), RenderType.translucent());
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RAW_SILVER);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.ICE);

            EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));
        }
    }
}
