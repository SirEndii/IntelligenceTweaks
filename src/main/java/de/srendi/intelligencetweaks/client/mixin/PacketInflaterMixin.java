package de.srendi.intelligencetweaks.client.mixin;

import net.minecraft.network.NettyCompressionDecoder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(NettyCompressionDecoder.class)
public class PacketInflaterMixin {
    @OnlyIn(Dist.CLIENT)
    @ModifyConstant(method = "decode",constant = @Constant(intValue = 2097152))
    private int decode(int old) {
        //this does not work.
        //TODO: this should work.
        return 9097152;
    }
}
