package net.ianvivi13.lot_o_everything.entity.client;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation ICE_BOAT_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(LotOEverythingMod.MOD_ID, "boat/ice"), "main");
    public static final ModelLayerLocation ICE_CHEST_BOAT_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(LotOEverythingMod.MOD_ID, "chest_boat/ice"), "main");

}
