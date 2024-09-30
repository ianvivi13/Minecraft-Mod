package net.ianvivi13.lot_o_everything.util;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(LotOEverythingMod.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(LotOEverythingMod.MOD_ID, name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> IS_SNOWY_TAIGA = tag("is_snowy_taiga");
        public static final TagKey<Biome> IS_GROVE = tag("is_grove");

        private static TagKey<Biome> tag(String name) {
            return BiomeTags.create(ResourceLocation.fromNamespaceAndPath(LotOEverythingMod.MOD_ID, name));
        }
    }
}
