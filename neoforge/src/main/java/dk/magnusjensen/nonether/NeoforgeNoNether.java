package dk.magnusjensen.nonether;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityTravelToDimensionEvent;

@Mod(Constants.MOD_ID)
@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
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