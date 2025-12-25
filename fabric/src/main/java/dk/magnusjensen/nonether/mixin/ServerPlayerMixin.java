package dk.magnusjensen.nonether.mixin;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.portal.DimensionTransition;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayer.class)
public class ServerPlayerMixin {

    @Inject(at = @org.spongepowered.asm.mixin.injection.At("HEAD"), method = "changeDimension", cancellable = true)
    public void changeDimension(DimensionTransition transition, CallbackInfoReturnable<Entity> cir) {
        cir.setReturnValue(null);
        cir.cancel();
    }
}
