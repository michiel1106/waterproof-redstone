package bikerboys.waterproofredstone.block;

import bikerboys.waterproofredstone.WaterproofRedstone;


import bikerboys.waterproofredstone.block.customblock.WaterproofRedstoneWire;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;


public class ModBlocks {
    public static final Block WATERPROOF_REDSTONE = registerBlock("waterproof_redstone", new WaterproofRedstoneWire(FabricBlockSettings.copyOf(Blocks.REDSTONE_WIRE).nonOpaque()));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(WaterproofRedstone.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(WaterproofRedstone.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        WaterproofRedstone.LOGGER.info("logging the registering wallnstuff");

    }
}
