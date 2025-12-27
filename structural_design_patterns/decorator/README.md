# 🍕 Decorator Design Pattern – Pizza Shop Example

This project demonstrates the **Decorator Design Pattern** in Java using a simple Pizza Shop implementation.  
The Decorator Pattern allows us to **add new behavior (toppings)** to objects dynamically without altering their base structure.

---

## 📂 Project Structure

```
decorator_pattern/
└── src/
    ├── pizza/
    │   ├── Pizza.java
    │   └── PlainPizza.java
    ├── decorator/
    │   ├── PizzaDecorator.java
    │   ├── CheeseDecorator.java
    │   ├── OliveDecorator.java
    │   └── MushroomDecorator.java
    └── Main.java
```

---

## 🛠 How It Works

- **Pizza (Interface)**: Defines the structure (`getDescription()`, `getCost()`).
- **PlainPizza (Concrete Class)**: Base pizza with default description and cost.
- **PizzaDecorator (Abstract Class)**: Wraps a pizza and allows adding new behavior.
- **CheeseDecorator, OliveDecorator, MushroomDecorator (Concrete Decorators)**: Add toppings dynamically.
- **Main.java**: Demonstrates building pizzas step by step.

---

## ▶️ Example Run

```bash
# Navigate to src folder
cd decorator_pattern/src

# Compile all files
javac */*.java Main.java

# Run the program
java Main

✅ Sample Output
Plain Pizza -> 100.0
Plain Pizza, Cheese -> 140.0
Plain Pizza, Cheese, Olives -> 160.0
Plain Pizza, Cheese, Olives, Mushrooms -> 190.0
```

---

## 🎯 Why Use Decorator Pattern?

- Add features without modifying the original class.
- Promotes flexibility and clean design.
- Easy to extend with new toppings in future.