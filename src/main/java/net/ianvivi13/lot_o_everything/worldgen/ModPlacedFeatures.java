package net.ianvivi13.lot_o_everything.worldgen;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    //region Ores
    public static final ResourceKey<PlacedFeature> OVERWORLD_SILVER_ORE_PLACED_KEY = registerKey("overworld_silver_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_SILVER_ORE_BURIED_PLACED_KEY = registerKey("overworld_silver_ore_buried_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_LEAD_ORE_PLACED_KEY = registerKey("overworld_lead_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_LEAD_ORE_EXTRA_PLACED_KEY = registerKey("overworld_lead_ore_extra_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_TITANIUM_ORE_PLACED_KEY = registerKey("overworld_titanium_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_TITANIUM_ORE_RARE_PLACED_KEY = registerKey("overworld_titanium_ore_rare_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_TITANIUM_ORE_EXTRA_PLACED_KEY = registerKey("overworld_titanium_ore_extra_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_MAGNESIUM_ORE_PLACED_KEY = registerKey("overworld_magnesium_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_MAGNESIUM_ORE_SMALL_PLACED_KEY = registerKey("overworld_magnesium_ore_small_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_ZINC_ORE_PLACED_KEY = registerKey("overworld_zinc_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_ZINC_ORE_SMALL_PLACED_KEY = registerKey("overworld_zinc_ore_small_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_TIN_ORE_PLACED_KEY = registerKey("overworld_tin_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_TIN_ORE_BURIED_PLACED_KEY = registerKey("overworld_tin_ore_buried_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_RUBY_ORE_PLACED_KEY = registerKey("overworld_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_SAPPHIRE_ORE_PLACED_KEY = registerKey("overworld_sapphire_ore_placed");
    //endregion
    //region Trees
    public static final ResourceKey<PlacedFeature> ICE_PLACED_RARE_KEY = registerKey("ice_placed_rare");
    public static final ResourceKey<PlacedFeature> ICE_PLACED_TAIGA_KEY = registerKey("ice_placed_taiga");
    public static final ResourceKey<PlacedFeature> ICE_PLACED_GROVE_KEY = registerKey("ice_placed_grove");
    //endregion

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //region Ores
        register(context, OVERWORLD_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        register(context, OVERWORLD_SILVER_ORE_BURIED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILVER_ORE_BURIED_KEY),
                ModOrePlacement.orePlacement(CountPlacement.of(UniformInt.of(0, 1)), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-48))));

        register(context, OVERWORLD_LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(80))));

        register(context, OVERWORLD_LEAD_ORE_EXTRA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LEAD_ORE_EXTRA_KEY),
                ModOrePlacement.orePlacement(CountPlacement.of(UniformInt.of(1, 8)), HeightRangePlacement.uniform(VerticalAnchor.absolute(-36), VerticalAnchor.absolute(128))));

        register(context, OVERWORLD_TITANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TITANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(16))));

        register(context, OVERWORLD_TITANIUM_ORE_RARE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TITANIUM_ORE_RARE_KEY),
                ModOrePlacement.rareOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(32))));

        register(context, OVERWORLD_TITANIUM_ORE_EXTRA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TITANIUM_ORE_KEY),
                ModOrePlacement.orePlacement(CountPlacement.of(UniformInt.of(0, 2)), HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(32))));

        register(context, OVERWORLD_MAGNESIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_MAGNESIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(56))));

        register(context, OVERWORLD_MAGNESIUM_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_MAGNESIUM_ORE_SMALL_KEY),
                ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(72))));

        register(context, OVERWORLD_ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ZINC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.absolute(-36), VerticalAnchor.absolute(42))));

        register(context, OVERWORLD_ZINC_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ZINC_ORE_SMALL_KEY),
                ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(72))));

        register(context, OVERWORLD_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(20, HeightRangePlacement.uniform(VerticalAnchor.absolute(136), VerticalAnchor.top())));

        register(context, OVERWORLD_TIN_ORE_BURIED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TIN_ORE_BURIED_KEY),
                ModOrePlacement.commonOrePlacement(15, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(192))));

        register(context, OVERWORLD_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(100, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(480))));

        register(context, OVERWORLD_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(100, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(480))));
        //endregion
        //region Trees
        register(context, ICE_PLACED_RARE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ICE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        ModBlocks.ICE_SAPLING.get()));

        register(context, ICE_PLACED_TAIGA_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ICE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.ICE_SAPLING.get()));

        register(context, ICE_PLACED_GROVE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ICE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1)));
        //endregion
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(LotOEverythingMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
