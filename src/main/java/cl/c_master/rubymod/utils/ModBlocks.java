package cl.c_master.rubymod.utils;

import cl.c_master.rubymod.block.MagicDustLanternBlock;
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
    public static Block MAGIC_DUST_LANTERN;
    public static void init()
    {
        RUBY_ORE = RegistryHelper.registerBlock("ruby_ore", new Block(Block.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)));
        RUBY_BLOCK = RegistryHelper.registerBlock("ruby_block", new Block(Block.Settings.of(Material.METAL, MaterialColor.MAGENTA)
        .sounds(BlockSoundGroup.METAL).requiresTool().strength(5.0F, 6.0F)));
        MAGIC_DUST_LANTERN = RegistryHelper.registerBlock("magic_dust_lantern", new MagicDustLanternBlock(Block.Settings.of(Material.METAL)
        .sounds(BlockSoundGroup.LANTERN).requiresTool()
        .luminance((state) -> {return 13;}).strength(3.5F).nonOpaque()));

        RegistryHelper.registerBlockItem(RUBY_ORE, ItemGroup.BUILDING_BLOCKS);
        RegistryHelper.registerBlockItem(RUBY_BLOCK, ItemGroup.BUILDING_BLOCKS);
        RegistryHelper.registerBlockItem(MAGIC_DUST_LANTERN, ItemGroup.DECORATIONS);
    }
}
