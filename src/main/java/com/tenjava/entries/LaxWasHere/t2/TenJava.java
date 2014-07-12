package com.tenjava.entries.LaxWasHere.t2;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin implements Listener {

    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent ev) {
        if(ev.getMessage().equalsIgnoreCase("imma chargin mah lazer")) {
            Bukkit.broadcastMessage(ChatColor.RED + "" + ev.getPlayer().getName() + " IS HARNESSING THE ENERGY IN THE ATMOSPHERE TO CHARGE HIS LAZER!!!!!! OMG WTF");
        }
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent ev) {
        ev.getEntity().kickPlayer(ChatColor.RED + "" + ChatColor.BOLD +"YOU DIED!!! BETTER PLAY AGAIN SON!");
    }
}
