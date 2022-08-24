package sakiayane.flyspeed;

import org.bukkit.plugin.java.JavaPlugin;
import sakiayane.flyspeed.Command.*;

import java.util.Objects;
import java.util.logging.Logger;

public final class Flyspeed extends JavaPlugin {

    @Override
    public void onEnable() {
        
        Logger logger = this.getLogger();
        logger.info("FlySpeedChanger Enabled!");


        this.getCommand("Fly-disabled").setExecutor(new FlyDisabled());
        this.getCommand("Fly").setExecutor(new NormalFlyspeed());
        this.getCommand("WalkSpeedDisabled").setExecutor(new WalkSpeedDisabled());
        this.getCommand("WalkSpeedBoost").setExecutor(new WalkSpeedBooster());
        this.getCommand("FlySpeedBooster").setExecutor(new FlySpeedBooster());



    }

    @Override
    public void onDisable() {
        Logger logger = this.getLogger();
        logger.info("FlySpeedChanger Disabled!");

    }
}
