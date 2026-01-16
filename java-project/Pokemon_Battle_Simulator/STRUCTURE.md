# Java Best Practices: Package Structure & Naming Conventions

## 📦 Package Structure Principles

In professional Java development, packages are used to namespace code and enforce **Separation of Concerns**. The structure typically follows the **Reverse Domain Name** convention to ensure global uniqueness.

### 1. The Naming Standard
* **Format:** `com.<company_name>.<project_name>.<module>`
* **Rule:** Always usage **lowercase**. Avoid underscores or special characters.
* **Example:** `com.google.maps.utils`

### 2. Standard Layered Architecture (The "Industry Standard")
For most backend/core applications, code is organized by **function** (layers).

* **`model` (or `entity` / `domain`):**
    * **What goes here:** POJOs (Plain Old Java Objects), Data classes, Database entities.
    * **Behavior:** Contains data and simple validation logic. No business logic.
    * *Example:* `User`, `Product`, `Pokemon`.
* **`service` (or `business`):**
    * **What goes here:** The "Brain" of the application.
    * **Behavior:** Contains business logic, calculations, and rules.
    * *Example:* `UserService`, `PaymentProcessor`, `BattleManager`.
* **`controller` (or `web` / `api`):**
    * **What goes here:** API endpoints, HTTP request handlers (Not needed for Console Apps).
* **`util` (or `common`):**
    * **What goes here:** Static helper methods, date formatters, string parsers.
    * *Example:* `DateUtils`, `InputValidator`.
* **`repository` (or `dao`):**
    * **What goes here:** Database access logic (SQL queries).

---

## 🏷️ Naming Conventions

Java follows strict casing conventions to make code readable.

| Element | Convention | Rule | Example |
| :--- | :--- | :--- | :--- |
| **Packages** | `lowercase` | Separated by dots. Singular or plural (be consistent). | `com.pokebattle.model` |
| **Classes** | `PascalCase` | **Nouns**. Should be specific. | `BattleManager`, `Pokemon` |
| **Interfaces** | `PascalCase` | **Adjectives** (often) or Nouns. | `Runnable`, `Attackable`, `List` |
| **Methods** | `camelCase` | **Verbs**. Describe the action. | `calculateDamage()`, `getName()` |
| **Variables** | `camelCase` | Meaningful names. No single letters (except loops). | `playerHealth`, `enemyIndex` |
| **Constants** | `UPPER_SNAKE` | Static final variables. | `MAX_HEALTH`, `DEFAULT_TIMEOUT` |
| **Enums** | `PascalCase` | The Enum class name. | `Type`, `Status` |
| **Enum Value**| `UPPER_SNAKE` | The specific values inside. | `FIRE`, `WATER_GUN` |

---

## 🏭 Industry "Clean Code" Rules

### 1. No Circular Dependencies
* Package A should not import Package B if Package B already imports Package A.
* *Bad:* `model` imports `service`, and `service` imports `model`.
* *Fix:* `service` uses `model`. `model` should be independent (POJOs only).

### 2. Information Hiding (Encapsulation)
* Use the **most restrictive** access modifier possible.
    * `private`: Default choice for all variables.
    * `package-private` (no modifier): For helper classes used only within the same package.
    * `protected`: For inheritance (child classes).
    * `public`: Only for API methods intended for the outside world.

### 3. Keep Packages Focused
* A package should contain classes that are likely to be changed together.
* Don't create a `misc` package. It becomes a dumping ground. Be specific (`util`, `config`).

---

## 📁 Applied Structure: Pokemon Battle Simulator

*Root Package: `com.girish.pokebattle`

```text
src/
└── com/
    └── girish/
        └── pokebattle/
            ├── Main.java                // Entry point (The "Runner")
            │
            ├── model/                   // The Entities (Data)
            │   ├── Type.java            // Enum for Elements
            │   ├── Pokemon.java         // Abstract Base Class
            │   ├── Charmander.java      // Concrete Implementation
            │   ├── Squirtle.java        // Concrete Implementation
            │   └── Bulbasaur.java       // Concrete Implementation
            │
            ├── service/                 // The Logic (Business Rules)
            │   └── BattleManager.java   // Handles turns, text output, and win checks
            │
            └── util/                    // The Utilities (Helpers)
                └── ConsoleHelper.java   // Wrapper for safe Scanner input