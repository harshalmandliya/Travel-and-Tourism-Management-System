# Travel and Tourism Management System

## 📖 Introduction

The **Travel and Tourism Management System (TTMS)** is a desktop application developed in Java to streamline travel and tourism operations. It automates tasks such as:

- 🏨 Booking tours and hotels
- 📅 Scheduling
- 💳 Handling payments
- 👥 Managing customer information

This system is designed to enhance the efficiency of travel agencies and tour operators, improve customer satisfaction, and reduce errors from traditional manual methods.

---

## 📑 Table of Contents

- [Introduction](#introduction)
- [Features](#-features)
- [Architecture](#-architecture)
- [Tech Stack](#tech-stack)
- [Installation](#️-installation)
- [Usage](#-usage)
- [Future Enhancements](#-future-enhancements)
- [Contributors](#contributors)

---

## ✨ Features

- Secure login, signup, and password recovery
- Manage customer details (add, update, view, delete)
- View and book packages & hotels
- Manage bookings and payments
- View destinations and packages
- Admin-friendly dashboard with multiple frames for management
- User-friendly UI built with JavaFX and Swing

---

## 🏗 Architecture

The system follows a **layered architecture**:

- **Presentation Layer** – Manages the UI and user interactions
- **Business Logic Layer** – Contains application rules and logic
- **Data Access Layer** – Manages database storage and retrieval

---

## Tech Stack

- **Programming Language:** Java
- **Database:** MySQL
- **UI Framework:** JavaFX, Swing
- **IDE:** IntelliJ IDEA (or any Java IDE)
- **Version Control:** Git
- **Operating System:** Windows

---

## ⚙️ Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/harshalmandliya/Travel-and-Tourism-Management-System.git
   cd Travel-and-Tourism-Management-System
   ```

2. **Set up MySQL database:**
   - Create a database named `travelmanagementsystem`.
   - Import tables based on the schema (customers, users, packages, hotels, etc.).
   - Update database credentials in `conn.java`:
     ```java
     c = DriverManager.getConnection(
        "jdbc:mysql:///travelmanagementsystem",
        "root",
        "your_password"
     );
     ```

3. **Open the project in IntelliJ IDEA (or any Java IDE).**

4. **Build and run the project.**

---

## 🚀 Usage

- Launch the application.
- Login or Sign up as a user.
- Navigate through modules:
  - Book packages and hotels
  - Manage customer details
  - Make payments
  - View travel destinations

---


## 🔮 Future Enhancements

- 📱 Mobile application support (Android/iOS)
- 🌐 Integration with third-party booking APIs
- 🧾 Advanced reporting and analytics
- ✈️ Real-time flight and hotel availability

---

## Contributor

- [harshalmandliya](https://github.com/harshalmandliya)

---

