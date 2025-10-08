package org.dw363.echomaterial.item.manager;

import org.dw363.echomaterial.item.EchoMaterial;

import java.util.HashMap;
import java.util.Map;

public class EchoItemManager {

    private static final Map<String, EchoMaterial> registry = new HashMap<>();

    public static void register(EchoMaterial material) {
        registry.put(material.getId(), material);
    }

    public static EchoMaterial get(String id) {
        return registry.get(id);
    }

    public static boolean isCustom(String id) {
        return registry.containsKey(id);
    }
}