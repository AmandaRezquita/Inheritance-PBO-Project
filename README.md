# 📐 Shape Exploration Program

![Language](https://img.shields.io/badge/Language-Java-orange.svg)

An interactive Java command-line application built to demonstrate core **Object-Oriented Programming (OOP)** principles: **Inheritance**, **Encapsulation**, **Polymorphism**, and **Dynamic Method Binding**.

---

## 🚀 Key Features

- 🟩 **Square Calculations**: Instant area calculation based on side length and color.
- 🟡 **Circle Calculations**: Precise area calculation utilizing Java's `Math.PI`.
- 🛢️ **Cylinder Calculations**: Multi-level inheritance modeling volume calculations from a base circle.
- 🔄 **Polymorphism Demo**: Live demonstration of runtime dynamic method dispatch using a polymorphic `Shape[]` collection.
- 🛡️ **Robust Input Handling**: Graceful error recovery for invalid console inputs.

---

## 🏗️ Class Architecture & Inheritance Structure

The program showcases multi-level inheritance and class relationships where specialized shapes inherit attributes and behavior from generic parents.

```
                  ┌──────────────┐
                  │    Shape     │ (Base Class)
                  └──────┬───────┘
                         │
          ┌──────────────┴──────────────┐
          ▼                             ▼
   ┌──────────────┐              ┌──────────────┐
   │    Square    │              │    Circle    │
   └──────────────┘              └──────┬───────┘
                                        │
                                        ▼
                                 ┌──────────────┐
                                 │   Cylinder   │
                                 └──────────────┘
```

### Class Hierarchy Overview

| Class | Superclass | Key Attributes | Core Responsibilities / Overrides |
| :--- | :--- | :--- | :--- |
| `Shape` | *None (Root)* | `color` (`protected`) | Standard base representation, `printInfo()` |
| `Square` | `Shape` | `side` (`private`) | Computes `area()`, overrides `printInfo()` |
| `Circle` | `Shape` | `radius` (`protected`), `PI` | Computes `area()`, overrides `printInfo()` |
| `Cylinder` | `Circle` | `height` (`private`) | Computes `volume()`, overrides `printInfo()` |

---

## 🛠️ Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher.
- Terminal / Command Prompt or any IDE (VS Code, IntelliJ IDEA, Eclipse).

### Installation & Execution

1. **Clone or Download** the repository:
   ```bash
   git clone https://github.com/AmandaRezquita/Inheritance-PBO-Project.git
   cd Inheritance-PBO-Project
   ```

2. **Compile** all Java source files:
   ```bash
   javac *.java
   ```

3. **Run** the application:
   ```bash
   java Main
   ```

---

## 🖥️ Usage & Output Demonstration

### Main Menu Interface

```text
┌─────────────────────────────────────────────────────────┐
│               SHAPE EXPLORATION PROGRAM                 │
│              Object-Oriented Programming                │
└─────────────────────────────────────────────────────────┘

====================== MAIN MENU ======================
  [1] Create Square
  [2] Create Circle
  [3] Create Cylinder
  [4] Run Polymorphism Demo (Array of Shapes)
  [5] Exit Program
───────────────────────────────────────────────────────
! Select an option (1-5): 
```

### Option 4: Polymorphism Demo Output

```text
─── POLYMORPHISM DEMO ───
Executing dynamic method binding on Shape[] array:

  [1] Square colored Red, area = 16.0
  [2] Circle Blue, area = 153.93804002589985
  [3] Cylinder Yellow, volume = 785.3981633974483
───────────────────────────────────────────────────────
```

---

## 💡 Core OOP Concepts Applied

- **Encapsulation**: Attributes use access modifiers (`private`/`protected`) with explicit getters and setters.
- **Inheritance**: Subclasses (`Square`, `Circle`, `Cylinder`) re-use and extend field definitions and methods from `Shape`.
- **Polymorphism**: The method `printInfo()` is overridden across subclasses, enabling uniform method invocations on a heterogeneous `Shape[]` array at runtime.

---
