package de.srendi.intelligencetweaks.mixin;

import net.minecraft.network.NettyCompressionDecoder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = {NettyCompressionDecoder.class}, priority = 1000000)
public class PacketInflaterMixin {

    @ModifyConstant(method = "decode", constant = {@Constant(intValue = 2097152)}, remap = false)
    public int intelligencetweaks(int old) {
        return 200000;
    }
}
