/*
 * This class is distributed as a part of the Psi Mod.
 * Get the Source Code on GitHub:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: https://psi.vazkii.net/license.php
 */
package vazkii.psi.common.item.component;

import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import vazkii.psi.api.cad.ICADColorizer;

public class ItemCADColorizer extends ItemCADComponent implements ICADColorizer {

	private final DyeColor color;
	private final static String TAG_CONTRIBUTOR = "psi_contributor_name";

	public ItemCADColorizer(Item.Properties properties, DyeColor color) {
		super(properties);
		this.color = color;
	}

	public ItemCADColorizer(Properties properties) {
		super(properties);
		color = DyeColor.BLACK;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public int getColor(ItemStack stack) {
		return color.getColorValue();
	}

	@Override
	public String getContributorName(ItemStack stack) {
		return stack.getOrCreateTag().getString(TAG_CONTRIBUTOR);
	}

	private static String getProperDyeName(DyeColor color) {
		return color.getName();
	}

	@Override
	public void setContributorName(ItemStack stack, String name) {
		stack.getOrCreateTag().putString(TAG_CONTRIBUTOR, name);
	}
}
