/*
 * This class is distributed as a part of the Psi Mod.
 * Get the Source Code on GitHub:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: https://psi.vazkii.net/license.php
 */
package vazkii.psi.common.spell.selector;

import net.minecraft.item.ItemStack;

import vazkii.psi.api.PsiAPI;
import vazkii.psi.api.cad.ICAD;
import vazkii.psi.api.spell.Spell;
import vazkii.psi.api.spell.SpellContext;
import vazkii.psi.api.spell.SpellRuntimeException;
import vazkii.psi.api.spell.piece.PieceSelector;

public class PieceSelectorTime extends PieceSelector {

	public PieceSelectorTime(Spell spell) {
		super(spell);
	}

	@Override
	public Class<?> getEvaluationType() {
		return Double.class;
	}

	@Override
	public Object execute(SpellContext context) throws SpellRuntimeException {
		ItemStack cadStack = PsiAPI.getPlayerCAD(context.caster);
		if (cadStack != null && cadStack.getItem() instanceof ICAD) {
			return (double) ((ICAD) cadStack.getItem()).getTime(cadStack);
		} else {
			throw new SpellRuntimeException(SpellRuntimeException.NO_CAD);
		}
	}

}
