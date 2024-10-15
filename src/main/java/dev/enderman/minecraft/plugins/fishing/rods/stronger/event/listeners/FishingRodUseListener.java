package dev.enderman.minecraft.plugins.fishing.rods.stronger.event.listeners;

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

            Vector pullDirectionVector = playerLocation.toVector().subtract(targetLocation.toVector()).normalize();
            pullDirectionVector.multiply(0.4D * distance / 20.0D);
            entity.setVelocity(entity.getVelocity().add(pullDirectionVector));
        }
    }
}
