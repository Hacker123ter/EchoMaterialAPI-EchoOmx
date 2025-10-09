package org.dw363.echomaterial.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.dw363.echomaterial.list.EchoList;

import java.util.List;

public class EchoMaterial {

    private final String id;
    private final Material baseMaterial;
    private final String displayName;
    private final List<String> lore;
    private final int customModelData;

    public static final EchoMaterial TEST_TOKEN = EchoList.TEST_TOKEN;
    public static final EchoMaterial SHIBA_INU = EchoList.SHIBA_INU;
    public static final EchoMaterial BABY_DOGE = EchoList.BABY_DOGE;
    public static final EchoMaterial DOGE = EchoList.DOGE;
    public static final EchoMaterial FLOKI_INU = EchoList.FLOKI_INU;
    public static final EchoMaterial PEPE = EchoList.PEPE;

    public EchoMaterial(String id, Material baseMaterial, String displayName, List<String> lore, int customModelData) {
        this.id = id;
        this.baseMaterial = baseMaterial;
        this.displayName = displayName;
        this.lore = lore == null ? List.of() : List.copyOf(lore);
        this.customModelData = customModelData;
    }

    public String getId() {
        return id;
    }

    public Material getBaseMaterial() {
        return baseMaterial;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<String> getLore() {
        return lore;
    }

    public int getCustomModelData() {
        return customModelData;
    }

    public ItemStack toItemStack() {
        ItemStack item = new ItemStack(baseMaterial);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(displayName);
            meta.setLore(lore);
            try {
                meta.setCustomModelData(customModelData);
            } catch (Throwable ignored) {

            }
            item.setItemMeta(meta);
        }
        return item;
    }
}