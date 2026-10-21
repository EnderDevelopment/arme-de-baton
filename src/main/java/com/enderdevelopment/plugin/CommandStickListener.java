package com.enderdevelopment.plugin;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class CommandStickListener implements Listener {
    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (CommandStick.isCommandStick(player.getInventory().getItemInMainHand())) {
            Entity entity = event.getRightClicked();
            if (entity instanceof Mob) {
                Mob mob = (Mob) entity;
                mob.setTarget(player);
                player.sendMessage("§aVous contrôlez maintenant ce mob !");
            }
        }
    }
}