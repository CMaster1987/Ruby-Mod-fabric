package cl.c_master.rubymod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.*;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class MagicDustLanternBlock extends Block
{
    private static VoxelShape BASE = VoxelShapes.union(Block.createCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 2.0D, 11.0D),
                                                        Block.createCuboidShape(4.0D, 2.0D, 4.0D, 12.0D, 10.0D, 12.0D),
                                                        Block.createCuboidShape(5.0D, 10.0D, 5.0D, 11.0D, 12.0D, 11.0D));
    private static VoxelShape HANGED_BASE = VoxelShapes.union(Block.createCuboidShape(5.0D, 1.0D, 5.0D, 11.0D, 3.0D, 11.0D),
                                                        Block.createCuboidShape(4.0D, 3.0D, 4.0D, 12.0D, 11.0D, 12.0D),
                                                        Block.createCuboidShape(5.0D, 11.0D, 5.0D, 11.0D, 13.0D, 11.0D));
    private static BooleanProperty HANGING = Properties.HANGING;

    public MagicDustLanternBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(HANGING, false));
    }
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        Direction[] dir = ctx.getPlacementDirections();
        int dirVal = dir.length;
        for(int i = 0; i < dirVal; i++)
        {
            Direction direction = dir[i];
            if(direction.getAxis() == Direction.Axis.Y)
            {
                BlockState state = this.getDefaultState().with(HANGING, direction == Direction.UP);
                if(state.canPlaceAt(ctx.getWorld(), ctx.getBlockPos()))
                {
                    return state;
                }
            }
        }
        return null;
    }
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return state.get(HANGING) ? HANGED_BASE : BASE;
    }
    public void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(HANGING);
    }
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos)
    {
      Direction direction = attachedDirection(state).getOpposite();
        return Block.sideCoversSmallSquare(world, pos.offset(direction), direction.getOpposite());
    }
    protected static Direction attachedDirection(BlockState state)
    {
        return (Boolean)state.get(HANGING) ? Direction.DOWN : Direction.UP;
    }
    public PistonBehavior getPistonBehavior(BlockState state)
    {
        return PistonBehavior.DESTROY;
    }
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom)
    {
        return attachedDirection(state).getOpposite() == direction && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type)
    {
        return false;
    }
}
