package com.github.originsplus.power;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import net.minecraft.entity.LivingEntity;

public class NoHorsePower extends Power {
	public NoHorsePower(PowerType<?> type, LivingEntity player) {
		super(type, player);
	}
}
