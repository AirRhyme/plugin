package dev.nexus.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class credits implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if(!(sender instanceof Player)){
            sender.sendMessage("u r not playr");
            return true;
        }

        Player p = (Player)sender;
        p.showWinScreen();
        p.sendMessage(ChatColor.GREEN + "Now showing the credits screen");
        
        return true;
    }
}
