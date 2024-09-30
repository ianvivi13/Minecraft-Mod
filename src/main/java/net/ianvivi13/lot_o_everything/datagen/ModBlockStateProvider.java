package net.ianvivi13.lot_o_everything.datagen;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.ianvivi13.lot_o_everything.block.custom.IceRotatedPillarBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
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
        logBlock((IceRotatedPillarBlock) ModBlocks.ICE_LOG.get());
        blockItem(ModBlocks.ICE_LOG);

        logBlock((IceRotatedPillarBlock) ModBlocks.STRIPPED_ICE_LOG.get());
        blockItem(ModBlocks.STRIPPED_ICE_LOG);

        axisBlock((IceRotatedPillarBlock) ModBlocks.ICE_WOOD.get(), blockTexture(ModBlocks.ICE_LOG.get()), blockTexture(ModBlocks.ICE_LOG.get()));
        blockItem(ModBlocks.ICE_WOOD);

        axisBlock((IceRotatedPillarBlock) ModBlocks.STRIPPED_ICE_WOOD.get(), blockTexture(ModBlocks.STRIPPED_ICE_LOG.get()), blockTexture(ModBlocks.STRIPPED_ICE_LOG.get()));
        blockItem(ModBlocks.STRIPPED_ICE_WOOD);

        blockWithItem(ModBlocks.ICE_PLANKS);

        slabBlock((SlabBlock) ModBlocks.ICE_SLAB.get(), blockTexture(ModBlocks.ICE_PLANKS.get()), blockTexture(ModBlocks.ICE_PLANKS.get()));
        blockItem(ModBlocks.ICE_SLAB);

        stairsBlock((StairBlock) ModBlocks.ICE_STAIRS.get(), blockTexture(ModBlocks.ICE_PLANKS.get()));
        blockItem(ModBlocks.ICE_STAIRS);

        leavesBlock(ModBlocks.ICE_LEAVES);

        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.ICE_TRAPDOOR.get(), modLoc("block/ice_trapdoor"), true, "cutout");
        blockItem(ModBlocks.ICE_TRAPDOOR, "_bottom");

        doorBlockWithRenderType((DoorBlock) ModBlocks.ICE_DOOR.get(), modLoc("block/ice_door_bottom"), modLoc("block/ice_door_top"), "cutout");
        blockItem(ModBlocks.ICE_DOOR);

        fenceBlock((FenceBlock) ModBlocks.ICE_FENCE.get(), blockTexture(ModBlocks.ICE_PLANKS.get()));
        blockItem(ModBlocks.ICE_FENCE);

        fenceGateBlock((FenceGateBlock) ModBlocks.ICE_FENCE_GATE.get(), blockTexture(ModBlocks.ICE_PLANKS.get()));
        blockItem(ModBlocks.ICE_FENCE_GATE);

        buttonBlock((ButtonBlock) ModBlocks.ICE_BUTTON.get(), blockTexture(ModBlocks.ICE_PLANKS.get()));
        blockItem(ModBlocks.ICE_BUTTON);

        pressurePlateBlock((PressurePlateBlock) ModBlocks.ICE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ICE_PLANKS.get()));
        blockItem(ModBlocks.ICE_PRESSURE_PLATE);

        signBlock((StandingSignBlock) ModBlocks.ICE_SIGN.get(), (WallSignBlock) ModBlocks.ICE_WALL_SIGN.get(),
                blockTexture(ModBlocks.ICE_PLANKS.get()));
        hangingSignBlock(ModBlocks.ICE_HANGING_SIGN.get(), ModBlocks.ICE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.ICE_PLANKS.get()));

        saplingBlock(ModBlocks.ICE_SAPLING);
        // endregion
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

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(LotOEverythingMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                ResourceLocation.withDefaultNamespace("block/leaves"), "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    private void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }
}
