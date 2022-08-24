package sakiayane.flyspeed.Command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NormalFlyspeed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("fly")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.setAllowFlight(true);
                player.setFlySpeed(0.2f);
                sender.sendMessage(ChatColor.AQUA + "您已经开启飞行模式");
                return true;
            }else {
                sender.sendMessage("该指令只能玩家输入");
                return true;

            }

        }
        return false;
    }
}
