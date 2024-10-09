
package net.mcreator.minecraftplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondMedallionItem extends Item {
	public DiamondMedallionItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
