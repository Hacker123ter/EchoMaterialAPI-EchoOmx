package org.dw363.echomaterial.utils;

import org.bukkit.inventory.ItemStack;
import org.dw363.echomaterial.item.EchoMaterial;

public class ItemUtils {

    public static boolean isEchoItem(ItemStack item, EchoMaterial echoMat) {
        if (item == null || item.getItemMeta() == null) return false;
        var meta = item.getItemMeta();
        return meta.hasCustomModelData()
                && meta.getCustomModelData() == echoMat.getCustomModelData()
                && echoMat.getDisplayName().equals(meta.getDisplayName());
    }
}