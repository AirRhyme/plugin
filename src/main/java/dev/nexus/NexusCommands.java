package dev.nexus;

import dev.nexus.events.onPlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public final class NexusCommands extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin started");

        getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);

    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(command.getName() == "glow"){
            if(!(sender instanceof Player)){
                sender.sendMessage("You are not a player, console.");
                return true;
            }
            Player p = (Player)sender;
            if(p.getUniqueId() == UUID.fromString("280e3ac6-666d-47f3-baa9-e3626aec9dd1")){
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

        return false;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
