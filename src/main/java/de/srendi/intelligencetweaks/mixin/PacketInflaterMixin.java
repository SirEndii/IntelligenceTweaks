package de.srendi.intelligencetweaks.mixin;

import net.minecraft.network.NettyCompressionDecoder;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(NettyCompressionDecoder.class)
public class PacketInflaterMixin {

    //@Inject(method = "tick", at = @At(value = "FIELD", shift = At.Shift.AFTER, target = "Lnet/minecraft/entity.monster/CreeperEntity.tick.i:F"))
    //public void noice(CallbackInfo info) {
      //  IntelligenceTweaks.LOGGER.log(Level.ERROR, "Test works");
    //}

    //TODO: Just create this
}
