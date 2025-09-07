🎓 Student Management System (Java + JDBC + MySQL)

A simple console-based Student Management System built with Java 11, JDBC, and MySQL.
This project demonstrates basic CRUD operations (Create, Read, Update, Delete) on a students table in a MySQL database.

📌 Tech Stack

✨ Features

  🔗 MySQL + JDBC connection (Connector/J)

   🗄️ Students Table → id, name, email, age

⚡ CRUD Operations

     ➕ Add new student

     📋 View all students

     ❌ Delete student by ID


🔐 PreparedStatement to prevent SQL Injection

♻️ Resource management with try-with-resources

🛠 Requirements

☕ Java 11 (JDK 11)

🗄️ MySQL 8+

🔌 MySQL Connector/J (JDBC driver)

💻 Any Java IDE (VS Code / IntelliJ IDEA / Eclipse)



# Student Database App - Mini Project

## Setup Instructions
1. Install MySQL and create the database:
   ```sql
   CREATE DATABASE student_db;
   USE student_db;
   SOURCE db/schema.sql;
