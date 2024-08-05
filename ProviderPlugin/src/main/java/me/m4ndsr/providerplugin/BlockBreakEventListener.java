package me.m4ndsr.providerplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakEventListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        System.out.println("Block break event triggered");
        if (e.getBlock().getType() == Material.IRON_ORE) {
            System.out.println("Iron ore broken");
            Bukkit.getPluginManager().callEvent(new IronOreBrokenEvent(e.getPlayer(), e.getBlock()));
        }
    }

}