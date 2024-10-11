
package net.mcreator.minecraftplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.minecraftplus.init.MinecraftplusModFluids;

public class MercuryItem extends BucketItem {
	public MercuryItem() {
		super(MinecraftplusModFluids.MERCURY, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
