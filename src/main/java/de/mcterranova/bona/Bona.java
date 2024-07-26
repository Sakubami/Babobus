package de.mcterranova.bona;

import java.util.Random;

public final class Bona {

    public static Random randomGenerator;

    public static void initLibrary() {
        randomGenerator = new Random();
    }
}
