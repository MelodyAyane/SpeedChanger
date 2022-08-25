package sakiayane.flyspeed;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import sakiayane.flyspeed.Command.*;
import sakiayane.flyspeed.EventHandler.JoinMessage;

import java.util.Objects;
import java.util.logging.Logger;

public final class Flyspeed extends JavaPlugin {

    @Override
    public void onEnable() {
        
        Logger logger = this.getLogger();
        logger.info("SpeedChanger Enabled!");
        logger.info("SpeedChanger Made By MelodyAyane");


        this.getCommand("Fly-disabled").setExecutor(new FlyDisabled());
        this.getCommand("Fly").setExecutor(new NormalFlyspeed());
        this.getCommand("WalkSpeedDisabled").setExecutor(new WalkSpeedDisabled());
        this.getCommand("WalkSpeedBoost").setExecutor(new WalkSpeedBooster());
        this.getCommand("FlySpeedBoost").setExecutor(new FlySpeedBooster());
        this.getCommand("schelp").setExecutor(new HelpCommand());

        Bukkit.getPluginManager().registerEvents(new JoinMessage(), this);



    }

    @Override
    public void onDisable() {
        Logger logger = this.getLogger();
        logger.info("SpeedChanger Disabled!");

    }
}
