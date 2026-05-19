# 🎓 Student Management System

## 📌 Project Description
This is a **Java-based Student Management System** using JDBC and MySQL.  
It performs CRUD operations with input validation and a console-based menu system.

---

## 🚀 Features

- Add Student
- View All Students
- Update Student Details
- Delete Student
- Search Student by ID
- Count Total Students
- Input Validation (ID, Name, Age, Course)

---

## 🛠️ Technologies Used

- Java (Core Java)
- JDBC
- MySQL
- VS Code / Eclipse

---

## 📂 Project Structure


src/
├── dao/ # Database operations (CRUD logic)
├── db/ # Database connection class
├── main/ # Main App (menu-driven program)
├── model/ # Student model class (POJO)
├── service/ # Business logic layer (if used)
├── studentmanagement/ # Additional project layer (if used)
├── ui/ # UI/interaction layer (if used)
└── App.java # Entry point


---

## 🗄️ Database Setup

- Database Name: student_db
- Table Name: students

sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    course VARCHAR(50)
);


▶️ How to Run
Import project into VS Code / Eclipse
Start MySQL server
Configure DB credentials in DBConnection.java
Run App.java
Use menu options in console


📌 Application Menu
===== STUDENT MANAGEMENT SYSTEM =====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Search Student
6. Count Total Students
7. Exit


✨ Key Highlights
Menu-driven console application
JDBC + MySQL integration
Full CRUD operations
Search & Count features
Input validation (professional level)
Clean layered project structure


👩‍💻 Author
Name: Kavya M
Project: Student Management System (Java + JDBC)