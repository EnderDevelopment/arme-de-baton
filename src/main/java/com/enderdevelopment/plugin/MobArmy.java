package com.enderdevelopment.plugin;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import java.util.List;

public class MobArmy {
    private List<LivingEntity> mobs = new ArrayList<>();

    public void createArmy(Player player, int size) {
        Location loc = player.getLocation();
        for (int i = 0; i < size; i++) {
            LivingEntity mob = (LivingEntity) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
            mobs.add(mob);
        }
    }

    public void moveArmy(Location target) {
        for (LivingEntity mob : mobs) {
            ((Zombie) mob).getPathfinder().moveTo(target);
        }
    }

    public void clearArmy() {
        for (LivingEntity mob : mobs) {
            mob.remove();
        }
        mobs.clear();
    }
}