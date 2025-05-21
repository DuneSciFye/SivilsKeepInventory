package net.sivils.sivilskeepinventory.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        e.setShouldDropExperience(false);
        e.setKeepInventory(true);
        e.setKeepLevel(true);
        e.getDrops().clear();
    }

}
