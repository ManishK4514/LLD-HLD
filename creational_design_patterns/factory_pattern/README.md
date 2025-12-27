# Factory & Abstract Factory Pattern

This repository demonstrates the implementation of the **Factory** and **Abstract Factory** design patterns in object-oriented programming.

## Table of Contents

- [Overview](#overview)
- [Factory Pattern](#factory-pattern)
- [Abstract Factory Pattern](#abstract-factory-pattern)
- [Usage](#usage)
- [Examples](#examples)
- [References](#references)

## Overview

Design patterns are proven solutions to common software design problems. The Factory and Abstract Factory patterns are creational patterns that help in object creation without exposing the instantiation logic to the client.

## Factory Pattern

The **Factory Pattern** provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

**Use Cases:**
- When the exact type of object to create is determined at runtime.
- To encapsulate object creation logic.

## Abstract Factory Pattern

The **Abstract Factory Pattern** provides an interface for creating families of related or dependent objects without specifying their concrete classes.

**Use Cases:**
- When a system needs to be independent of how its objects are created.
- To enforce consistency among products.

## Usage

1. Clone the repository.
2. Explore the `factory` and `abstract_factory` directories for code samples.
3. Run the examples as described in their respective README files.

## Examples

- **Factory Pattern:** Creating different types of vehicles (Car, Bike) using a VehicleFactory.
- **Abstract Factory Pattern:** Creating families of UI components (WindowsButton, MacButton) using a GUIFactory.

## References

- [Factory Method Pattern - Refactoring Guru](https://refactoring.guru/design-patterns/factory-method)
- [Abstract Factory Pattern - Refactoring Guru](https://refactoring.guru/design-patterns/abstract-factory)
- [Design Patterns: Elements of Reusable Object-Oriented Software](https://en.wikipedia.org/wiki/Design_Patterns)

---

Feel free to contribute or raise issues!