package net.ianvivi13.lot_o_everything.worldgen.tree;

import net.ianvivi13.lot_o_everything.worldgen.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Optional;

public class IceTreeGrower extends TreeGrower {

    public IceTreeGrower(String pName, Optional<ResourceKey<ConfiguredFeature<?, ?>>> pMegaTree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> pTree, Optional<ResourceKey<ConfiguredFeature<?, ?>>> pFlowers) {
        super(pName, pMegaTree, pTree, pFlowers);
    }

    @Nullable
    @Override
    public ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return ModConfiguredFeatures.ICE_SPRUCE;
    }
}
