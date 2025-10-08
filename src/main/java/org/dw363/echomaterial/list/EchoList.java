package org.dw363.echomaterial.list;

import org.bukkit.Material;
import org.dw363.echomaterial.item.EchoMaterial;

import java.util.List;

public class EchoList {

    private EchoList() {}

    public static final EchoMaterial TEST_TOKEN = new EchoMaterial(
            "TEST_TOKEN",
            Material.CLAY_BALL,
            "§6Test Token",
            List.of("§7Special testing token."),
            1
    );

}