package net.ianvivi13.lot_o_everything.datagen;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LotOEverythingMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.RAW_LEAD);
        simpleItem(ModItems.LEAD_INGOT);
        simpleItem(ModItems.RAW_TITANIUM);
        simpleItem(ModItems.TITANIUM_INGOT);
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.RAW_ZINC);
        simpleItem(ModItems.ZINC_INGOT);
        simpleItem(ModItems.RAW_MAGNESIUM);
        simpleItem(ModItems.MAGNESIUM_INGOT);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LotOEverythingMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
