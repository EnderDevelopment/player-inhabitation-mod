package com.deniskovpak9.playerinhabitationmod.items;

import com.deniskovpak9.playerinhabitationmod.PlayerInhabitationMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item INHABITATION_ITEM = new Item(new Item.Settings());

    public static void register() {
        Registry.register(
            Registries.ITEM,
            new Identifier(PlayerInhabitationMod.MOD_ID, "inhabitation_item"),
            INHABITATION_ITEM
        );
    }
}