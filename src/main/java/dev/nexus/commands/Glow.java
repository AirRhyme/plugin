package dev.nexus.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class Glow implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("You are not a player, console.");
            return true;
        }
        Player p = (Player)sender;
        if(p== p.getServer().getPlayer("CodeAirRhyme")){
            String name = args[0];
            System.out.println("Correct");
            Player player = Bukkit.getServer().getPlayerExact(name);
            if(player != null){
                System.out.println("Player exists");
                player.setGlowing(!player.isGlowing());
                player.sendMessage("Dev has made you glow. You got on his bad side");
                return true;
            }else {
                p.sendMessage(ChatColor.DARK_RED + "Player is not online");
                return true;
            }

        }
        p.sendMessage(ChatColor.DARK_RED + "You do not have permission");
        return true;
    }
}
