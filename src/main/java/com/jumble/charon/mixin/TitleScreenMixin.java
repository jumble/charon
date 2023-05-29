package com.jumble.charon.mixin;

import com.jumble.charon.Charon;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
	@Inject(method = "init", at = @At("TAIL"))
	public void charon$onInit(CallbackInfo ci) {
		Charon.LOGGER.info("Hello from Charon's TitleScreenMixin!");
	}
}
