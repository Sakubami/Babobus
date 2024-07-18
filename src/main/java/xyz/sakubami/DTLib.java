package xyz.sakubami;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.sakubami.framework.logic.SilverManager;
import xyz.sakubami.framework.utils.YMLHandler;
import xyz.sakubami.listener.BlockPlaceListener;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Logger;

public final class DTLib extends JavaPlugin {

    Logger logger;
    public static Random randomGenerator;
    public static YMLHandler groupData;
    public static DTLib instance;

    @Override
    public void onEnable() {
        randomGenerator = new Random();
        SilverManager.init();
        instance = this;
        logger = getLogger();

        getConfig().options().copyDefaults();
        saveDefaultConfig();


        listenerRegistry();
        try {
            groupData = new YMLHandler("groups.yml", this.getDataFolder());
        } catch (IOException e) {
            System.out.print(e);
        }
    }

    public void listenerRegistry() {
        Bukkit.getPluginManager().registerEvents(new BlockPlaceListener(this), this);
    }

    @Override
    public void onDisable() {
        groupData.unloadYAML();
    }
}
