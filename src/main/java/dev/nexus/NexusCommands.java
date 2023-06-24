package dev.nexus;

import dev.nexus.commands.Glow;
import dev.nexus.commands.credits;
import dev.nexus.commands.demo;
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
        this.getCommand("glow").setExecutor(new Glow());
        this.getCommand("demo").setExecutor(new demo());
        this.getCommand("credits").setExecutor(new credits());
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
