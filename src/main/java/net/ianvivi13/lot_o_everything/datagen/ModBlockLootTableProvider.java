package net.ianvivi13.lot_o_everything.datagen;

import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.ianvivi13.lot_o_everything.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;
import java.util.function.Function;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
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
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());

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
        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));
        this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));
        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get()));
        // endregion
        // region Wood Stuff
        this.dropWhenSilkTouch(ModBlocks.ICE_LOG.get());
        this.dropWhenSilkTouch(ModBlocks.STRIPPED_ICE_LOG.get());
        this.dropWhenSilkTouch(ModBlocks.ICE_WOOD.get());
        this.dropWhenSilkTouch(ModBlocks.STRIPPED_ICE_WOOD.get());
        this.dropWhenSilkTouch(ModBlocks.ICE_PLANKS.get());
        this.add(ModBlocks.ICE_SLAB.get(), block -> createIceSlabItemTable(ModBlocks.ICE_SLAB.get()));
        this.dropWhenSilkTouch(ModBlocks.ICE_STAIRS.get());
        this.add(ModBlocks.ICE_LEAVES.get(), block ->
                createLeavesDrops(ModBlocks.ICE_LEAVES.get(), ModBlocks.ICE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropWhenSilkTouch(ModBlocks.ICE_TRAPDOOR.get());
        this.add(ModBlocks.ICE_DOOR.get(), block -> createIceDoorItemTable(ModBlocks.ICE_DOOR.get()));
        this.dropWhenSilkTouch(ModBlocks.ICE_FENCE.get());
        this.dropWhenSilkTouch(ModBlocks.ICE_FENCE_GATE.get());
        this.dropWhenSilkTouch(ModBlocks.ICE_BUTTON.get());
        this.dropWhenSilkTouch(ModBlocks.ICE_PRESSURE_PLATE.get());

        this.iceSignDrop(ModBlocks.ICE_SIGN.get(), block -> createSilkTouchOnlyTable(ModItems.ICE_SIGN.get()));
        this.iceSignDrop(ModBlocks.ICE_WALL_SIGN.get(), block -> createSilkTouchOnlyTable(ModItems.ICE_SIGN.get()));
        this.iceSignDrop(ModBlocks.ICE_HANGING_SIGN.get(), block -> createSilkTouchOnlyTable(ModItems.ICE_HANGING_SIGN.get()));
        this.iceSignDrop(ModBlocks.ICE_WALL_HANGING_SIGN.get(), block -> createSilkTouchOnlyTable(ModItems.ICE_HANGING_SIGN.get()));

        this.dropSelf(ModBlocks.ICE_SAPLING.get());
        this.dropPottedContents(ModBlocks.POTTED_ICE_SAPLING.get());
        // endregion
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected void iceSignDrop(Block signBlock, Function<Block, LootTable.Builder> signItem) {
        this.add(signBlock, signItem);
    }

    protected LootTable.Builder createIceSlabItemTable(Block pBlock) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pBlock).apply(SetItemCountFunction
                        .setCount(ConstantValue.exactly(2.0F)).when(LootItemBlockStatePropertyCondition
                                .hasBlockStateProperties(pBlock)
                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                        .hasProperty(SlabBlock.TYPE, SlabType.DOUBLE)).and(this.hasSilkTouch()))))));
    }

    protected LootTable.Builder createIceDoorItemTable(Block pBlock) {
        return LootTable.lootTable().withPool(this.applyExplosionCondition(pBlock, LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(pBlock).when(
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                        .hasProperty(DoorBlock.HALF, DoubleBlockHalf.LOWER)).and(this.hasSilkTouch())))));
    }
}
