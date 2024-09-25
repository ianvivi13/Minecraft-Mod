package net.ianvivi13.lot_o_everything.worldgen;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {

    //region Ores
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_SILVER_ORE = registerKey("add_overworld_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_SILVER_ORE_BURIED = registerKey("add_overworld_silver_ore_buried");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_LEAD_ORE = registerKey("add_overworld_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_LEAD_ORE_EXTRA = registerKey("add_overworld_lead_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TITANIUM_ORE = registerKey("add_overworld_titanium_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TITANIUM_ORE_RARE = registerKey("add_overworld_titanium_ore_rare");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TITANIUM_ORE_EXTRA = registerKey("add_overworld_titanium_ore_extra");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_MAGNESIUM_ORE = registerKey("add_overworld_magnesium_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_MAGNESIUM_ORE_SMALL = registerKey("add_overworld_magnesium_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_ZINC_ORE = registerKey("add_overworld_zinc_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_ZINC_ORE_SMALL = registerKey("add_overworld_zinc_ore_small");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TIN_ORE = registerKey("add_overworld_tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TIN_ORE_BURIED = registerKey("add_overworld_tin_ore_buried");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_RUBY_ORE = registerKey("add_overworld_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_SAPPHIRE_ORE = registerKey("add_overworld_sapphire_ore");
    //endregion
    //region Trees
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_ICE_TREE_RARE = registerKey("add_overworld_ice_tree_rare");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_ICE_TREE = registerKey("add_overworld_ice_tree");
    //endregion

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        //region Ores
        context.register(ADD_OVERWORLD_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_SILVER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_SILVER_ORE_BURIED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_SILVER_ORE_BURIED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_LEAD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_LEAD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_LEAD_ORE_EXTRA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_LEAD_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_TITANIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_TITANIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_TITANIUM_ORE_RARE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_TITANIUM_ORE_RARE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_TITANIUM_ORE_EXTRA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_TITANIUM_ORE_EXTRA_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_MAGNESIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_MAGNESIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_MAGNESIUM_ORE_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_MAGNESIUM_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_ZINC_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ZINC_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_ZINC_ORE_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ZINC_ORE_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_TIN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_TIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_TIN_ORE_BURIED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_TIN_ORE_BURIED_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_RUBY_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_RUBY_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_SAPPHIRE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_SAPPHIRE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        //endregion
        //region Trees
        context.register(ADD_OVERWORLD_ICE_TREE_RARE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ICE_PLACED_RARE_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_OVERWORLD_ICE_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST), // TODO: Change to Snowy Taiga
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ICE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        //endregion
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(LotOEverythingMod.MOD_ID, name));
    }
}
