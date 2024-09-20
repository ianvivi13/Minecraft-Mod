package net.ianvivi13.lot_o_everything.datagen;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.ianvivi13.lot_o_everything.item.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        // region Ores
        AllDefaultOreRecipes(pRecipeOutput, ModBlocks.SILVER_ORE.get(), ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get(), ModItems.SILVER_INGOT.get(), 1.0F, ModBlocks.RAW_SILVER_BLOCK.get(), ModBlocks.SILVER_BLOCK.get());
        AllDefaultOreRecipes(pRecipeOutput, ModBlocks.LEAD_ORE.get(), ModBlocks.DEEPSLATE_LEAD_ORE.get(), ModItems.RAW_LEAD.get(), ModItems.LEAD_INGOT.get(), 0.7F, ModBlocks.RAW_LEAD_BLOCK.get(), ModBlocks.LEAD_BLOCK.get());
        AllDefaultOreRecipes(pRecipeOutput, ModBlocks.TITANIUM_ORE.get(), ModBlocks.DEEPSLATE_TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get(), ModItems.TITANIUM_INGOT.get(), 1.2F, ModBlocks.RAW_TITANIUM_BLOCK.get(), ModBlocks.TITANIUM_BLOCK.get());
        AllDefaultOreRecipes(pRecipeOutput, ModBlocks.TIN_ORE.get(), ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get(), ModItems.TIN_INGOT.get(), 0.2F, ModBlocks.RAW_TIN_BLOCK.get(), ModBlocks.TIN_BLOCK.get());
        AllDefaultOreRecipes(pRecipeOutput, ModBlocks.MAGNESIUM_ORE.get(), ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), ModItems.RAW_MAGNESIUM.get(), ModItems.MAGNESIUM_INGOT.get(), 0.7F, ModBlocks.RAW_MAGNESIUM_BLOCK.get(), ModBlocks.MAGNESIUM_BLOCK.get());
        AllDefaultOreRecipes(pRecipeOutput, ModBlocks.ZINC_ORE.get(), ModBlocks.DEEPSLATE_ZINC_ORE.get(), ModItems.RAW_ZINC.get(), ModItems.ZINC_INGOT.get(), 0.7F, ModBlocks.RAW_ZINC_BLOCK.get(), ModBlocks.ZINC_BLOCK.get());
        AllDefaultOreRecipes(pRecipeOutput, ModBlocks.RUBY_ORE.get(), ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get(), 1.0F, ModBlocks.RUBY_BLOCK.get());
        AllDefaultOreRecipes(pRecipeOutput, ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get(), 1.0F, ModBlocks.SAPPHIRE_BLOCK.get());
        // endregion
        // region Wood Stuff
        Door(pRecipeOutput, ModBlocks.TITANIUM_BLOCK.get(), ModBlocks.ICE_PLANKS.get());
        // endregion
        // region Quality of Life
        oreSmelting(pRecipeOutput, List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK, 0.7F * 9, 200, "copper_block");
        oreBlasting(pRecipeOutput, List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK, 0.7F * 9, 100, "copper_block");

        oreSmelting(pRecipeOutput, List.of(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK, 0.7F * 9, 200, "iron_block");
        oreBlasting(pRecipeOutput, List.of(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK, 0.7F * 9, 100, "iron_block");

        oreSmelting(pRecipeOutput, List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK, 0.7F * 9, 200, "gold_block");
        oreBlasting(pRecipeOutput, List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK, 0.7F * 9, 100, "gold_block");

        oreSmelting(pRecipeOutput, List.of(ModBlocks.RAW_SILVER_BLOCK.get()), RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get(), 0.7F * 9, 200, "silver_block");
        oreBlasting(pRecipeOutput, List.of(ModBlocks.RAW_SILVER_BLOCK.get()), RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get(), 0.7F * 9, 100, "silver_block");

        oreSmelting(pRecipeOutput, List.of(ModBlocks.RAW_LEAD_BLOCK.get()), RecipeCategory.MISC, ModBlocks.LEAD_BLOCK.get(), 0.7F * 9, 200, "lead_block");
        oreBlasting(pRecipeOutput, List.of(ModBlocks.RAW_LEAD_BLOCK.get()), RecipeCategory.MISC, ModBlocks.LEAD_BLOCK.get(), 0.7F * 9, 100, "lead_block");

        oreSmelting(pRecipeOutput, List.of(ModBlocks.RAW_TITANIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.TITANIUM_BLOCK.get(), 1.2F * 9, 200, "titanium_block");
        oreBlasting(pRecipeOutput, List.of(ModBlocks.RAW_TITANIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.TITANIUM_BLOCK.get(), 1.2F * 9, 100, "titanium_block");

        oreSmelting(pRecipeOutput, List.of(ModBlocks.RAW_TIN_BLOCK.get()), RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get(), 0.2F * 9, 200, "tin_block");
        oreBlasting(pRecipeOutput, List.of(ModBlocks.RAW_TIN_BLOCK.get()), RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get(), 0.2F * 9, 100, "tin_block");

        oreSmelting(pRecipeOutput, List.of(ModBlocks.RAW_ZINC_BLOCK.get()), RecipeCategory.MISC, ModBlocks.ZINC_BLOCK.get(), 0.7F * 9, 200, "zinc_block");
        oreBlasting(pRecipeOutput, List.of(ModBlocks.RAW_ZINC_BLOCK.get()), RecipeCategory.MISC, ModBlocks.ZINC_BLOCK.get(), 0.7F * 9, 100, "zinc_block");

        oreSmelting(pRecipeOutput, List.of(ModBlocks.RAW_MAGNESIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.MAGNESIUM_BLOCK.get(), 0.7F * 9, 200, "magnesium_block");
        oreBlasting(pRecipeOutput, List.of(ModBlocks.RAW_MAGNESIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.MAGNESIUM_BLOCK.get(), 0.7F * 9, 100, "magnesium_block");
        // endregion

    }

    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    private static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<T> pSerializer, AbstractCookingRecipe.Factory<T> pRecipeFactory, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pSerializer, pRecipeFactory)
                    .group(pGroup)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, LotOEverythingMod.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }
    }

    protected void Door(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        doorBuilder(out, Ingredient.of(in))
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Trapdoor(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        trapdoorBuilder(out, Ingredient.of(in))
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Fence(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        fenceBuilder(out, Ingredient.of(in))
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Fencegate(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        fenceGateBuilder(out, Ingredient.of(in))
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Sign(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        signBuilder(out, Ingredient.of(in))
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Boat(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, out)
                .define('#', in)
                .pattern("# #")
                .pattern("###")
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Chestboat(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TRANSPORTATION, out, 1)
                .requires(in)
                .requires(Items.CHEST)
                .unlockedBy("has_" + out.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(out).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void OneToX(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in, int x) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, out, x)
                .requires(in)
                .unlockedBy("has_" + out.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(out).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Pressureplate(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        pressurePlateBuilder(RecipeCategory.REDSTONE, out, Ingredient.of(in))
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Slab(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, out, Ingredient.of(in))
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Wall(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, out, Ingredient.of(in))
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Stair(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        stairBuilder(out, Ingredient.of(in))
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void LogToWood(RecipeOutput pRecipeOutput, ItemLike out, ItemLike in) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, out, 3)
                .define('#', in)
                .pattern("##")
                .pattern("##")
                .unlockedBy("has_" + in.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(in).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + in.asItem());
    }

    protected void Surround(RecipeOutput pRecipeOutput, ItemLike out, ItemLike center, ItemLike outside, int quantity) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, out, quantity)
                .define('#', outside)
                .define('C', center)
                .pattern("###")
                .pattern("#C#")
                .pattern("###")
                .unlockedBy("has_" + outside.asItem(), inventoryTrigger(ItemPredicate.Builder.item().of(outside).build()))
                .save(pRecipeOutput, "bit_o_everything:" + out.asItem() + "_from_" + center.asItem() + "_and_" + outside.asItem());
    }

    protected void AllWoodRecipes(RecipeOutput pRecipeOutput, ItemLike log, ItemLike strippedLog, ItemLike wood, ItemLike strippedWood, ItemLike plank, ItemLike stair, ItemLike slab, ItemLike fence, ItemLike fenceGate, ItemLike door, ItemLike trapdoor, ItemLike sign, ItemLike button, ItemLike pressurePlate, ItemLike boat, ItemLike chestBoat) {
        LogToWood(pRecipeOutput, wood, log);
        LogToWood(pRecipeOutput, strippedWood, strippedLog);
        OneToX(pRecipeOutput, plank, log, 4);
        OneToX(pRecipeOutput, plank, strippedLog, 4);
        OneToX(pRecipeOutput, plank, wood, 4);
        OneToX(pRecipeOutput, plank, strippedWood, 4);

        Stair(pRecipeOutput, stair, plank);
        Slab(pRecipeOutput, slab, plank);
        Fence(pRecipeOutput, fence, plank);
        Fencegate(pRecipeOutput, fenceGate, plank);
        Door(pRecipeOutput, door, plank);
        Trapdoor(pRecipeOutput, trapdoor, plank);
        Sign(pRecipeOutput, sign, plank);
        OneToX(pRecipeOutput, button, plank,1);
        Pressureplate(pRecipeOutput, pressurePlate, plank);
        Boat(pRecipeOutput, boat, plank);
        Chestboat(pRecipeOutput, chestBoat, boat);
    }

    protected void AllDefaultOreRecipes(RecipeOutput pRecipeOutput, ItemLike stoneOre, ItemLike deepslateOre, ItemLike rawMaterial, ItemLike smeltingResult, float smeltingExp, ItemLike rawBlock, ItemLike block) {
        oreSmelting(pRecipeOutput, List.of(stoneOre, deepslateOre, rawMaterial), RecipeCategory.MISC, smeltingResult, smeltingExp, 200, ForgeRegistries.ITEMS.getKey(smeltingResult.asItem()).getPath());
        oreBlasting(pRecipeOutput, List.of(stoneOre, deepslateOre, rawMaterial), RecipeCategory.MISC, smeltingResult, smeltingExp, 100, ForgeRegistries.ITEMS.getKey(smeltingResult.asItem()).getPath());
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, rawMaterial, RecipeCategory.BUILDING_BLOCKS, rawBlock);
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, smeltingResult, RecipeCategory.BUILDING_BLOCKS, block);
    }

    protected void AllDefaultOreRecipes(RecipeOutput pRecipeOutput, ItemLike stoneOre, ItemLike deepslateOre, ItemLike smeltingResult, float smeltingExp, ItemLike block) {
        oreSmelting(pRecipeOutput, List.of(stoneOre, deepslateOre), RecipeCategory.MISC, smeltingResult, smeltingExp, 200, ForgeRegistries.ITEMS.getKey(smeltingResult.asItem()).getPath());
        oreBlasting(pRecipeOutput, List.of(stoneOre, deepslateOre), RecipeCategory.MISC, smeltingResult, smeltingExp, 100, ForgeRegistries.ITEMS.getKey(smeltingResult.asItem()).getPath());
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, smeltingResult, RecipeCategory.BUILDING_BLOCKS, block);
    }

    private static Criterion<InventoryChangeTrigger.TriggerInstance> inventoryTrigger(ItemPredicate... pPredicates) {
        return CriteriaTriggers.INVENTORY_CHANGED
                .createCriterion(new InventoryChangeTrigger.TriggerInstance(Optional.empty(), InventoryChangeTrigger.TriggerInstance.Slots.ANY, List.of(pPredicates)));
    }

}
