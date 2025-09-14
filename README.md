
# Spring Boot REST API Learning  

A Spring Boot project to learn REST APIs with **GET, POST, PUT, PATCH, DELETE** operations.  
🎓 Student CRUD API - Spring Boot + PostgreSQL








A Spring Boot REST API project demonstrating basic CRUD operations (Create, Read, Update, Delete, Patch) on a Student entity using PostgreSQL.

📌 Features

REST API endpoints:

GET → Fetch all students / fetch by ID

POST → Add a new student

PUT → Update student details

PATCH → Update partial details (e.g., email only)

DELETE → Remove a student

Database: PostgreSQL

ORM: JPA + Hibernate

Repository: Spring Data JPA

📂 Project Structure
src/main/java/com/example/studentcrud
├── entity
│   └── Student.java
├── repository
│   └── StudentRepository.java
├── controller
│   └── StudentController.java
└── StudentCrudSpringbootPostgresApplication.java

⚙️ Dependencies

Spring Web

Spring Data JPA

PostgreSQL Driver

🛠️ Setup & Run
1️⃣ Database Setup
psql -U postgres

CREATE DATABASE studentdb;
\c studentdb;

2️⃣ Configure Application

src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=postgres
spring.datasource.password=your_password_here

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

3️⃣ Run the Application
mvn spring-boot:run


The application runs at:
👉 http://localhost:8080

🖥️ API Endpoints
Get all students
GET /students


Response:

[
  { "id": 1, "name": "John Doe", "email": "john@example.com" },
  { "id": 2, "name": "Jane Smith", "email": "jane@example.com" }
]

Get student by ID
GET /students/{id}


Response:

{ "id": 1, "name": "John Doe", "email": "john@example.com" }

Add new student
POST /students


Request Body:

{ "name": "John Doe", "email": "john@example.com" }


Response:

{ "id": 1, "name": "John Doe", "email": "john@example.com" }

Update student
PUT /students/{id}


Request Body:

{ "name": "John Updated", "email": "johnupdated@example.com" }

Update partial (email only)
PATCH /students/{id}


Request Body:

{ "email": "newemail@example.com" }

Delete student
DELETE /students/{id}

🤝 Contribution

Fork the repository

Open issues

Submit pull requests

