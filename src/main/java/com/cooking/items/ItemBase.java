package com.cooking.items;

import com.cooking.util.FoodBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    //Materials
    public static final Item ExampleItem = new ItemBase(new Item.Properties().group(ItemGroup.MATERIALS));
    //Food
    public static final Item ExampleFood = new ItemBase(new Item.Properties().group(ItemGroup.MATERIALS).food(FoodBuilder.ExampleFood));

    public ItemBase(Properties properties) {
        super(properties);
    }
}
