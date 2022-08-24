package sakiayane.flyspeed.Command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("fly")) {
            if (sender instanceof Player) {
                float flySpeed = (float) Integer.parseInt(args[0]);
                Player player = (Player) sender;
                if(flySpeed > 1 || flySpeed < -1) return true;
                player.setAllowFlight(true);
                player.setFlySpeed(flySpeed);
                sender.sendMessage(ChatColor.AQUA + "您已经开启飞行模式");
                sender.sendMessage(ChatColor.AQUA + "当前飞行速度:1");
                return true;
            }else {
                sender.sendMessage("该指令只能玩家输入");
                return true;

            }

        }




        return false;
    }
}
