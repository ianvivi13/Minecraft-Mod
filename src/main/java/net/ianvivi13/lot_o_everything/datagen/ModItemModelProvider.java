package net.ianvivi13.lot_o_everything.datagen;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LotOEverythingMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_SILVER.get());
        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.RAW_LEAD.get());
        basicItem(ModItems.LEAD_INGOT.get());
        basicItem(ModItems.RAW_TITANIUM.get());
        basicItem(ModItems.TITANIUM_INGOT.get());
        basicItem(ModItems.RAW_TIN.get());
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.RAW_ZINC.get());
        basicItem(ModItems.ZINC_INGOT.get());
        basicItem(ModItems.RAW_MAGNESIUM.get());
        basicItem(ModItems.MAGNESIUM_INGOT.get());
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.SAPPHIRE.get());

        basicItem(ModItems.ICE_BOAT);
        basicItem(ModItems.ICE_CHEST_BOAT);
    }
}
