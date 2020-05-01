package com.cooking.util;

import com.cooking.Cooking;
import com.cooking.blocks.CookingStation;
import com.cooking.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Cooking.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Cooking.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> ItemBase.ExampleItem);
    public static final RegistryObject<Item> EXAMPLE_FOOD = ITEMS.register("example_food", () -> ItemBase.ExampleFood);

    //Blocks
    public static final RegistryObject<Block> COOKING_STATION = BLOCKS.register("cooking_station", CookingStation::new);

    //Block Items
    public static final RegistryObject<Item> COOKING_STATION_ITEM = ITEMS.register("cooking_station", () -> new BlockItem(COOKING_STATION.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
