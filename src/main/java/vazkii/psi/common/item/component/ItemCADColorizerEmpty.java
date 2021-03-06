/*
 * This class is distributed as a part of the Psi Mod.
 * Get the Source Code on GitHub:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: https://psi.vazkii.net/license.php
 */
package vazkii.psi.common.item.component;

import net.minecraft.item.ItemStack;

public class ItemCADColorizerEmpty extends ItemCADColorizer {

	public ItemCADColorizerEmpty(Properties properties) {
		super(properties);
	}

	@Override
	public int getColor(ItemStack stack) {
		return 0x080808;
	}
}
