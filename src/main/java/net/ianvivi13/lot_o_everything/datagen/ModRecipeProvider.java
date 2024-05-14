package net.ianvivi13.lot_o_everything.datagen;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.ianvivi13.lot_o_everything.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        // region Ores
        oreSmelting(pRecipeOutput, List.of(ModItems.RAW_SILVER.get(), ModBlocks.SILVER_ORE.get(), ModBlocks.DEEPSLATE_SILVER_ORE.get()), RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.0F, 200, "silver_ingot");
        oreBlasting(pRecipeOutput, List.of(ModItems.RAW_SILVER.get(), ModBlocks.SILVER_ORE.get(), ModBlocks.DEEPSLATE_SILVER_ORE.get()), RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1.0F, 100, "silver_ingot");

        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.RAW_SILVER.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SILVER_BLOCK.get());
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK.get());

        oreSmelting(pRecipeOutput, List.of(ModItems.RAW_LEAD.get(), ModBlocks.LEAD_ORE.get(), ModBlocks.DEEPSLATE_LEAD_ORE.get()), RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.7F, 200, "lead_ingot");
        oreBlasting(pRecipeOutput, List.of(ModItems.RAW_LEAD.get(), ModBlocks.LEAD_ORE.get(), ModBlocks.DEEPSLATE_LEAD_ORE.get()), RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.7F, 100, "lead_ingot");

        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.RAW_LEAD.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_LEAD_BLOCK.get());
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_BLOCK.get());

        oreSmelting(pRecipeOutput, List.of(ModItems.RAW_TITANIUM.get(), ModBlocks.TITANIUM_ORE.get(), ModBlocks.DEEPSLATE_TITANIUM_ORE.get()), RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 1.2F, 200, "titanium_ingot");
        oreBlasting(pRecipeOutput, List.of(ModItems.RAW_TITANIUM.get(), ModBlocks.TITANIUM_ORE.get(), ModBlocks.DEEPSLATE_TITANIUM_ORE.get()), RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 1.2F, 100, "titanium_ingot");

        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.RAW_TITANIUM.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TITANIUM_BLOCK.get());
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK.get());

        oreSmelting(pRecipeOutput, List.of(ModItems.RAW_TIN.get(), ModBlocks.TIN_ORE.get(), ModBlocks.DEEPSLATE_TIN_ORE.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.2F, 200, "tin_ingot");
        oreBlasting(pRecipeOutput, List.of(ModItems.RAW_TIN.get(), ModBlocks.TIN_ORE.get(), ModBlocks.DEEPSLATE_TIN_ORE.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.2F, 100, "tin_ingot");

        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.RAW_TIN.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TIN_BLOCK.get());
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIN_BLOCK.get());

        oreSmelting(pRecipeOutput, List.of(ModItems.RAW_ZINC.get(), ModBlocks.ZINC_ORE.get(), ModBlocks.DEEPSLATE_ZINC_ORE.get()), RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 0.7F, 200, "zinc_ingot");
        oreBlasting(pRecipeOutput, List.of(ModItems.RAW_ZINC.get(), ModBlocks.ZINC_ORE.get(), ModBlocks.DEEPSLATE_ZINC_ORE.get()), RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 0.7F, 100, "zinc_ingot");

        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.RAW_ZINC.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ZINC_BLOCK.get());
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZINC_BLOCK.get());

        oreSmelting(pRecipeOutput, List.of(ModItems.RAW_MAGNESIUM.get(), ModBlocks.MAGNESIUM_ORE.get(), ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get()), RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT.get(), 0.7F, 200, "magnesium_ingot");
        oreBlasting(pRecipeOutput, List.of(ModItems.RAW_MAGNESIUM.get(), ModBlocks.MAGNESIUM_ORE.get(), ModBlocks.DEEPSLATE_MAGNESIUM_ORE.get()), RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT.get(), 0.7F, 100, "magnesium_ingot");

        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.RAW_MAGNESIUM.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_MAGNESIUM_BLOCK.get());
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGNESIUM_BLOCK.get());

        oreSmelting(pRecipeOutput, List.of(ModItems.RUBY.get(), ModBlocks.RUBY_ORE.get(), ModBlocks.DEEPSLATE_RUBY_ORE.get()), RecipeCategory.MISC, ModItems.RUBY.get(), 1.0F, 200, "ruby");
        oreBlasting(pRecipeOutput, List.of(ModItems.RUBY.get(), ModBlocks.RUBY_ORE.get(), ModBlocks.DEEPSLATE_RUBY_ORE.get()), RecipeCategory.MISC, ModItems.RUBY.get(), 1.0F, 100, "ruby");

        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.RUBY.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK.get());

        oreSmelting(pRecipeOutput, List.of(ModItems.SAPPHIRE.get(), ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()), RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 1.0F, 200, "sapphire");
        oreBlasting(pRecipeOutput, List.of(ModItems.SAPPHIRE.get(), ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()), RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 1.0F, 100, "sapphire");

        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK.get());
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
}
