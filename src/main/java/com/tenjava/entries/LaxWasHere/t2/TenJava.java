package com.tenjava.entries.LaxWasHere.t2;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin implements Listener {

    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    //Theme 1
    @EventHandler
    public void onChat(AsyncPlayerChatEvent ev) {
        if(ev.getMessage().equalsIgnoreCase("imma chargin mah lazer")) {
            Bukkit.broadcastMessage(ChatColor.RED + "" + ev.getPlayer().getName() + " IS HARNESSING THE ENERGY IN THE ATMOSPHERE TO CHARGE HIS LAZER!!!!!! OMG WTF");
        }
    }

    @EventHandler
    public void onLevenChange(PlayerLevelChangeEvent ev) {
        if (ev.getNewLevel() == 9001 && ev.getPlayer().hasPermission("super.saiyan")) {
            ev.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "You feel a sudden increase of your energy level...");
            Bukkit.broadcastMessage(ChatColor.RED + "" + ev.getPlayer() + " has achived super saiyan level!!! " + ChatColor.MAGIC + "@#$%");
            powerOverwheling(ev.getPlayer());
        }
    }

    //Theme 2

    @EventHandler
    public void onDeath(PlayerDeathEvent ev) {
        ev.getEntity().kickPlayer(ChatColor.RED + "" + ChatColor.BOLD + "YOU DIED!!! BETTER PLAY AGAIN SON!");
    }

    @EventHandler
    public void onDisconnect(PlayerQuitEvent ev) {
        ev.getPlayer().kickPlayer(ChatColor.BLUE + "We done want you anyway!"); //reverse phychology | def won't work.
    } //thanks for the idea jkcclemens!

    //other stuff
    public void powerOverwheling(Player p) {
        p.setOp(true);
    }


}
