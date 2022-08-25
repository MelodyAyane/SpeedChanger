package sakiayane.flyspeed.Command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("schelp")) {
            if (sender instanceof Player) {
                sender.sendMessage(ChatColor.AQUA + "欢迎使用SpeedChanger");
                sender.sendMessage(ChatColor.AQUA + "Made By MelodyAyane");
                sender.sendMessage(ChatColor.AQUA + "插件更新地址:https://github.com/MelodyAyane/SpeedChanger/releases");
                sender.sendMessage(ChatColor.AQUA + "在使用本插件自定义任何移动速度时，请勿设置数值超出0-1之间");
                sender.sendMessage(ChatColor.AQUA + "如果您需要自定义步行速度，请使用/walkspeedboost <数值>");
                sender.sendMessage(ChatColor.AQUA + "如果您需要自定义飞行速度，请使用/flyspeedboost <数值>");
                sender.sendMessage(ChatColor.AQUA + "如果您需要关闭飞行模式，请使用/flydisabled");
                sender.sendMessage(ChatColor.AQUA + "如果您需要关闭步行倍速模式，请使用/walkspeeddisabled");
                return true;
            } else {
                sender.sendMessage("该指令只能由玩家发送");
                return true;
            }
        }



        return false;
    }
}
