package net.ianvivi13.lot_o_everything.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;

public class IceLeavesBlock extends LeavesBlock {
    public IceLeavesBlock(Properties properties) {
        super(properties);
    }

    public static BlockState meltsInto() {
        return Blocks.WATER.defaultBlockState();
    }

    @Override
    protected void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pLevel.getBrightness(LightLayer.BLOCK, pPos) > 11 - pState.getLightBlock(pLevel, pPos)) {
            this.melt(pState, pLevel, pPos);
        }
        if (this.decaying(pState)) {
            dropResources(pState, pLevel, pPos);
            pLevel.removeBlock(pPos, false);
        }
    }

    protected void melt(BlockState pState, Level pLevel, BlockPos pPos) {
        if (pLevel.dimensionType().ultraWarm()) {
            pLevel.removeBlock(pPos, false);
        } else {
            pLevel.setBlockAndUpdate(pPos, meltsInto());
            pLevel.neighborChanged(pPos, meltsInto().getBlock(), pPos);
        }
    }
}
