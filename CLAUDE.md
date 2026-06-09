# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java fundamentals learning project (IDAT - Instituto de Data) organized into modules covering core programming concepts and object-oriented principles. The active entry point is a student management system (`Alumno`) with a CLI menu interface.

## Build & Development

**Build:**
```bash
mvn clean compile
```

**Run the main program:**
```bash
mvn exec:java -Dexec.mainClass="com.idat.fundamentos.Main"
```

**Compile only (without running):**
```bash
mvn compile
```

**Java version:** Java 17 (configured in `pom.xml`)

## Project Structure

The codebase is organized by topic/module:

- **`com.idat.fundamentos`** — Core OOP concepts and the active student management system
  - `Main.java` — Entry point; implements a CLI menu for managing student records (display, filter by grade, calculate average)
  - `Alumno.java` — Student model with name, age, and grade; includes grade evaluation logic
  - `Vehiculo.java` — Abstract base class demonstrating inheritance; subclasses include `Auto` and `Moto`
  
- **`com.idat.poo`** — Polymorphism examples
  - `MetodoPago.java` — Abstract payment method base class
  - `PagoYape.java`, `PagoTarjeta.java` — Concrete payment implementations

- **`com.idat.colecciones`** — Collections and data structure examples

## Key Architectural Patterns

- **Abstract Classes** — `Vehiculo` and `MetodoPago` demonstrate abstract base classes with concrete subclasses
- **Collections & Streams** — `Main.mostrarAprobados()` shows both loop-based and Stream API filtering (`.filter()`, `.count()`, `.forEach()`)
- **CLI Menu** — The student system uses a Scanner-based menu loop with try-catch for input validation
- **Encapsulation** — Property validation implemented at setter level (e.g., `Vehiculo.setVelocidad()` prevents negative speeds)

## Code Notes

- Main functionality (student management) is in `Main.java` with helper methods for filtering/display
- Many example methods remain commented out (different control flow patterns, inheritance examples)
- Grade threshold for "aprobado" (passing) is `> 10`; pass/fail filtering appears in multiple places
- Scanner resource is not always closed; consider adding try-with-resources when modifying input handling
