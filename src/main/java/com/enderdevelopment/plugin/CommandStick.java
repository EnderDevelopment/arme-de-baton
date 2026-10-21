package com.enderdevelopment.plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class CommandStick {
    public static ItemStack createCommandStick() {
        ItemStack stick = new ItemStack(Material.STICK);
        ItemMeta meta = stick.getItemMeta();
        if (meta != null) {
            meta.setDisplayName("§6Bâton de Commandement");
            meta.setLore(Arrays.asList("§7Contrôlez vos mobs avec ce bâton"));
            stick.setItemMeta(meta);
        }
        return stick;
    }

    public static boolean isCommandStick(ItemStack item) {
        if (item == null || item.getType() != Material.STICK) {
            return false;
        }
        ItemMeta meta = item.getItemMeta();
        return meta != null && "§6Bâton de Commandement".equals(meta.getDisplayName());
    }
}