# Java Core OOPs Project: Pokemon Battle Simulator (v1.0)

## 📌 Project Overview
This is a **pure Core Java console application** designed to simulate a turn-based battle between two players using the classic Kanto starter Pokemon.

The primary goal of this project is to demonstrate mastery of fundamental Object-Oriented Programming (OOPs) concepts without reliance on external frameworks or databases.

## 🎯 Learning Objectives
By building this simulator, the project demonstrates:
* **Encapsulation:** Protecting game state (HP, Stats) using access modifiers and getters/setters.
* **Inheritance:** Creating a hierarchy with a generic `Pokemon` superclass and specific species subclasses.
* **Polymorphism:** Overriding attack behaviors for different Pokemon types.
* **Abstraction:** Hiding complex damage calculation logic behind simple method calls.

---

## ⚙️ Functional Requirements

### 1. Game Rules
* **Format:** 2-Player (Hot-seat / Local Console).
* **Selection:** Players choose 1 Pokemon each from the available roster.
* **Turn System:**
    * Players select a move (1: Basic Attack, 2: Special Attack).
    * The Pokemon with the higher **Speed** stat attacks first.
    * If the target survives, they counter-attack.
* **Win Condition:** The game ends immediately when a Pokemon's HP drops to 0 or below (Faint).

### 2. Combat Mechanics
* **Damage Calculation:**
    ```
    Damage = ((Attacker.Attack * MovePower) / Defender.Defense) * TypeMultiplier
    ```
* **Type Effectiveness:**
    * 🔥 **Fire** > **Grass** (2.0x)
    * 💧 **Water** > **Fire** (2.0x)
    * 🌿 **Grass** > **Water** (2.0x)
    * ⚪ **Normal** is neutral (1.0x).
    * *Resistance:* Attacking same type or disadvantaged type results in **0.5x** damage.

---

## 🏗️ Technical Architecture

### Class Structure
The project utilizes a strict OOP hierarchy:

1.  **`Type` (Enum):**
    * Constants: `FIRE`, `WATER`, `GRASS`, `NORMAL`.
    * Logic: Contains a method `getEffectiveness(Type targetType)` to return the multiplier (2.0, 1.0, 0.5).

2.  **`Pokemon` (Abstract Class):**
    * **State:** `name`, `hp`, `maxHp`, `attack`, `defense`, `speed`, `type`.
    * **Behavior:**
        * `attack()`: Abstract or base logic for calculating damage.
        * `takeDamage()`: Handles HP reduction and fainted check.
        * `displayStats()`: Prints current status to console.

3.  **Subclasses (Concrete Implementations):**
    * `Charmander`, `Squirtle`, `Bulbasaur`.
    * These classes initialize their specific stats and define their specific move names/powers (e.g., *Ember*, *Water Gun*).

### Move Implementation (Simplified)
For v1.0, Moves are **not** separate objects. They are logic paths within the Pokemon classes:
* **Move 1:** Basic Attack (Normal Type, Low Power).
* **Move 2:** Special Attack (Pokemon's Element Type, High Power).

---

## 📊 Data Reference (Game Balance)

This table ensures fair matchmaking. The "Total Stats" are normalized so no Pokemon has an unfair advantage.

| Pokemon | Type | HP | Attack | Defense | Speed | Move 1 (Normal) | Move 2 (Elemental) |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Charmander** | 🔥 Fire | 80 | 14 | 9 | 15 | Scratch (Pwr: 10) | Ember (Pwr: 20) |
| **Squirtle** | 💧 Water | 100 | 10 | 14 | 10 | Tackle (Pwr: 10) | Water Gun (Pwr: 20) |
| **Bulbasaur** | 🌿 Grass | 90 | 12 | 11 | 12 | Tackle (Pwr: 10) | Vine Whip (Pwr: 20) |
---

## 🔮 Future Improvements (v2.0 Ideas)
* **Move Class:** Extract moves into separate objects to allow custom movesets.
* **Items:** Add Potion/Antidote usage.
* **Status Effects:** Implement Burn, Poison, and Paralyze.
* **GUI:** Upgrade from Console to JavaFX or Swing.