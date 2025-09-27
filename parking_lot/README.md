
# Parking Lot — LLD / HLD Implementation

> A simple, object-oriented Parking Lot system (Low-Level Design / High-Level Design) implemented in Java.  
> Repository: `ManishK4514/LLD-HLD` — `parking_lot` module.

---

## Table of Contents
1. [Project Overview](#project-overview)  
2. [Features](#features)  
3. [Project Structure & Components](#project-structure--components)  
4. [Design Summary](#design-summary)  
5. [How to Build & Run](#how-to-build--run)  
6. [Quick Demo / Example Usage](#quick-demo--example-usage)  
7. [Extending & Customization Ideas](#extending--customization-ideas)  
8. [Contribution](#contribution)  
9. [License & Contact](#license--contact)

---

## Project Overview

This module demonstrates a clean LLD implementation of a parking lot system in Java — with clear separation of responsibilities (models, services, strategies, payment).  

It includes:

- Parking lot and floors
- Parking spots of different types (BIKE, COMPACT, LARGE, HANDICAPPED)
- Vehicles (Car, Bike, Truck)
- Ticketing and Parking service (park / unpark)
- Pricing strategies and payment processors

---

## Features

- Multi-floor parking lot with configurable spots per floor  
- Spot types mapped to vehicle types (BIKE → BIKE, CAR → COMPACT, TRUCK → LARGE)  
- Ticketing service to issue and retrieve tickets  
- Parking service for parking/unparking vehicles and tracking availability  
- Pricing service and strategy pattern to support multiple pricing schemes  
- Simple payment processing abstraction (cash/card)  
- Display board per floor showing availability

---

## Project Structure & Components

```
parking_lot/
  ├─ src/
  │   ├─ enums/            # VehicleType, SpotType, PaymentStatus
  │   ├─ model/            # ParkingLot, ParkingFloor, ParkingSpot, Vehicle, Ticket
  │   ├─ service/          # ParkingService, TicketService, PricingService
  │   ├─ strategy/         # PricingStrategy implementations
  │   └─ payment/          # Payment processors (CashPayment, CardPayment)
  │
  ├─ Main.java
  └─ README.md
```

**Main packages / responsibilities**

- `model` — domain models (ParkingLot, Floor, Spot, Vehicle, Ticket)  
- `service` — business logic: allocate/free spots, issue/close tickets, return availability  
- `strategy` — pricing implementations (Hourly, Vehicle-based)  
- `payment` — payment processing abstraction and concrete processors  
- `enums` — central enums for types and statuses  

---

## Design Summary

**Core ideas**

- **Single Responsibility**: Each class has one role — model classes only carry state, services handle logic  
- **Strategy Pattern**: Pricing uses a `PricingStrategy` interface for multiple pricing rules  
- **Loose Coupling**: `ParkingService` depends on `TicketService` and `ParkingLot` but not on specific pricing or payment implementations  
- **Extensible**: Add new vehicle types, pricing rules, or payment processors without changing core services  

**Typical Parking Flow**

1. `ParkingService.parkVehicle(vehicle, spotType)`  
2. Find an available `ParkingSpot` in the `ParkingLot`  
3. Create a `Ticket` via `TicketService`  
4. On unpark: `ParkingService.unparkVehicle(ticketId)` — free the spot  
5. `PricingService` calculates fee; pass to `PaymentProcessor` for payment  

---

## How to Build & Run

**Prerequisites**

- Java JDK 11+ installed  
- IDE (IntelliJ / Eclipse) or command line

---

### Option A — Run in IDE

1. Open IntelliJ/Eclipse  
2. Import project as a Java project (select folder containing `src`)  
3. Mark `src` as source folder  
4. Run `parking_lot.Main` (interactive CLI/demo)

---

### Option B — Command Line (Windows PowerShell)

```powershell
# Navigate to project root
cd "D:\Documents\Interview prep\lld and hld\parking_lot"

# Create output folder
mkdir out

# Compile all Java files
$files = Get-ChildItem -Path .\src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -d out $files

# Run the Main class
java -cp out parking_lot.Main
```

**Unix / macOS**

```bash
mkdir -p out
find src -name "*.java" > sources.txt
javac -d out @sources.txt
java -cp out parking_lot.Main
```

> Note: Because of `package parking_lot;`, run from the repo root using fully qualified class name `parking_lot.Main`.

---

## Quick Demo / Example Usage

Interactive commands (when running `Main`):

- `park` — enter license and vehicle type (CAR/BIKE/TRUCK)  
- `unpark` — enter ticket id  
- `display` — show per-floor availability  
- `available` — count of available spots by type  
- `quit` — exit

---

## Extending & Customization Ideas

- Add **reservation / booking** feature  
- Implement **monthly subscriptions** or frequent customer discounts  
- Store tickets and availability in **persistent storage** (SQLite / Redis)  
- Create **REST API** with Spring Boot for remote control  
- Add **real-time display board** for web or mobile  
- Write **JUnit tests** for services and pricing strategies  

---

## Contribution

Contributions are welcome:

1. Fork the repository  
2. Create a branch: `git checkout -b feat/your-feature`  
3. Add code + tests  
4. Open a pull request with explanation and example run  

---

## License & Contact

- License: Add your preferred license (e.g., MIT)  
- Contact: Open an issue on GitHub (`ManishK4514`)  
