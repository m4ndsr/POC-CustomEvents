package me.m4ndsr.providerplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class ProviderPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BlockBreakEventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
