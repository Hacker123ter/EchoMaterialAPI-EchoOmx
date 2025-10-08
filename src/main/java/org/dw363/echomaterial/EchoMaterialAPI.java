package org.dw363.echomaterial;

import org.bukkit.plugin.java.JavaPlugin;

public class EchoMaterialAPI extends JavaPlugin {

    private static EchoMaterialAPI instance;

    @Override
    public void onEnable() {
        instance = this;
        try {
            Class.forName("org.dw363.echomaterial.list.EchoList");
            Class.forName("org.dw363.echomaterial.item.EchoMaterial");
        } catch (ClassNotFoundException ignored) {}
    }

    public static EchoMaterialAPI getInstance() {
        return instance;
    }
}