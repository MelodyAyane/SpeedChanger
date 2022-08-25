package sakiayane.flyspeed.Command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlySpeedBooster implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("flyspeedboost")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.setAllowFlight(true);
                float flyspeeda = Float.parseFloat(args[0] + "f");
                if(flyspeeda > 1) flyspeeda = 1f;
                if(flyspeeda < -1) flyspeeda = -1f;
                player.setFlySpeed(flyspeeda);
                sender.sendMessage(ChatColor.AQUA + "您已经开启飞行模式");
                sender.sendMessage(ChatColor.AQUA + "当前您设置的飞行速度为" + String.valueOf(flyspeeda));
                sender.sendMessage(ChatColor.GOLD + "Tips:最大值为1.0，最小值为0.0（超出范围将自动重新设置为最大值/最小值）");
                return true;
            }else {
                sender.sendMessage("该指令只能玩家输入");
                return true;

            }

        }




        return false;
    }
}
