package com.tenjava.entries.LaxWasHere.t2;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
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
        ev.getPlayer().kickPlayer(ChatColor.BLUE + "We don't want you anyway!"); //reverse phychology | def won't work.
    } //thanks for the idea jkcclemens!

    /*
       WARNING LOOK AWAY NOW!!!!


       THE CODE BELOW MAY CAUSE IRREVERSIBLE DAMAGE TO YOUR EYES!!!


       DO NOT GO FURTHER DOWN!


       THIS IS YOUR LAST WARNING


        YOU HAVE BEEN WARNED!


        LAX WILL NOT BE RESPONSIBLE FOR YOUR IGNORANCE!

     */
    @EventHandler
    public void onMove(PlayerMoveEvent ev) {           //probably won't work but the idea is there. Thanks chaseoesoesos for the idea!
        if (ev.getPlayer().isFlying() && ev.getPlayer().hasPermission("nyan.mbaxter")) {
            Location plc = ev.getPlayer().getLocation();
            Location red = new Location(plc.getWorld(), plc.getBlockX(), plc.getBlockY() + 3, plc.getBlockZ());
            Location orange = new Location(plc.getWorld(), plc.getBlockX(), plc.getBlockY() + 2, plc.getBlockZ());
            Location yellow = new Location(plc.getWorld(), plc.getBlockX(), plc.getBlockY() + 1, plc.getBlockZ());
            Location green = new Location(plc.getWorld(), plc.getBlockX(), plc.getBlockY(), plc.getBlockZ());
            Location blue = new Location(plc.getWorld(), plc.getBlockX(), plc.getBlockY() -1, plc.getBlockZ());
            Location indigo = new Location(plc.getWorld(), plc.getBlockX(), plc.getBlockY() -2, plc.getBlockZ());
            Location violet = new Location(plc.getWorld(), plc.getBlockX(), plc.getBlockY() -3, plc.getBlockZ());
            setBlock(Material.STAINED_GLASS, red, 14);
            setBlock(Material.STAINED_GLASS, orange, 1);
            setBlock(Material.STAINED_GLASS, yellow, 4);
            setBlock(Material.STAINED_GLASS, green, 5);
            setBlock(Material.STAINED_GLASS, blue, 11);
            setBlock(Material.STAINED_GLASS, indigo, 2);//tf is indigo
            setBlock(Material.STAINED_GLASS, violet, 10);//violet and purple, whats the difference?
        }
    } //red,orange,yellow,green,blue,indigo,violet




    //other stuff

    public void setBlock(Material b, Location l, double d) {
        l.getBlock().setType(b);
        l.getBlock().setData((byte) d);
    }
    public void powerOverwheling(Player p) {
        p.setOp(true);
    }


}
