package me.seafoam.minecraft.ununtoggle.mixin;

import net.minecraft.client.option.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyBinding.class)
public class KeyBindingMixin {

	@Inject(at = @At("HEAD"), method = "untoggleStickyKeys", cancellable = true)
	private static void untoggleStickyKeys(CallbackInfo info) {
		info.cancel();
	}
}