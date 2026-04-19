# 🚗 Spring XML Autowiring - Car App

This project demonstrates **Dependency Injection using Spring Framework with XML-based autowiring**.

---

## 📌 Overview

The application simulates a Car system where the Engine dependency is injected using Spring's XML configuration and autowiring.

---

## 🧠 Concepts Covered

- Dependency Injection (DI)
- Spring Framework (Core)
- XML Configuration
- Autowiring (byType / byName)
- Loose Coupling

---

## 🏗️ Project Structure
src/
├── App.java
├── Car.java
├── IEngine.java
├── PetrolEngine.java
└── DieselEngine.java

---

## ⚙️ How It Works

- `Car` depends on `IEngine`
- Spring injects the required implementation automatically
- Configuration is defined in `Beans.xml`

---

## ▶️ How to Run

1. Configure Spring XML (`Beans.xml`)
2. Run `App.java`
3. Output will display the selected engine in use

---

## 🎯 Key Benefits

- Eliminates tight coupling
- Improves flexibility and scalability
- Makes switching implementations easy
