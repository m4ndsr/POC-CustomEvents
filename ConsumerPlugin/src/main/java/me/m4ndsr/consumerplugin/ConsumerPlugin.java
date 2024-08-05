package me.m4ndsr.consumerplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class ConsumerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new IronOreBrokenEventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
