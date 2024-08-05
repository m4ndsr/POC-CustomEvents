package me.m4ndsr.consumerplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class IronOreBrokenEventListener implements Listener {

    @EventHandler
    public void onIronBreak(IronOreBrokenEvent e) {
        System.out.println(e.getPlayer().getName() + " broke an iron ore");
    }

}
