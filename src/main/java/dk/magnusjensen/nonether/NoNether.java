package dk.magnusjensen.nonether;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("nonether")
public class NoNether {
    public static final String MOD_ID = "nonether";
    public NoNether() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
