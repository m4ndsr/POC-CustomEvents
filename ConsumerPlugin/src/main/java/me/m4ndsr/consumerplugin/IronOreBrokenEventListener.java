package me.m4ndsr.consumerplugin;

import me.m4ndsr.providerplugin.IronOreBrokenEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class IronOreBrokenEventListener implements Listener {

    @EventHandler
    public void onIronBreak(IronOreBrokenEvent e) {
        System.out.println(e.getPlayer().getName() + " broke an iron ore");
    }

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        System.out.println("listener is registered");
    }

}
