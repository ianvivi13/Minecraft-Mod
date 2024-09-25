package net.ianvivi13.lot_o_everything.datagen;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.ianvivi13.lot_o_everything.block.custom.ModIceRotatedPillarBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
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

        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);

        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        // endregion
        // region Wood Stuff
        logBlock((ModIceRotatedPillarBlock)ModBlocks.ICE_LOG.get());
        logBlock((ModIceRotatedPillarBlock)ModBlocks.STRIPPED_ICE_LOG.get());
        axisBlock((ModIceRotatedPillarBlock)ModBlocks.ICE_WOOD.get(), blockTexture(ModBlocks.ICE_LOG.get()), blockTexture(ModBlocks.ICE_LOG.get()));
        axisBlock((ModIceRotatedPillarBlock)ModBlocks.STRIPPED_ICE_WOOD.get(), blockTexture(ModBlocks.STRIPPED_ICE_LOG.get()), blockTexture(ModBlocks.STRIPPED_ICE_LOG.get()));
        blockItem(ModBlocks.ICE_LOG);
        blockItem(ModBlocks.STRIPPED_ICE_LOG);
        blockItem(ModBlocks.ICE_WOOD);
        blockItem(ModBlocks.STRIPPED_ICE_WOOD);
        blockWithItem(ModBlocks.ICE_PLANKS);
        leavesBlock(ModBlocks.ICE_LEAVES);

        saplingBlock(ModBlocks.ICE_SAPLING);

        signBlock((StandingSignBlock) ModBlocks.ICE_SIGN.get(), (WallSignBlock) ModBlocks.ICE_WALL_SIGN.get(),
                blockTexture(ModBlocks.ICE_PLANKS.get()));
        hangingSignBlock(ModBlocks.ICE_HANGING_SIGN.get(), ModBlocks.ICE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.ICE_PLANKS.get()));
        // endregion
    }

    private void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    private void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(LotOEverythingMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                ResourceLocation.withDefaultNamespace("block/leaves"), "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
