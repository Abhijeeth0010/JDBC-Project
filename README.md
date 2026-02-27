# 💾 JDBC-Project

A simple **Java JDBC (Java Database Connectivity)** project demonstrating how to connect a Java application to a relational database and perform basic operations using standard JDBC APIs. JDBC provides a way for Java programs to send SQL queries to a database and retrieve results at runtime.:contentReference[oaicite:0]{index=0}

---

## 🧠 What Is JDBC?

**JDBC** stands for *Java Database Connectivity*. It is an API in Java that lets your app communicate with databases like **MySQL**, **PostgreSQL**, **SQLite**, etc. using SQL queries. With JDBC you can:

✨ Connect to a database  
🔥 Execute SQL queries  
🔁 Perform CRUD (Create, Read, Update, Delete) operations  
📊 Retrieve and process results  

All of this can be done without external ORM libraries; you interact directly with the database via Java code.:contentReference[oaicite:1]{index=1}

---

## 🛠️ Key Features

- ✅ Establish database connection using JDBC  
- ✅ Retrieve, insert, update, delete records  
- ✅ Demonstrates usage of **DriverManager**, **Connection**, **Statement** / **PreparedStatement**, and **ResultSet**  
- ✅ Beginner-friendly setup — great for learning real SQL integration with Java

---
## 🚀 How to Run the Project

### 📌 Prerequisites

Before running the project, make sure you have:

✔ **JDK 11 or newer** installed  
✔ A **relational database** (e.g., MySQL / PostgreSQL / SQLite)  
✔ The **JDBC driver** for your database added to the project (via Maven or manually)

---

### 🏁 Steps to Run

1. **Clone the repository**

   ```bash
   git clone https://github.com/Abhijeeth0010/JDBC-Project.git
   cd JDBC-Project

Configure Database Details

In your Java code (likely in a connection class), update:

Database URL

Username

Password

Example (MySQL):

String url = "jdbc:mysql://localhost:3306/your_database";
String username = "root";
String password = "your_password";

Build & Run

If you’re using Maven:

mvn clean compile exec:java

Or run directly in your IDE (IntelliJ, Eclipse, VS Code).

Execute Operations

Once running, the program will connect to the database and run queries based on the logic in your code.

⚙️ What You’ll Learn

This project is a great first step for understanding how Java interacts with databases without using frameworks like Hibernate or JPA. You’ll learn:

✔ How JDBC connects to a database
✔ How to write SQL queries in Java
✔ How to process results returned from database
✔ How to handle exceptions with JDBC

📈 Next Enhancements

You could extend the project by adding:

✨ A CRUD menu on the console
✨ Use PreparedStatement for safer queries and to prevent SQL injection
✨ Add input from user (Scanner)
✨ Integrate with a GUI or web UI for real-time interaction
