![Version](https://img.shields.io/badge/release-1.0.2-green.svg)  
![JDK](https://img.shields.io/badge/JDK-21.0.8-blue.svg)
![API](https://img.shields.io/badge/Paper-1.21-blue.svg)

---

## ✨ Описание:

**EchoMaterialAPI** — Лёгкая и удобная Java-библиотека для создания и регистрации кастомных предметов Minecraft (1.21) с поддержкой JDK 21 и Paper.
- Позволяет работать с кастомными предметами так же, как с обычными `Material`, используя `EchoMaterial`.
- Поддерживает кастомное название, описание (lore) и CustomModelData.
- Минималистичная точка доступа: все предметы доступны через `EchoMaterial.<CONSTANT>`; утилиты — в `ItemUtils`.
- Централизованный менеджер предметов упрощает их регистрацию и использование в любых плагинах.

Идеально подходит **для интеграции в Minecraft-плагины** на JDK 21+.

---

## 🚀 Установка:
<h3 align="center">Maven:</h3>
Добавьте в ваш pom.xml:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.Hacker123ter</groupId>
        <artifactId>EchoMaterialAPI-EchoOmx</artifactId>
        <version>v1.0.1</version>
    </dependency>
</dependencies>
```

<h3 align="center">Gradle:</h3>
Добавьте в build.gradle:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.Hacker123ter:EchoMaterialAPI-EchoOmx:v1.0.1'
}
```

---

## 📦 Использование:

1. Получение предмета в виде ItemStack:
```java
import org.dw363.echomaterial.item.EchoMaterial;

ItemStack stack = EchoMaterial.TEST_TOKEN.toItemStack();
```

2. Проверка, является ли предмет кастомным:
```java
import org.dw363.echomaterial.item.EchoMaterial;
import org.dw363.echomaterial.utils.ItemUtils;

boolean isTest = ItemUtils.isEchoItem(player.getInventory().getItemInMainHand(), EchoMaterial.TEST_TOKEN);
```

3. Пример регистрации кастомного блока:
```java
register(new CustomBlock("coin_block", Material.STONE, 1001, EchoMaterial.TEST_TOKEN));
```

---

## 🔧 Как работает:

- Вся информация о кастомном предмете хранится в экземпляре `EchoMaterial` — уникальный id, displayName, lore, базовый `Material` и `customModelData`.
- Константы предметов вынесены в отдельный класс/список (например `EchoList`) и экспортируются как `public static final` ссылки через `EchoMaterial` (например `EchoMaterial.TEST_TOKEN`).
- Метод `EchoMaterial.toItemStack()` формирует `ItemStack` с нужной метаинформацией.
- `ItemUtils` предоставляет удобные проверки (по CMD и/или имени).
- Библиотека минимальна и не выполняет побочных действий при загрузке — инициализация происходит JVM при первом обращении к константам. Для явной гарантии инициализации при старте плагина при желании можно вызвать `Class.forName("org.dw363.echomaterial.list.EchoList")` в `onEnable()`.

---

## 📋 API:

- `EchoMaterial.getId()` — получить уникальный ID предмета.
- `EchoMaterial.toItemStack()` — получить предмет как `ItemStack`.
  `EchoMaterial.getCustomModelData()` — получить CMD.
- `ItemUtils.isEchoItem(ItemStack, EchoMaterial)` — проверить предмет по имени + CMD.
- `ItemUtils.isEchoItemByCMD(ItemStack, EchoMaterial)` — проверить предмет только по CMD.

Опционально: `EchoMaterialAPI` — лёгкий плагин с `onEnable()` (если ставить библиотеку отдельно на сервер).

---

### Добавленные предметы:

-  **TEST_TOKEN** — `Clay_ball`; `Test Token`; `Special testing token.`; CMD: `1`
-  **SHIBA_INU** — `Clay_ball`; `Shiba Inu [ERC-20]`; `Мем-валюта с самурайским духом.; Основана на Ethereum.`; CMD: `1`
-  **BABY_DOGE** — `Clay_ball`; `Baby Doge [BEP-20]`; `Дитя великого Doge.; Основана на Binance Smart Chain.`; CMD: `2`
-  **DOGE** — `Clay_ball`; `DOGE [DOGE]`; `To the Moon!; Мем, ставший реальностью.`; CMD: `3`
-  **FLOKI_INU** — `Clay_ball`; `Floki inu [ERC-20]`; `Викинг среди мем-коинов.; Основана на Ethereum.`; CMD: `4`
-  **PEPE** — `Clay_ball`; `PEPE [BEP-20]`; `Легендарная лягушка Пепе.; Основана на Binance Smart Chain.`; CMD: `5`

---
