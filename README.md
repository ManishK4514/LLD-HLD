# 🏗️ Low-Level Design (LLD) & High-Level Design (HLD) Repository 

> **A comprehensive collection of design patterns, SOLID principles, and real-world system design implementations in Java.**

[![Java](https://img.shields.io/badge/Java-11+-orange.svg)](https://www.oracle.com/java/)
[![Design Patterns](https://img.shields.io/badge/Design%20Patterns-6-blue.svg)](#design-patterns)
[![SOLID](https://img.shields.io/badge/SOLID-Principles-green.svg)](#solid-principles)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](#license)

---

## 📋 Table of Contents

1. [Overview](#-overview)
2. [Repository Structure](#-repository-structure)
3. [Design Patterns](#-design-patterns)
   - [Creational Patterns](#creational-patterns)
   - [Structural Patterns](#structural-patterns)
   - [Behavioral Patterns](#behavioral-patterns)
4. [SOLID Principles](#-solid-principles)
5. [Real-World Projects](#-real-world-projects)
6. [Getting Started](#-getting-started)
7. [How to Run](#-how-to-run)
8. [Contributing](#-contributing)
9. [Resources](#-resources)
10. [License](#-license)

---

## 🎯 Overview

This repository serves as a **complete reference guide** for software engineers preparing for system design interviews or looking to strengthen their understanding of:

- **Design Patterns**: Proven solutions to common software design problems
- **SOLID Principles**: Five fundamental principles for writing maintainable, scalable code
- **Low-Level Design (LLD)**: Detailed class diagrams, object relationships, and implementation details
- **High-Level Design (HLD)**: System architecture, component interactions, and scalability considerations

Each pattern and principle is implemented with:
- ✅ Clean, production-ready Java code
- ✅ Comprehensive documentation
- ✅ Real-world use cases and examples
- ✅ Best practices and anti-patterns

---

## 📂 Repository Structure

```
LLD-HLD/
├── builder_pattern/          # Builder Pattern implementation
├── decorator_pattern/        # Decorator Pattern (Pizza Shop example)
├── factory_pattern/          # Factory & Abstract Factory patterns
├── observer_pattern/         # Observer Pattern (YouTube subscription)
├── singleton_pattern/        # Singleton Pattern with thread safety
├── strategy_pattern/         # Strategy Pattern (Discount calculation)
├── parking_lot/              # Complete Parking Lot System (LLD/HLD)
├── solid_principles/         # All 5 SOLID principles with examples
└── README.md                 # This file
```

---

## 🎨 Design Patterns

### Creational Patterns

Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

#### 1️⃣ **Builder Pattern**
📁 [`builder_pattern/`](./builder_pattern)

**Problem**: Complex object construction with many optional parameters leads to telescoping constructors or unclear initialization.

**Solution**: Separate object construction from representation using a step-by-step builder.

**Use Cases**:
- Creating complex objects with many optional fields (e.g., User profiles)
- Immutable object construction
- Fluent API design

**Example**:
```java
User user = new User.Builder(1, "Manish Kumar")
    .email("manish@example.com")
    .phone("9065129628")
    .address("401, A Wing Sunshine Building")
    .build();
```

**Key Benefits**:
- ✅ Readable and maintainable code
- ✅ Immutable objects
- ✅ No telescoping constructors

---

#### 2️⃣ **Factory Pattern**
📁 [`factory_pattern/`](./factory_pattern)

**Problem**: Object creation logic is scattered throughout the codebase, making it hard to maintain and extend.

**Solution**: Encapsulate object creation in a factory class/method.

**Implementations**:
- **Simple Factory**: Creates objects based on input parameters
- **Abstract Factory**: Creates families of related objects without specifying concrete classes

**Use Cases**:
- Payment processing (UPI, Card, Cash)
- Cross-platform UI components
- Database connection factories

**Example**:
```java
Payment payment = PaymentFactory.createPayment("CARD");
payment.processPayment(1000);
```

**Key Benefits**:
- ✅ Loose coupling between client and concrete classes
- ✅ Easy to add new product types
- ✅ Centralized object creation logic

📖 **[Read detailed documentation](./factory_pattern/README.md)**

---

#### 3️⃣ **Singleton Pattern**
📁 [`singleton_pattern/`](./singleton_pattern)

**Problem**: Multiple instances of a class can cause inconsistent state or wasted resources.

**Solution**: Ensure a class has only one instance and provide a global access point.

**Use Cases**:
- Configuration managers
- Database connection pools
- Logger instances
- Thread-safe caches

**Example**:
```java
Singleton instance1 = Singleton.getInstance();
Singleton instance2 = Singleton.getInstance();
System.out.println(instance1 == instance2); // true
```

**Key Benefits**:
- ✅ Controlled access to single instance
- ✅ Reduced memory footprint
- ✅ Global state management

**⚠️ Important Notes**:
- Thread safety must be explicitly handled
- Can make testing difficult (hidden dependencies)
- Modern DI containers often provide better alternatives

---

### Structural Patterns

Structural patterns explain how to assemble objects and classes into larger structures while keeping them flexible and efficient.

#### 4️⃣ **Decorator Pattern**
📁 [`decorator_pattern/`](./decorator_pattern)

**Problem**: Adding new functionality to objects requires modifying existing code or creating numerous subclasses.

**Solution**: Wrap objects with decorator classes that add behavior dynamically.

**Use Cases**:
- Adding toppings to pizza
- Adding features to UI components
- Stream processing (Java I/O streams)

**Example**:
```java
Pizza pizza = new PlainPizza();                    // Base: $100
pizza = new CheeseDecorator(pizza);                // +$40
pizza = new OliveDecorator(pizza);                 // +$20
pizza = new MushroomDecorator(pizza);              // +$30
System.out.println(pizza.getCost());               // $190
```

**Key Benefits**:
- ✅ Add features without modifying original class
- ✅ Flexible alternative to subclassing
- ✅ Follows Open/Closed Principle

📖 **[Read detailed documentation](./decorator_pattern/README.md)**

---

### Behavioral Patterns

Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects.

#### 5️⃣ **Observer Pattern**
📁 [`observer_pattern/`](./observer_pattern)

**Problem**: Objects need to be notified of state changes without tight coupling.

**Solution**: Define a one-to-many dependency where observers are automatically notified of subject changes.

**Use Cases**:
- YouTube channel subscriptions
- Event handling systems
- MVC architecture (Model notifies View)
- Real-time notifications

**Example**:
```java
YouTubeChannel channel = new YouTubeChannel();
Subscriber sub1 = new Subscriber("Alice");
Subscriber sub2 = new Subscriber("Bob");

channel.subscribe(sub1);
channel.subscribe(sub2);
channel.uploadVideo("Design Patterns Tutorial"); // Both notified
```

**Key Benefits**:
- ✅ Loose coupling between subject and observers
- ✅ Dynamic subscription/unsubscription
- ✅ Broadcast communication

📖 **[Read detailed documentation](./observer_pattern/README.md)**

---

#### 6️⃣ **Strategy Pattern**
📁 [`strategy_pattern/`](./strategy_pattern)

**Problem**: Business logic contains large if-else or switch statements for selecting behavior.

**Solution**: Define a family of algorithms, encapsulate each one, and make them interchangeable.

**Use Cases**:
- Discount calculation strategies
- Sorting algorithms
- Payment processing methods
- Pricing strategies

**Example**:
```java
DiscountStrategy strategy = new FestivalDiscount();
BillingService billing = new BillingService(strategy);
double finalAmount = billing.calculateFinalAmount(1000);
System.out.println("Final Bill: " + finalAmount); // $800 (20% off)
```

**Key Benefits**:
- ✅ Eliminates conditional logic
- ✅ Easy to add new strategies
- ✅ Follows Open/Closed Principle
- ✅ Testable and reusable algorithms

📖 **[Read detailed documentation](./strategy_pattern/README.md)**

---

## 🧱 SOLID Principles

📁 [`solid_principles/`](./solid_principles)

The SOLID principles are five design principles that make software designs more understandable, flexible, and maintainable.

### 1. **S**ingle Responsibility Principle (SRP)
📄 [`single_responsibility_principle.java`](./solid_principles/single_responsibility_principle.java)

> *A class should have only one reason to change.*

**Bad Example**:
```java
class Employee {
    void updateSalary() { }
    void sendEmail() { }  // ❌ Not related to Employee
}
```

**Good Example**:
```java
class Employee {
    void updateSalary() { }
}

class NotificationService {
    void sendEmail() { }  // ✅ Separate responsibility
}
```

---

### 2. **O**pen/Closed Principle (OCP)
📄 [`AreaCalculator.java`](./solid_principles/AreaCalculator.java)

> *Software entities should be open for extension but closed for modification.*

**Key Idea**: Use abstraction to allow new functionality without changing existing code.

---

### 3. **L**iskov Substitution Principle (LSP)
📄 [`liskov_substution_principle.java`](./solid_principles/liskov_substution_principle.java)

> *Objects of a superclass should be replaceable with objects of a subclass without breaking the application.*

**Key Idea**: Subclasses must honor the contract of their parent class.

---

### 4. **I**nterface Segregation Principle (ISP)
📄 [`interface_segregation_principle.java`](./solid_principles/interface_segregation_principle.java)

> *Clients should not be forced to depend on interfaces they don't use.*

**Key Idea**: Create specific, focused interfaces instead of one large interface.

---

### 5. **D**ependency Inversion Principle (DIP)
📄 [`dependency_inversion_principle.java`](./solid_principles/dependency_inversion_principle.java)

> *High-level modules should not depend on low-level modules. Both should depend on abstractions.*

**Key Idea**: Depend on interfaces/abstractions, not concrete implementations.

---

## 🏢 Real-World Projects

### Parking Lot System (Complete LLD/HLD)
📁 [`parking_lot/`](./parking_lot)

A **production-ready parking lot management system** demonstrating:

**Features**:
- ✅ Multi-floor parking with configurable spots
- ✅ Multiple vehicle types (Car, Bike, Truck)
- ✅ Spot type mapping (BIKE, COMPACT, LARGE, HANDICAPPED)
- ✅ Ticketing system with entry/exit tracking
- ✅ Multiple pricing strategies (Hourly, Vehicle-based)
- ✅ Payment processing (Cash, Card)
- ✅ Real-time availability display per floor

**Design Patterns Used**:
- Strategy Pattern (Pricing strategies)
- Factory Pattern (Payment processing)
- Service Layer Pattern (Business logic separation)

**Architecture**:
```
parking_lot/
├── enums/          # VehicleType, SpotType, PaymentStatus
├── model/          # Domain entities
├── service/        # Business logic
├── strategy/       # Pricing strategies
└── payment/        # Payment processors
```

**Example Usage**:
```bash
Commands:
- park     → Park a vehicle
- unpark   → Exit and pay
- display  → Show floor availability
- available → Count available spots
```

📖 **[Read complete documentation](./parking_lot/README.md)**

---

## 🚀 Getting Started

### Prerequisites

- **Java JDK 11+** installed
- IDE (IntelliJ IDEA, Eclipse, VS Code) or command line
- Basic understanding of OOP concepts

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/ManishK4514/LLD-HLD.git
   cd LLD-HLD
   ```

2. **Choose a pattern to explore**:
   ```bash
   cd builder_pattern
   # or
   cd parking_lot
   ```

3. **Read the pattern-specific README** (if available) for detailed instructions.

---

## ▶️ How to Run

### Option A: Using an IDE

1. Open the project in IntelliJ IDEA or Eclipse
2. Navigate to the pattern folder (e.g., `builder_pattern`)
3. Mark `src` as source folder
4. Run the `Main.java` file

### Option B: Command Line

#### For individual patterns:

```bash
# Navigate to pattern directory
cd decorator_pattern

# Compile all Java files
javac -d out src/**/*.java Main.java

# Run the main class
java -cp out Main
```

#### For parking lot system:

```bash
cd parking_lot

# Compile
mkdir -p out
find src -name "*.java" > sources.txt
javac -d out @sources.txt Main.java

# Run
java -cp out parking_lot.Main
```

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork the repository**
2. **Create a feature branch**:
   ```bash
   git checkout -b feature/new-pattern
   ```
3. **Add your implementation** with:
   - Clean, well-documented code
   - README explaining the pattern
   - Example usage in Main.java
4. **Commit your changes**:
   ```bash
   git commit -m "Add Adapter Pattern implementation"
   ```
5. **Push and create a Pull Request**

### Contribution Ideas

- Add new design patterns (Adapter, Facade, Proxy, etc.)
- Implement more real-world systems (Library Management, Hotel Booking)
- Add unit tests
- Improve documentation
- Add UML diagrams

---

## 📚 Resources

### Design Patterns

- [Refactoring Guru - Design Patterns](https://refactoring.guru/design-patterns)
- [Gang of Four (GoF) Design Patterns](https://en.wikipedia.org/wiki/Design_Patterns)
- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)

### SOLID Principles

- [SOLID Principles Explained](https://www.digitalocean.com/community/conceptual_articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)
- [Uncle Bob's SOLID Principles](https://blog.cleancoder.com/uncle-bob/2020/10/18/Solid-Relevance.html)

### System Design

- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Grokking the System Design Interview](https://www.educative.io/courses/grokking-the-system-design-interview)

---

## 📞 Contact

**Manish Kumar**

- GitHub: [@ManishK4514](https://github.com/ManishK4514)
- Email: manish80842@gmail.com

---

## 📄 License

This project is licensed under the MIT License - feel free to use it for learning and reference.

---

## ⭐ Show Your Support

If this repository helped you in your learning journey, please consider:

- ⭐ **Starring the repository**
- 🍴 **Forking it for your own learning**
- 📢 **Sharing it with others**

---

<div align="center">

**Happy Coding! 🚀**

*Built with ❤️ for the developer community*

</div>
