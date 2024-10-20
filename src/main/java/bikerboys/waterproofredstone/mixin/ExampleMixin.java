package bikerboys.waterproofredstone.mixin;

import bikerboys.waterproofredstone.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(RedstoneWireBlock.class)
public class ExampleMixin {


	/**
	 * @author me
	 * @reason me
	 */
	@Overwrite
	public static boolean connectsTo(BlockState state, @Nullable Direction dir) {
		if (state.isOf(Blocks.REDSTONE_WIRE) || state.isOf(ModBlocks.WATERPROOF_REDSTONE)) {
			return true;
		} else if (state.isOf(Blocks.REPEATER)) {
			Direction direction = (Direction)state.get(RepeaterBlock.FACING);
			return direction == dir || direction.getOpposite() == dir;
		} else if (state.isOf(Blocks.OBSERVER)) {
			return dir == state.get(ObserverBlock.FACING);
		} else {
			return state.emitsRedstonePower() && dir != null;
		}
	}
}