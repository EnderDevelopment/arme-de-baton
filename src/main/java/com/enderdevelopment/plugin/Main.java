package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private CommandStick commandStick;
    @Override
    public void onEnable() {
        this.commandStick = new CommandStick();
        getCommand("givecommandstick").setExecutor((sender, command, label, args) -> {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.getInventory().addItem(CommandStick.createCommandStick());
                player.sendMessage("§aVous avez reçu un Bâton de Commandement !");
            }
            return true;
        });

        getServer().getPluginManager().registerEvents(new CommandStickListener(), this);
        this.commandStick = new CommandStick();
        getCommand("givecommandstick").setExecutor((sender, command, label, args) -> {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.getInventory().addItem(CommandStick.createCommandStick());
                player.sendMessage("§aVous avez reçu un Bâton de Commandement !");
            }
            return true;
        });
        getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }
}