package sakiayane.flyspeed.Command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WalkSpeedBooster implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("walkspeedboost")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                float speeda = Float.parseFloat(args[0] + "f");
                if (speeda > 1) speeda = 1f;
                if (speeda < -1) speeda = -1f;
                player.setWalkSpeed(speeda);
                sender.sendMessage(ChatColor.AQUA + "您已经开启步行倍速模式");
                sender.sendMessage(ChatColor.AQUA + "当前您设置的步行倍速为" + speeda);
                sender.sendMessage(ChatColor.GOLD + "Tips:最大值为1.0，最小值为0.0（超出范围将自动重新设置为最大值/最小值）");
                return true;
            } else {
                sender.sendMessage("该指令只能由玩家发送");
                return true;
            }
        }
        return false;
    }
}

