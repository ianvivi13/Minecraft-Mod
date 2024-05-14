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

    public static final RegistryObject<CreativeModeTab> RAW_MINERALS_TAB = CREATIVE_MODE_TABS.register("raw_minerals_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.RAW_GOLD))
                    .title(Component.translatable("creativetab.raw_minerals_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Add items to tab

                        pOutput.accept(Items.RAW_COPPER);
                        pOutput.accept(Items.RAW_IRON);
                        pOutput.accept(Items.RAW_GOLD);
                        pOutput.accept(ModItems.RAW_SILVER.get());
                        pOutput.accept(Items.RAW_COPPER_BLOCK);
                        pOutput.accept(Items.RAW_IRON_BLOCK);
                        pOutput.accept(Items.RAW_GOLD_BLOCK);
                        pOutput.accept(ModBlocks.RAW_SILVER_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
