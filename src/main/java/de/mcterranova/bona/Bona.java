package de.mcterranova.bona;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class Bona extends JavaPlugin {

    private static Random randomGenerator;

    @Override
    public void onEnable() {
        randomGenerator = new Random();
    }

    @Override
    public void onDisable() {

    }

    public static Random getRandomGenerator() { return randomGenerator; }
}
