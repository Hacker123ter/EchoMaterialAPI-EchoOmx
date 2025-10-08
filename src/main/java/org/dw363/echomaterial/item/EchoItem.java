package org.dw363.echomaterial.item;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EchoItem {

    private final EchoMaterial echoMaterial;

    public EchoItem(EchoMaterial echoMaterial) {
        this.echoMaterial = echoMaterial;
    }

    public ItemStack getItemStack() {
        ItemStack item = new ItemStack(echoMaterial.getBaseMaterial());
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(echoMaterial.getDisplayName());
            meta.setLore(echoMaterial.getLore());
            meta.setCustomModelData(echoMaterial.getCustomModelData());
            item.setItemMeta(meta);
        }
        return item;
    }

    public EchoMaterial getEchoMaterial() {
        return echoMaterial;
    }
}