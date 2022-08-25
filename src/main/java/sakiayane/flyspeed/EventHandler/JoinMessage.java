package sakiayane.flyspeed.EventHandler;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinMessage implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("op"))
        player.sendMessage(ChatColor.AQUA + "欢迎使用SpeedChanger");
        player.sendMessage(ChatColor.AQUA + "Made By MelodyAyane");
        player.sendMessage(ChatColor.AQUA + "在使用本插件自定义任何移动速度时，请勿设置数值超出0-1之间");
        player.sendMessage(ChatColor.AQUA + "如果您需要自定义步行速度，请使用/walkspeedboost <数值>");
        player.sendMessage(ChatColor.AQUA + "如果您需要自定义飞行速度，请使用/flyspeedboost <数值>");
    }
}
