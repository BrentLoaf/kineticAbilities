package org.brent.kineticabilities;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.UUID;

public final class KineticAbilities extends JavaPlugin {

    @Override
    public void onEnable() {
        new discipline("Ingis", UUID.randomUUID(), ChatColor.GOLD, Material.ORANGE_DYE, new ArrayList<>(), "You feel a warmth go over your body");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
