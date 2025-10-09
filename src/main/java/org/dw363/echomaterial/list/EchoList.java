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

    public static final EchoMaterial SHIBA_INU = new EchoMaterial(
            "SHIBA_INU",
            Material.CLAY_BALL,
            "§x§f§c§3§a§3§9Shiba §x§f§6§4§0§2§0Inu §7§o[ERC-20]",
            List.of("§7Мем-валюта с самурайским духом.", "§8Основана на Ethereum."),
            1
    );

    public static final EchoMaterial BABY_DOGE = new EchoMaterial(
            "BABY_DOGE",
            Material.CLAY_BALL,
            "§x§f§f§b§3§d§3Baby §x§f§f§7§5§7§5Doge §7§o[BEP-20]",
            List.of("§7Дитя великого Doge.", "§8Основана на Binance Smart Chain."),
            2
    );

    public static final EchoMaterial DOGE = new EchoMaterial(
            "DOGE",
            Material.CLAY_BALL,
            "§x§f§b§5§0§0§0DOGE §7§o[Doge]",
            List.of("§7To the Moon!", "§8Мем, ставший реальностью."),
            3
    );

    public static final EchoMaterial FLOKI_INU = new EchoMaterial(
            "FLOKI_INU",
            Material.CLAY_BALL,
            "§x§f§f§a§0§0§0Floki §x§f§f§7§7§2§0Inu §7§o[ERC-20]",
            List.of("§7Викинг среди мем-коинов.", "§8Основана на Ethereum."),
            4
    );

    public static final EchoMaterial PEPE = new EchoMaterial(
            "PEPE",
            Material.CLAY_BALL,
            "§x§2§b§f§2§7§aPEPE §7§o[BEP-20]",
            List.of("§7Легендарная лягушка Пепе.", "§8Основана на Binance Smart Chain."),
            5
    );
}