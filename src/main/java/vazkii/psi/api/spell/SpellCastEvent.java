/*
 * This class is distributed as a part of the Psi Mod.
 * Get the Source Code on GitHub:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: https://psi.vazkii.net/license.php
 */
package vazkii.psi.api.spell;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.Event;

import vazkii.psi.api.internal.IPlayerData;

/**
 * Posted after a spell successfully executes.
 *
 */
public class SpellCastEvent extends Event {

	public final Spell spell;
	public final SpellContext context;
	public final PlayerEntity player;
	public final IPlayerData playerData;
	public final ItemStack cad;
	public final ItemStack bullet;

	public SpellCastEvent(Spell spell, SpellContext context, PlayerEntity player, IPlayerData playerData, ItemStack cad, ItemStack bullet) {
		this.spell = spell;
		this.context = context;
		this.player = player;
		this.playerData = playerData;
		this.cad = cad;
		this.bullet = bullet;
	}

}
