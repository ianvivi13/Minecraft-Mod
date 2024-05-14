package net.ianvivi13.lot_o_everything.datagen.loot;

import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.ianvivi13.lot_o_everything.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // region Ores
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ZINC_BLOCK.get());
        this.dropSelf(ModBlocks.ZINC_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_MAGNESIUM_BLOCK.get());
        this.dropSelf(ModBlocks.MAGNESIUM_BLOCK.get());

        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.LEAD_ORE.get(),
                block -> createOreDrop(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        this.add(ModBlocks.DEEPSLATE_LEAD_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        this.add(ModBlocks.TITANIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));
        this.add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));
        this.add(ModBlocks.TIN_ORE.get(),
                block -> createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.ZINC_ORE.get(),
                block -> createOreDrop(ModBlocks.ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.DEEPSLATE_ZINC_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.MAGNESIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.MAGNESIUM_ORE.get(), ModItems.RAW_MAGNESIUM.get()));
        this.add(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), ModItems.RAW_MAGNESIUM.get()));
        // endregion
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
