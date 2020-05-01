package com.cooking.util;

import net.minecraft.item.Food;

public class FoodBuilder{
    public static final Food ExampleFood = buildFood(5,0.5f,false);

    private static Food buildFood(int hunger, float saturation, boolean fastToEat) {
        if (fastToEat) return (new Food.Builder()).hunger(hunger).saturation(saturation).fastToEat().build();
        return (new Food.Builder()).hunger(hunger).saturation(saturation).build();
    }
}
