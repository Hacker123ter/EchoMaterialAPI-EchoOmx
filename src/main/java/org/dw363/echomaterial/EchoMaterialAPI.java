package org.dw363.echomaterial;

import org.bukkit.plugin.java.JavaPlugin;
import org.dw363.echomaterial.item.EchoItems;

public class EchoMaterialAPI extends JavaPlugin {

    private static EchoMaterialAPI instance;

    @Override
    public void onEnable() {
        instance = this;
        EchoItems.class.getDeclaredFields();
    }

    public static EchoMaterialAPI getInstance() {
        return instance;
    }
}