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
                .add(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.ICE_LOG.get())
                .add(ModBlocks.ICE_PLANKS.get())
                .add(ModBlocks.ICE_WOOD.get())
                .add(ModBlocks.STRIPPED_ICE_LOG.get())
                .add(ModBlocks.STRIPPED_ICE_WOOD.get())
                .add(ModBlocks.ICE_SLAB.get())
                .add(ModBlocks.ICE_STAIRS.get())
                .add(ModBlocks.ICE_TRAPDOOR.get())
                .add(ModBlocks.ICE_DOOR.get())
                .add(ModBlocks.ICE_FENCE.get())
                .add(ModBlocks.ICE_FENCE_GATE.get())
                .add(ModBlocks.ICE_BUTTON.get())
                .add(ModBlocks.ICE_PRESSURE_PLATE.get())
                .add(ModBlocks.ICE_SIGN.get())
                .add(ModBlocks.ICE_WALL_SIGN.get())
                .add(ModBlocks.ICE_HANGING_SIGN.get())
                .add(ModBlocks.ICE_WALL_HANGING_SIGN.get());

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
                .add(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RAW_LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_ORE.get())
                .add(ModBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get());

        this.tag(BlockTags.LOGS_THAT_BURN);

        this.tag(BlockTags.LOGS)
                .add(ModBlocks.ICE_LOG.get());

        this.tag(BlockTags.ICE)
                .add(ModBlocks.ICE_LOG.get())
                .add(ModBlocks.ICE_PLANKS.get())
                .add(ModBlocks.ICE_WOOD.get())
                .add(ModBlocks.ICE_LEAVES.get())
                .add(ModBlocks.STRIPPED_ICE_LOG.get())
                .add(ModBlocks.STRIPPED_ICE_WOOD.get())
                .add(ModBlocks.ICE_SLAB.get())
                .add(ModBlocks.ICE_STAIRS.get())
                .add(ModBlocks.ICE_TRAPDOOR.get())
                .add(ModBlocks.ICE_DOOR.get())
                .add(ModBlocks.ICE_FENCE.get())
                .add(ModBlocks.ICE_FENCE_GATE.get())
                .add(ModBlocks.ICE_BUTTON.get())
                .add(ModBlocks.ICE_PRESSURE_PLATE.get())
                .add(ModBlocks.ICE_SIGN.get())
                .add(ModBlocks.ICE_WALL_SIGN.get())
                .add(ModBlocks.ICE_HANGING_SIGN.get())
                .add(ModBlocks.ICE_WALL_HANGING_SIGN.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.ICE_PLANKS.get());

        this.tag(BlockTags.SLABS)
                .add(ModBlocks.ICE_SLAB.get());

        this.tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.ICE_SLAB.get());

        this.tag(BlockTags.STAIRS)
                .add(ModBlocks.ICE_STAIRS.get());

        this.tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.ICE_STAIRS.get());

        this.tag(BlockTags.TRAPDOORS);

        this.tag(BlockTags.WOODEN_TRAPDOORS);

        this.tag(BlockTags.DOORS)
                .add(ModBlocks.ICE_DOOR.get());

        this.tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.ICE_DOOR.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.ICE_FENCE.get());

        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.ICE_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.ICE_FENCE_GATE.get());

        this.tag(BlockTags.BUTTONS)
                .add(ModBlocks.ICE_BUTTON.get());

        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.ICE_BUTTON.get());

        this.tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.ICE_PRESSURE_PLATE.get());

        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.ICE_PRESSURE_PLATE.get());

        this.tag(BlockTags.SIGNS)
                .add(ModBlocks.ICE_SIGN.get())
                .add(ModBlocks.ICE_WALL_SIGN.get())
                .add(ModBlocks.ICE_HANGING_SIGN.get())
                .add(ModBlocks.ICE_WALL_HANGING_SIGN.get());

        this.tag(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.ICE_SIGN.get());

        this.tag(BlockTags.WALL_SIGNS)
                .add(ModBlocks.ICE_WALL_SIGN.get());

        this.tag(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.ICE_HANGING_SIGN.get());

        this.tag(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.ICE_WALL_HANGING_SIGN.get());

        this.tag(BlockTags.SAPLINGS)
                .add(ModBlocks.ICE_SAPLING.get());
    }
}
