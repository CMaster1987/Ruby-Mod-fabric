package cl.c_master.rubymod.utils;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks
{
    public static Block RUBY_ORE;
    public static Block RUBY_BLOCK;
    public static void init()
    {
        RUBY_ORE = RegistryHelper.registerBlock("ruby_ore", new Block(Block.Settings.copy(Blocks.COBBLESTONE)));
        RUBY_BLOCK = RegistryHelper.registerBlock("ruby_block", new Block(Block.Settings.of(Material.METAL, MaterialColor.MAGENTA).sounds(BlockSoundGroup.METAL).requiresTool().strength(4.0F, 6.0F)));

        RegistryHelper.registerBlockItem(RUBY_ORE, ItemGroup.BUILDING_BLOCKS);
        RegistryHelper.registerBlockItem(RUBY_BLOCK, ItemGroup.BUILDING_BLOCKS);
    }
}
