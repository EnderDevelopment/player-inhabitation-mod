package com.deniskovpak9.playerinhabitationmod.blocks;

import com.deniskovpak9.playerinhabitationmod.PlayerInhabitationMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TIME_STOP_BLOCK = new Block(Block.Settings.of(Material.STONE).strength(3.0f, 3.0f));

    public static void register() {
        Registry.register(
            Registries.BLOCK,
            new Identifier(PlayerInhabitationMod.MOD_ID, "time_stop_block"),
            TIME_STOP_BLOCK
        );
    }
}