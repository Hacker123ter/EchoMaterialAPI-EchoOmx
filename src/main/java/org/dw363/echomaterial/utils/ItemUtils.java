package org.dw363.echomaterial.utils;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.dw363.echomaterial.item.EchoMaterial;

public class ItemUtils {

    public static boolean isEchoItem(ItemStack item, EchoMaterial echoMat) {
        if (item == null) return false;
        ItemMeta meta = item.getItemMeta();
        if (meta == null) return false;
        if (!meta.hasCustomModelData()) return false;
        if (meta.getCustomModelData() != echoMat.getCustomModelData()) return false;

        String expectedName = echoMat.getDisplayName();
        if (expectedName != null && !expectedName.isEmpty()) {
            String actualName = meta.getDisplayName();
            return expectedName.equals(actualName);
        }
        return true;
    }

    public static boolean isEchoItemByCMD(ItemStack item, EchoMaterial echoMat) {
        if (item == null) return false;
        ItemMeta meta = item.getItemMeta();
        return meta != null && meta.hasCustomModelData() && meta.getCustomModelData() == echoMat.getCustomModelData();
    }
}