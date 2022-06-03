package com.scarzehd.technicaltome.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(TitleScreen.class)
public interface SplashTextSetter {
    @Accessor("splashText")
    public void setSplashText(String splashText);
}