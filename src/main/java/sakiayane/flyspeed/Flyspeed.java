package sakiayane.flyspeed;

import org.bukkit.plugin.java.JavaPlugin;
import sakiayane.flyspeed.Command.Fly;
import sakiayane.flyspeed.Command.FlyDisabled;

import java.util.Objects;
import java.util.logging.Logger;

public final class Flyspeed extends JavaPlugin {

    @Override
    public void onEnable() {
        
        Logger logger = this.getLogger();
        logger.info("FlySpeedChanger Enabled!");
        
        this.getCommand("Fly").setExecutor(new Fly());
        this.getCommand("Fly-disabled").setExecutor(new FlyDisabled());



    }

    @Override
    public void onDisable() {
        Logger logger = this.getLogger();
        logger.info("FlySpeedChanger Disabled!");

    }
}
