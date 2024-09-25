package net.ianvivi13.lot_o_everything.util;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType ICE = WoodType.register(new WoodType(LotOEverythingMod.MOD_ID + ":ice", BlockSetType.SPRUCE));
}
