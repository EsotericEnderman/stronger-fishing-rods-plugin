package net.slqmy.stronger_fishing_rods_plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.slqmy.stronger_fishing_rods_plugin.listener.FishingRodUseListener;

public final class StrongerFishingRodsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new FishingRodUseListener(), this);
    }
}
