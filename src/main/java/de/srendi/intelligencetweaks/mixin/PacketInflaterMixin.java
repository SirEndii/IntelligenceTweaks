package de.srendi.intelligencetweaks.mixin;

import de.srendi.intelligencetweaks.IntelligenceTweaks;
import net.minecraft.entity.monster.CreeperEntity;
import org.apache.logging.log4j.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.util.math.RayTraceResult;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.util.Timer;
@Mixin(CreeperEntity.class)
public class PacketInflaterMixin {

    //@Inject(method = "tick", at = @At(value = "FIELD", shift = At.Shift.AFTER, target = "Lnet/minecraft/entity.monster/CreeperEntity.tick.i:F"))
    //public void noice(CallbackInfo info) {
      //  IntelligenceTweaks.LOGGER.log(Level.ERROR, "Test works");
    //}
}
