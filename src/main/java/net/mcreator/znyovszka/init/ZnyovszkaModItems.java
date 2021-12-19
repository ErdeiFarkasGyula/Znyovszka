
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.znyovszka.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZnyovszkaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item BLUE_ZNYOVSZKOVIUM_ORE = register(ZnyovszkaModBlocks.BLUE_ZNYOVSZKOVIUM_ORE, ZnyovszkaModTabs.TAB_ZNYOVSZKA_TAB);
	public static final Item BLUE_ZNYOVSZKOVIUM_BLOCK = register(ZnyovszkaModBlocks.BLUE_ZNYOVSZKOVIUM_BLOCK, ZnyovszkaModTabs.TAB_ZNYOVSZKA_TAB);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
