package net.sivils.sivilskeepinventory;

import net.sivils.sivilskeepinventory.listeners.DeathListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class SivilsKeepInventory extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger logger = this.getLogger();

        logger.info("Plugin Enabled");

        Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
    }
}
