package com.github.originsplus.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.github.originsplus.power.NoHorsePower;

import io.github.apace100.apoli.component.PowerHolderComponent;
import net.minecraft.entity.passive.HorseBaseEntity;
import net.minecraft.entity.player.PlayerEntity;

@Mixin(HorseBaseEntity.class)
public class HorseBaseEntityMixin {
	@Inject(method = "putPlayerOnBack", at = @At("HEAD"), cancellable = true)
	private void onTryPlayerMount(PlayerEntity player, CallbackInfo info) {
		if (PowerHolderComponent.hasPower(player, NoHorsePower.class)) {
			info.cancel();
		}
	}
}
