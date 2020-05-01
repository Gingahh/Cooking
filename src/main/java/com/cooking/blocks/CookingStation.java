package com.cooking.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

/*@ObjectHolder(Cooking.MOD_ID)
@Mod.EventBusSubscriber(modid = Cooking.MOD_ID, bus = Bus.MOD)*/
public class CookingStation extends Block {
    public CookingStation() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.5f, 3.5f) //hardness is time to mine and resistance is for explosions
                .sound(SoundType.STONE)
                .harvestLevel(1) //tier of tool you need 0-3 wood-diamond
                .harvestTool(ToolType.PICKAXE)
        );
        //new BlockItem(BlockRegistry.COOKING_STATION.get(), new Item.Properties());
    }
}
