package sakiayane.flyspeed.Command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlySpeedBooster implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("flyspeedbooster")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.setAllowFlight(true);
                player.setFlySpeed(1);
                sender.sendMessage(ChatColor.AQUA + "您已经开启飞行模式");
                sender.sendMessage(ChatColor.AQUA + "当前飞行速度为1 (最大为1.0)");
                return true;
            }else {
                sender.sendMessage("该指令只能玩家输入");
                return true;

            }

        }
        return false;
    }
}
