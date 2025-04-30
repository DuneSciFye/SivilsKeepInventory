package net.sivils.sivilskeepinventory;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class SivilsKeepInventory extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger logger = this.getLogger();

        logger.info("Plugin Enabled");
    }
}
