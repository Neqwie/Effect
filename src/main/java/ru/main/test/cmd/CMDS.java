package ru.main.test.cmd;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMDS implements CommandExecutor {//не знаю как но работает

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("test.cmd")){
            Player p = (Player)sender;//sender через p
            String str = "&8Команда успешно работает";
            p.sendMessage(ChatColor.translateAlternateColorCodes('&',str));
            return true;
        }
        else{
            return true;
        }
    }
}
