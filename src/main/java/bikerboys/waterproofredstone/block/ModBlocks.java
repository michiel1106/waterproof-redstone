package bikerboys.waterproofredstone.block;

import bikerboys.waterproofredstone.WaterproofRedstone;


import bikerboys.waterproofredstone.block.customblock.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.shape.VoxelShape;


public class ModBlocks {
    public static final Block WATERPROOF_REDSTONE = registerBlock("waterproof_redstone", new WaterproofRedstoneWire(FabricBlockSettings.copyOf(Blocks.REDSTONE_WIRE).nonOpaque()));
    public static final Block WATERPROOF_REPEATER = registerBlock("waterproof_repeater", new WaterproofRepeater(FabricBlockSettings.copyOf(Blocks.REPEATER).nonOpaque()));
    public static final Block WATERPROOF_STONE_BUTTON = registerBlock("waterproof_stone_button", new WaterproofStoneButton(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON).nonOpaque()));
    public static final Block WATERPROOF_LEVER = registerBlock("waterproof_lever", new WaterproofLever(FabricBlockSettings.copyOf(Blocks.LEVER).nonOpaque()));
    public static final Block WATERPROOF_COMPARATOR = registerBlock("waterproof_comparator", new WaterproofComparator(FabricBlockSettings.copyOf(Blocks.COMPARATOR).nonOpaque()));






    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(WaterproofRedstone.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(WaterproofRedstone.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        WaterproofRedstone.LOGGER.info("logging the registering wallnstuff");

    }
}
