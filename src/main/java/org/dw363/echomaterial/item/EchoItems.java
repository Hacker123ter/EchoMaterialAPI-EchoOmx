package org.dw363.echomaterial.item;

import org.bukkit.Material;
import org.dw363.echomaterial.item.manager.EchoItemManager;

import java.util.List;

public class EchoItems {

    public static final EchoMaterial Test_token = new EchoMaterial(
            "Test_TOKEN",
            Material.CLAY_BALL,
            "§6Test Token",
            List.of("§7Special testing token."),
            1
    );

    static {
        EchoItemManager.register(Test_token);
    }
}