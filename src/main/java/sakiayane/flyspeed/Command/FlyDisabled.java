package sakiayane.flyspeed.Command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyDisabled implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("fly-disabled")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.setAllowFlight(false);
                sender.sendMessage(ChatColor.AQUA + "您已经关闭飞行模式");
                return true;
            } else {
                sender.sendMessage("该指令只能由玩家发送");
                return true;
            }

        }





        return false;
    }
}
