package dk.magnusjensen.nonether.mixin;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayer.class)
public class ServerPlayerMixin {

    @Inject(at = @org.spongepowered.asm.mixin.injection.At("HEAD"), method = "changeDimension", cancellable = true)
    public void changeDimension(ServerLevel destination, CallbackInfoReturnable<Entity> cir) {
        cir.setReturnValue(null);
        cir.cancel();
    }
}
