package net.slqmy.strongerfishingrods;

import net.slqmy.strongerfishingrods.listener.FishingRodUseListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class StrongerFishingRods extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new FishingRodUseListener(), this);
    }
}
