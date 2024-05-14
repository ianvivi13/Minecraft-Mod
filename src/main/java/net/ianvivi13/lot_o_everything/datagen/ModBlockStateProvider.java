package net.ianvivi13.lot_o_everything.datagen;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LotOEverythingMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // region Ores
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);

        blockWithItem(ModBlocks.RAW_LEAD_BLOCK);
        blockWithItem(ModBlocks.LEAD_BLOCK);
        blockWithItem(ModBlocks.LEAD_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_LEAD_ORE);

        blockWithItem(ModBlocks.RAW_TITANIUM_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TITANIUM_ORE);

        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);

        blockWithItem(ModBlocks.RAW_ZINC_BLOCK);
        blockWithItem(ModBlocks.ZINC_BLOCK);
        blockWithItem(ModBlocks.ZINC_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ZINC_ORE);

        blockWithItem(ModBlocks.RAW_MAGNESIUM_BLOCK);
        blockWithItem(ModBlocks.MAGNESIUM_BLOCK);
        blockWithItem(ModBlocks.MAGNESIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MAGNESIUM_ORE);
        // endregion
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
