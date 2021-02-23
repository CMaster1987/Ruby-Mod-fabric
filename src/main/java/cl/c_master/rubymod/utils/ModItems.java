package cl.c_master.rubymod.utils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems
{
    public static Item RUBY;
    public static Item RUBY_FRAGMENTS;
    public static Item MAGIC_DUST;

    public static void init()
    {
        RUBY = RegistryHelper.registerItem("ruby", new Item(new Item.Settings().group(ItemGroup.MISC)));
        RUBY_FRAGMENTS = RegistryHelper.registerItem("ruby_fragments", new Item(new Item.Settings().group(ItemGroup.MISC)));
        MAGIC_DUST = RegistryHelper.registerItem("magic_dust", new Item(new Item.Settings().group(ItemGroup.MISC)));
    }
}
