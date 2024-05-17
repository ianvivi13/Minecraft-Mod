package net.ianvivi13.lot_o_everything.item;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LotOEverythingMod.MOD_ID);

    // Create tabs here

    public static final RegistryObject<CreativeModeTab> MODDED_ORES_TAB = CREATIVE_MODE_TABS.register("modded_ores_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_SILVER.get()))
                    .title(Component.translatable("creativetab.modded_ores_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Add items to tab

                        pOutput.accept(ModItems.RAW_SILVER.get());
                        pOutput.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        pOutput.accept(ModBlocks.SILVER_BLOCK.get());
                        pOutput.accept(ModBlocks.SILVER_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        pOutput.accept(ModItems.RAW_LEAD.get());
                        pOutput.accept(ModBlocks.RAW_LEAD_BLOCK.get());
                        pOutput.accept(ModBlocks.LEAD_BLOCK.get());
                        pOutput.accept(ModBlocks.LEAD_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_LEAD_ORE.get());
                        pOutput.accept(ModItems.RAW_TITANIUM.get());
                        pOutput.accept(ModBlocks.RAW_TITANIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.TITANIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.TITANIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        pOutput.accept(ModItems.RAW_TIN.get());
                        pOutput.accept(ModBlocks.RAW_TIN_BLOCK.get());
                        pOutput.accept(ModBlocks.TIN_BLOCK.get());
                        pOutput.accept(ModBlocks.TIN_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                        pOutput.accept(ModItems.RAW_ZINC.get());
                        pOutput.accept(ModBlocks.RAW_ZINC_BLOCK.get());
                        pOutput.accept(ModBlocks.ZINC_BLOCK.get());
                        pOutput.accept(ModBlocks.ZINC_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ZINC_ORE.get());
                        pOutput.accept(ModItems.RAW_MAGNESIUM.get());
                        pOutput.accept(ModBlocks.RAW_MAGNESIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.MAGNESIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.MAGNESIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get());
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MODDED_WOOD_TAB = CREATIVE_MODE_TABS.register("modded_wood_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ICE_LOG.get()))
                    .title(Component.translatable("creativetab.modded_wood_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Add items to tab

                        pOutput.accept(ModBlocks.ICE_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_ICE_LOG.get());
                        pOutput.accept(ModBlocks.ICE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_ICE_WOOD.get());
                        pOutput.accept(ModBlocks.ICE_PLANKS.get());
                        pOutput.accept(ModBlocks.ICE_LEAVES.get());
                        pOutput.accept(ModItems.ICE_BOAT.get());
                        pOutput.accept(ModItems.ICE_CHEST_BOAT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
