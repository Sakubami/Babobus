package xyz.sakubami;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.sakubami.framework.logic.SilverManager;
import xyz.sakubami.framework.utils.YMLHandler;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Logger;

public final class DTLib {

    public static Random randomGenerator;

    public static void initLibrary() {
        randomGenerator = new Random();
    }
}
