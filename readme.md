# 📏 Quantity Measurement App

![Java](https://img.shields.io/badge/Language-Java-orange?style=flat-square&logo=java)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)

## Short Intro

The **Quantity Measurement App** is designed to facilitate the conversion and measurement of various quantities. It supports multiple measurement units and provides an easy-to-use interface for users of all backgrounds.

---

## Table of Contents

1. [Overview](#overview)
2. [Supported Units](#supported-units)
3. [Branch Information](#branch-information)
4. [Folder Structure](#folder-structure)
5. [Use Cases Description](#use-cases-description)
6. [Important Information](#important-information)

---

## Overview

This application aims to streamline the process of converting and measuring different physical quantities, including weight, temperature, length, and more. It is built with efficiency in mind, catering to both casual users and professionals.

Key highlights:
- Clean and modular architecture
- Supports a wide range of unit families
- Designed for both simple conversions and compound multi-unit operations
- Refactored into N-Tier Architecture for scalability

---

## Supported Units

### 📐 Length Conversion
- Meters, Kilometers, Miles, Yards, Feet, Inches

### ⚖️ Weight Conversion
- Grams, Kilograms, Pounds, Ounces

### 🌡️ Temperature Conversion
- Celsius, Fahrenheit, Kelvin

### 🧪 Volume Conversion
- Litre, MilliLitre, Gallon

---

## Branch Information

| Branch Name | Purpose |
|-------------|---------|
| `main` | Contains the main README and consolidated documentation |
| `dev` | Empty Branch |
| `feature/UC1-FeetEquality` | UC1: Feet Measurement Equality |
| `feature/UC2-InchEquality` | UC2: Feet and Inches measurement equality |
| `feature/UC3-GenericLength` | UC3: Generic Quantity Class for DRY Principle |
| `feature/UC4-ExtendedUnitSupport` | UC4: Extended Unit Support |
| `feature/UC5-UnitConversion` | UC5: Unit-to-Unit Conversion |
| `feature/UC6-UnitAddition` | UC6: Addition of Two Length Units |
| `feature/UC7-TargetUnitAddition` | UC7: Addition with Target Unit |
| `feature/UC8-StandAloneUnit` | UC8: Refactoring with ENUM |
| `feature/UC9-WeightMeasurement` | UC9: Weight Measurement Equality, Conversion, and Addition |
| `feature/UC10-GenericQuantity` | UC10: Generic Quantity Class with Unit Interface |
| `feature/UC11-VolumeMeasurement` | UC11: Volume Measurement Equality, Conversion, and Addition |
| `feature/UC12-SubDivOperation` | UC12: Subtraction and Division Operations |
| `feature/UC13-CentralizedArithLogic` | UC13: Centralized Arithmetic Logic to Enforce DRY in Quantity Operations |
| `feature/UC14-TempMeasurement` | UC14: Temperature Measurement |
| `feature/UC15-N-TierArchitecture` | UC15: N-Tier Architecture Refactoring |
| `feature/UC16-DBIntegration` | UC16: Database Integration with JDBC |
| `feature/UC17-SpringBackend` | UC17: Spring Framework Integration — REST Services and JPA |
| `feature/UC18-SecurityIntegration` | UC18: Implementation of Spring Security JWT and OAuth |

---

## Folder Structure

```
QuantityMeasureApp/
|
+-- dev/                                  (Branch)
|
+-- feature/UC1-FeetEquality/             (Branch)
|
+-- feature/UC2-InchEquality/             (Branch)
|
+-- feature/UC3-GenericLength/            (Branch)
|
+-- feature/UC4-ExtendedUnitSupport/      (Branch)
|
+-- feature/UC5-UnitConversion/           (Branch)
|
+-- feature/UC6-UnitAddition/             (Branch)
|
+-- feature/UC7-TargetUnitAddition/       (Branch)
|
+-- feature/UC8-StandAloneUnit/           (Branch)
|
+-- feature/UC9-WeightMeasurement/        (Branch)
|
+-- feature/UC10-GenericQuantity/         (Branch)
|
+-- feature/UC11-VolumeMeasurement/       (Branch)
|
+-- feature/UC12-SubDivOperation/         (Branch)
|
+-- feature/UC13-CentralizedArithLogic/   (Branch)
|
+-- feature/UC14-TempMeasurement/         (Branch)
|
+-- feature/UC15-N-TierArchitecture/      (Branch)
|
+-- feature/UC16-DBIntegration/           (Branch)
|
+-- feature/UC17-SpringBackend/           (Branch)
|
+-- feature/UC18-SecurityIntegration/     (Branch)
|
+-- main/
```

---

## Use Cases Description

| UC # | Branch | Description | Key Concepts |
|------|--------|-------------|--------------|
| UC1  | `feature/UC1-FeetEquality` | Feet Measurement Equality | `Double.compare()`, null checking, type safety |
| UC2  | `feature/UC2-InchEquality` | Feet and Inches Measurement Equality | Unit conversion logic, conversion factors |
| UC3  | `feature/UC3-GenericLength` | Generic Quantity Class for DRY Principle | Symmetrical class design, DRY principle |
| UC4  | `feature/UC4-ExtendedUnitSupport` | Extended Unit Support | Unit standardization, arithmetic operations |
| UC5  | `feature/UC5-UnitConversion` | Unit-to-Unit Conversion | Multi-level unit hierarchy |
| UC6  | `feature/UC6-UnitAddition` | Addition of Two Length Units | Metric system introduction |
| UC7  | `feature/UC7-TargetUnitAddition` | Addition with Target Unit | Metric hierarchy |
| UC8  | `feature/UC8-StandAloneUnit` | Refactoring with ENUM | Cross-family conversions, ENUM patterns |
| UC9  | `feature/UC9-WeightMeasurement` | Weight Measurement Equality, Conversion, and Addition | Extended metric system |
| UC10 | `feature/UC10-GenericQuantity` | Generic Quantity Class with Unit Interface | Imperial long-distance, interfaces |
| UC11 | `feature/UC11-VolumeMeasurement` | Volume Measurement Equality, Conversion, and Addition | Non-linear transformations |
| UC12 | `feature/UC12-SubDivOperation` | Subtraction and Division Operations | Liters / Milliliters, arithmetic |
| UC13 | `feature/UC13-CentralizedArithLogic` | Centralized Arithmetic Logic to Enforce DRY | Grams / Kilograms, DRY enforcement |
| UC14 | `feature/UC14-TempMeasurement` | Temperature Measurement | Multi-dimensional handling, non-linear conversion |
| UC15 | `feature/UC15-N-TierArchitecture` | N-Tier Architecture Refactoring | Layered architecture, separation of concerns |
| UC16 | `feature/UC16-DBIntegration` | Database Integration with JDBC | JDBC, persistence, DAO pattern |
| UC17 | `feature/UC17-SpringBackend` | Spring Framework Integration — REST Services and JPA | REST API, Spring Boot, JPA/Hibernate |
| UC18 | `feature/UC18-SecurityIntegration` | Spring Security JWT and OAuth | JWT tokens, OAuth2, authentication |

---

## Important Information

> ⚠️ **Please read before using the application.**

- Ensure that you have the necessary **permissions** to run conversions in your environment.
- Follow the guidelines provided in the **user manual** for the best experience.
- All conversions follow standard internationally accepted formulas.
- For non-linear conversions (e.g., Temperature), the app applies the correct mathematical transformations automatically.

---

*For issues or contributions, please open a GitHub issue or submit a pull request.*
