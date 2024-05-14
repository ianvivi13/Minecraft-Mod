package net.ianvivi13.lot_o_everything.datagen;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LotOEverythingMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //this.tag(ModTags.Blocks.sometag)
                //.add(ModBlocks.RAW_SILVER_BLOCK.get()).addTag(Tags.Blocks.someothertag)

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RAW_SILVER_BLOCK.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.RAW_LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_ORE.get())
                .add(ModBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(ModBlocks.RAW_TITANIUM_BLOCK.get())
                .add(ModBlocks.TITANIUM_BLOCK.get())
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ModBlocks.RAW_ZINC_BLOCK.get())
                .add(ModBlocks.ZINC_BLOCK.get())
                .add(ModBlocks.ZINC_ORE.get())
                .add(ModBlocks.DEEPSLATE_ZINC_ORE.get())
                .add(ModBlocks.RAW_MAGNESIUM_BLOCK.get())
                .add(ModBlocks.MAGNESIUM_BLOCK.get())
                .add(ModBlocks.MAGNESIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_TITANIUM_BLOCK.get())
                .add(ModBlocks.TITANIUM_BLOCK.get())
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_SILVER_BLOCK.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.RAW_ZINC_BLOCK.get())
                .add(ModBlocks.ZINC_BLOCK.get())
                .add(ModBlocks.ZINC_ORE.get())
                .add(ModBlocks.DEEPSLATE_ZINC_ORE.get())
                .add(ModBlocks.RAW_MAGNESIUM_BLOCK.get())
                .add(ModBlocks.MAGNESIUM_BLOCK.get())
                .add(ModBlocks.MAGNESIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RAW_LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_ORE.get())
                .add(ModBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get());
    }
}
