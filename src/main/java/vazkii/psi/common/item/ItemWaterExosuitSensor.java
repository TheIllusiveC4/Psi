/*
 * This class is distributed as a part of the Psi Mod.
 * Get the Source Code on GitHub:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: https://psi.vazkii.net/license.php
 */
package vazkii.psi.common.item;

import net.minecraft.item.ItemStack;

import vazkii.psi.api.exosuit.PsiArmorEvent;

public class ItemWaterExosuitSensor extends ItemExosuitSensor {

	public ItemWaterExosuitSensor(Properties properties) {
		super(properties);
	}

	@Override
	public int getColor(ItemStack stack) {
		return ItemExosuitSensor.underwaterColor;
	}

	@Override
	public String getEventType(ItemStack stack) {
		return PsiArmorEvent.UNDERWATER;
	}
}
