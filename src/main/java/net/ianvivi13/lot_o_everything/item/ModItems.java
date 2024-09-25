package net.ianvivi13.lot_o_everything.item;

import net.ianvivi13.lot_o_everything.LotOEverythingMod;
import net.ianvivi13.lot_o_everything.block.ModBlocks;
import net.ianvivi13.lot_o_everything.entity.custom.ModBoatEntity;
import net.ianvivi13.lot_o_everything.item.custom.ModBoatItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LotOEverythingMod.MOD_ID);

    // region Ores
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    // endregion
    // region Wood Stuff
    public static final RegistryObject<Item> ICE_BOAT = ITEMS.register("ice_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.ICE, new Item.Properties()));
    public static final RegistryObject<Item> ICE_CHEST_BOAT = ITEMS.register("ice_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.ICE, new Item.Properties()));

    public static final RegistryObject<Item> ICE_SIGN = ITEMS.register("ice_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ICE_SIGN.get(), ModBlocks.ICE_WALL_SIGN.get()));
    public static final RegistryObject<Item> ICE_HANGING_SIGN = ITEMS.register("ice_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ICE_HANGING_SIGN.get(), ModBlocks.ICE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    // endregion

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
