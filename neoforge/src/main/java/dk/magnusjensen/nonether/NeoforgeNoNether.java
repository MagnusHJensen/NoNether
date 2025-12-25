package dk.magnusjensen.nonether;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class NeoforgeNoNether {
    
    public NeoforgeNoNether() {
        CommonClass.init();
        
    }

    @SubscribeEvent
    public static void onPlayerTravelToNether(EntityTravelToDimensionEvent event) {
        if (!event.getDimension().equals(Level.NETHER)) return;
        if (event.getEntity() instanceof Player) {
            event.setCanceled(true);
        }
    }
}