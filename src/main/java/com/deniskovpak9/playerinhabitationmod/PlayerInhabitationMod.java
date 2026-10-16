package com.deniskovpak9.playerinhabitationmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlayerInhabitationMod implements ModInitializer {
    public static final String MOD_ID = "playerinhabitationmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("PlayerInhabitationMod has been initialized!");
    }
}