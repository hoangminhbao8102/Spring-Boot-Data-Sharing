# Spring-Boot-Data-Sharing

A simple Spring Boot web application that demonstrates how to organize and share data between Controller, Service, Repository, and View layers using **Thymeleaf** and **SQL Server**.

> ✅ Built with Java 17 + Spring Boot 3.3.2 + SQL Server + Thymeleaf (No Lombok)

---

## 📁 Project Structure

```css
SpringBootDataSharingDemo/
├── src/main/java/com/mycompany/springbootdatasharingdemo
│ ├── config/ # WebConfig for MVC settings
│ ├── controller/ # Controllers for Home, Auth, Product
│ ├── model/ # JPA Entities: User, Product
│ ├── repository/ # Spring Data JPA Repositories
│ ├── service/ # Business logic (ProductService)
│ └── DemoApplication.java # Main class
│
├── src/main/resources/
│ ├── templates/ # Thymeleaf templates (HTML)
│ ├── static/ # CSS/JS/Images
│ └── application.properties # App configuration
│
└── pom.xml # Maven build file
```

---

## ⚙️ Prerequisites

- ✅ Java 17+
- ✅ Maven 3.8+
- ✅ SQL Server (local or remote)
- ✅ Apache NetBeans / IntelliJ / Eclipse

---

## 🛠️ Setup & Run

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/SpringBootDataSharingDemo.git
cd SpringBootDataSharingDemo
```

### 2️⃣ Configure Database
Open `src/main/resources/application.properties` and set:

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=SpringBootDemo;trustServerCertificate=true
spring.datasource.username=sa
spring.datasource.password=your_password
```

Or change SpringBootDemo to your existing database name.

### 3️⃣ Create SQL Schema
You can use this script to create DB + sample data:

```sql
CREATE DATABASE SpringBootDemo;

USE SpringBootDemo;

CREATE TABLE Users (
    id INT IDENTITY PRIMARY KEY,
    username NVARCHAR(50) NOT NULL UNIQUE,
    password NVARCHAR(255) NOT NULL
);

INSERT INTO Users (username, password) VALUES
('admin', '123456'), ('user1', '123456');

CREATE TABLE Products (
    id INT IDENTITY PRIMARY KEY,
    name NVARCHAR(100) NOT NULL,
    price DECIMAL(18,2),
    description NVARCHAR(255)
);

INSERT INTO Products (name, price, description) VALUES
('Laptop Dell XPS 13', 32000, 'Ultrabook cao cấp mỏng nhẹ'),
('iPhone 15 Pro', 40000, 'Flagship Apple'),
('Tai nghe Sony XM5', 8000, 'Chống ồn tốt nhất');
```

### 4️⃣ Run Application
```bash
mvn spring-boot:run
```
Visit: http://localhost:8080

## 🌐 Pages

<table>
<tr>
    <th>URL</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>/</td>
    <td>Home page</td>
  </tr>
  <tr>
    <td>/login</td>
    <td>Simple login form</td>
  </tr>
  <tr>
    <td>/products</td>
    <td>List all products</td>
  </tr>
  <tr>
    <td>/products/new</td>
    <td>Add new product</td>
  </tr>
  <tr>
    <td>/products/edit/{id}</td>
    <td>Edit product</td>
  </tr>
  <tr>
    <td>/products/delete/{id}</td>
    <td>Delete product</td>
  </tr>
</table>

---

## 📦 Dependencies
- Spring Boot Web
- Spring Boot Thymeleaf
- Spring Data JPA
- SQL Server JDBC
- Spring Boot DevTools

## 📄 License
This project is licensed under the MIT License.<br>
See LICENSE for more information.

---

## 👨‍💻 Author
@hoangminhbao8102

---

## 👍 Contributions
Contributions, issues and feature requests are welcome!
Feel free to fork and submit pull requests.

---
