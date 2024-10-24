package bikerboys.waterproofredstone;

import bikerboys.waterproofredstone.block.ModBlocks;

import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.util.registry.RegistryKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class WaterproofRedstone implements ModInitializer {
	public static final String MOD_ID = "waterproof-redstone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {





		ModBlocks.registerModBlocks();
		
	}
}