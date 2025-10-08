package org.dw363.echomaterial.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class EchoMaterial {

    private final String id;
    private final Material baseMaterial;
    private final String displayName;
    private final List<String> lore;
    private final int customModelData;

    public EchoMaterial(String id, Material baseMaterial, String displayName, List<String> lore, int customModelData) {
        this.id = id;
        this.baseMaterial = baseMaterial;
        this.displayName = displayName;
        this.lore = lore;
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
            meta.setCustomModelData(customModelData);
            item.setItemMeta(meta);
        }
        return item;
    }
}