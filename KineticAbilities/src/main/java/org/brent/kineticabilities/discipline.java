package org.brent.kineticabilities;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import java.util.List;
import java.util.UUID;

public class discipline {

    private String name; // Name of the discipline
    private UUID uuid; // UUID of discipline
    private ChatColor color; // Display text color
    private Material itemType; // Material type
    private List<UUID> opposingDisciplines; // opposing disciplines
    private String displayMessage; // Message that displays once obtained

    public discipline(String name, UUID uuid, ChatColor color, Material itemType, List<UUID> opposingDisciplines, String displayMessage) {
        this.name = name;
        this.uuid = uuid;
        this.color = color;
        this.itemType = itemType;
        this.opposingDisciplines = opposingDisciplines;
        this.displayMessage = displayMessage;
    }

    public String getName() {return name;} // Return the name of discipline

    public UUID getUUID() {return uuid;} // Return the UUID of discipline

    public ChatColor getColor() {return color;} // Return the text color of discipline

    public Material getItemType() {return itemType;} // Return the item type of discipline

    public List<UUID> getOpposingDisciplines() {return opposingDisciplines;} // Return the opposing disciplines of discipline

    public String getDisplayMessage() {return displayMessage;} // Return the display message of discipline
}
