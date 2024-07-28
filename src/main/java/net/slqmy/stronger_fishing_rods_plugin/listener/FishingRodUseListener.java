package net.slqmy.stronger_fishing_rods_plugin.listener;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;

public class FishingRodUseListener implements Listener {

    @EventHandler
    public void onFishingRodUse(@NotNull PlayerFishEvent event) {
        if (event.getState() == PlayerFishEvent.State.CAUGHT_ENTITY) {
            Entity entity = event.getCaught();
            assert entity != null;

            Location playerLocation = event.getPlayer().getLocation();
            Location targetLocation = entity.getLocation();

            double distance = playerLocation.distance(targetLocation);

            Bukkit.getLogger().info("distance = " + playerLocation.distance(targetLocation));

            Vector pullDirectionVector = playerLocation.toVector().subtract(targetLocation.toVector()).normalize();

            Bukkit.getLogger().info("pullDirectionVector = " + pullDirectionVector);

            pullDirectionVector.multiply(0.4D * distance / 20.0D);

            Bukkit.getLogger().info("pullDirectionVector = " + pullDirectionVector);

            entity.setVelocity(entity.getVelocity().add(pullDirectionVector));
        }
    }
}
