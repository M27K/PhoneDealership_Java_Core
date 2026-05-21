# 📱 Smartphone Dealership Management System

A console-based Java application developed using **Core Java, JDBC, and MySQL** to simulate the workflow of a smartphone dealership.  
The project demonstrates concepts like **Object-Oriented Programming, Collections Framework, Exception Handling, File Handling, Streams API, and Database Integration**.

---

# 🚀 Features

## ✅ Inventory Management
- Display available smartphones
- Retrieve inventory dynamically from MySQL database
- Manage smartphone details:
  - Model Name
  - Colour
  - Price

---

## ✅ Customer Management
- Manage customers using `HashMap`
- Select customers using Customer ID
- Store customer information:
  - Customer ID
  - Name
  - Available Balance

---

## ✅ Employee Sales Processing
- Process smartphone sales
- Verify customer balance before purchase
- Remove sold smartphones from inventory

---

## ✅ EMI Calculation
- Handle insufficient balance using custom exception
- Provide EMI option for customers

---

## ✅ Exception Handling
Implemented custom exception:
- `LowBalanceException`

Used for:
- Low balance validation
- Purchase flow handling

---

## ✅ File Handling
- Record completed sales into `Sales.txt`
- Maintain sales history using:
  - `BufferedWriter`
  - `FileWriter`

---

## ✅ JDBC & MySQL Integration
- Connected Java application with MySQL database
- Retrieved smartphone inventory using JDBC
- Executed SQL queries using:
  - `Connection`
  - `Statement`
  - `ResultSet`

---

## ✅ Streams & Lambda Expressions
Used Java Streams for:
- Customer display
- Inventory iteration
- Collection processing

---

# 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Core Java | Application Development |
| JDBC | Database Connectivity |
| MySQL | Database Management |
| Collections Framework | Data Management |
| Streams API | Collection Processing |
| Exception Handling | Error Management |
| File Handling | Sales Record Storage |

---

# 📂 Project Structure

```text
Smartphone-Dealership-System/
│
├── Deal.java
├── smartPhone.java
├── Emplyee.java
├── Costmer.java
├── Sales.txt
└── README.md
```

---

# 🗄️ Database Setup

## Create Database

```sql
CREATE DATABASE SalesData;
USE SalesData;
```

---

## Create Inventory Table

```sql
CREATE TABLE Inventry(
    Mnum INT PRIMARY KEY,
    name VARCHAR(20),
    colour VARCHAR(20),
    price INT
);
```

---

## Insert Sample Data

```sql
INSERT INTO Inventry VALUES(101, "Samsung", "Silver", 25000);
INSERT INTO Inventry VALUES(102, "iphone", "Orange", 100000);
INSERT INTO Inventry VALUES(103, "Poco", "Yellow", 27000);
INSERT INTO Inventry VALUES(104, "Nokia", "Gray", 20000);
```

---

# ⚙️ JDBC Configuration

Update database credentials in the project:

```java
String url = "jdbc:mysql://localhost:3306/SalesData";

Connection con = DriverManager.getConnection(
    url,
    "root",
    "YOUR_PASSWORD"
);
```

---

# ▶️ How to Run

## 1️⃣ Clone Repository

```bash
git clone <repository-link>
```

---

## 2️⃣ Add MySQL JDBC Driver

Add:
```text
mysql-connector-j.jar
```

to:
- IDE Libraries
OR
- Project Classpath

---

## 3️⃣ Compile Java Files

```bash
javac *.java
```

---

## 4️⃣ Run Application

```bash
java Deal
```

---

# 📌 Application Workflow

1. Load smartphone inventory from MySQL database
2. Display available smartphones
3. Select customer using Customer ID
4. Select smartphone
5. Validate customer balance
6. Process purchase
7. Handle EMI option if balance is insufficient
8. Record sales transaction into file

---

# 📖 Concepts Practiced

- Object-Oriented Programming (OOP)
- Classes & Objects
- Inheritance
- Collections Framework
- Exception Handling
- JDBC Connectivity
- MySQL Integration
- Streams & Lambda Expressions
- File Handling

---

# 🔮 Future Improvements

- GUI using JavaFX or Swing
- Authentication & Login System
- Stock Quantity Management
- Sales Dashboard
- Search & Filter Functionality
- REST API using Spring Boot
- Web-based Frontend Integration

---

# 👨‍💻 Author

### Mayur Katkar
```
