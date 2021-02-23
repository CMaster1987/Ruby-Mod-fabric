package cl.c_master.rubymod.utils;

import cl.c_master.rubymod.RubyMod;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryHelper
{
    //For Blocks!
	public static Block registerBlock(Identifier id, Block block)
	{
		return Registry.register(Registry.BLOCK, id, block);
	}
	public static Block registerBlock(String id, Block block)
	{
		return registerBlock(new Identifier(RubyMod.MODID, id), block);
	}
	
	//For Items!
	public static Item registerItem(Identifier id, Item item)
	{
		if (item instanceof BlockItem) {
			((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
		 }
		 
		return Registry.register(Registry.ITEM, id, item);
	}
	public static Item registerItem(String id, Item item)
	{
		return registerItem(new Identifier(RubyMod.MODID, id), item);
	}
	public static Item registerBlockItem(Block block, Item item)
	{
		return registerItem(Registry.BLOCK.getId(block), item);
	}
	public static Item registerBlockItem(BlockItem blockItem)
	{
		return registerBlockItem(blockItem.getBlock(), blockItem);
	}
	//Register the block!
	public static Item registerBlockItem(Block block, ItemGroup itemGroup)
	{
		return registerBlockItem(new BlockItem(block, new Item.Settings().group(itemGroup)));
	}
}
