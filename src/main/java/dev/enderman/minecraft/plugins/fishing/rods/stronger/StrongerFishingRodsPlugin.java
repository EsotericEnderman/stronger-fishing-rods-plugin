package dev.enderman.minecraft.plugins.fishing.rods.stronger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import dev.enderman.minecraft.plugins.fishing.rods.stronger.event.listeners.FishingRodUseListener;

public final class StrongerFishingRodsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new FishingRodUseListener(), this);
    }
}
