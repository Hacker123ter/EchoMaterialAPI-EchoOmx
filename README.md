![Version](https://img.shields.io/badge/release-1.0.0-green.svg)  
![JDK](https://img.shields.io/badge/JDK-21.0.8-blue.svg)
![API](https://img.shields.io/badge/Paper-1.21-blue.svg)

---

## ✨ Описание:

EchoMaterialAPI — Лёгкая и удобная Java-библиотека для создания и регистрации кастомных предметов Minecraft (1.21) с поддержкой JDK 21 и Paper.  
- Позволяет работать с кастомными предметами так же, как с обычными `Material`, используя `EchoMaterial`.  
- Поддерживает кастомное название, описание (lore) и CustomModelData.  
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
        <version>v1.0.0</version>
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
    implementation 'com.github.Hacker123ter:EchoMaterialAPI-EchoOmx:v1.0.0'
}
```

---

## 📦 Использование:

1. Получение предмета в виде ItemStack:
```java
import org.dw363.echomaterial.item.EchoMaterial;

ItemStack coinBlock = EchoMaterial.COIN_BLOCK.toItemStack();
```

2. Проверка, является ли предмет кастомным:
```java
import org.dw363.echomaterial.item.EchoMaterial;
import org.dw363.echomaterial.utils.ItemUtils;

boolean isCoinBlock = ItemUtils.isEchoItem(player.getInventory().getItemInMainHand(), EchoMaterial.COIN_BLOCK);
```

3. Регистрация кастомного блока:
```java
register(new CustomBlock("coin_block", Material.STONE, 1001, EchoMaterial.COIN_BLOCK));
```

---

## 🔧 Как работает:

- Вся информация о кастомном предмете хранится в `EchoMaterial` — название, описание, базовый материал и CustomModelData.
- `EchoItemManager` отвечает за регистрацию и хранение всех кастомных предметов.
- Для получения предмета используется метод `toItemStack()` в `EchoMaterial`.
- `ItemUtils` позволяет проверять, является ли предмет определённым кастомным предметом.

---

## 📋 API:

- `EchoMaterial.getId()` — получить уникальный ID предмета.
- `EchoMaterial.toItemStack()` — получить предмет как `ItemStack`.
- `ItemUtils.isEchoItem(ItemStack, EchoMaterial)` — проверить предмет.
- `EchoItemManager.register(EchoMaterial)` — зарегистрировать предмет.

---

### Добавленные предметы:

- **Test_TOKEN** — `Clay_ball`; `§6Test Token`; `§7Special testing token.`; CMD: `1`

---
