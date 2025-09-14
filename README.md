Student CRUD API - Spring Boot + PostgreSQL

This is a simple Spring Boot REST API project that demonstrates basic CRUD operations (Create, Read, Update, Delete, Patch) on a Student entity using PostgreSQL as the database.

📌 Features

REST API endpoints for:

GET → Fetch all students / fetch by ID

POST → Add a new student

PUT → Update student details

PATCH → Update partial details (e.g., only email)

DELETE → Remove a student

Database: PostgreSQL

JPA + Hibernate for ORM

Spring Data JPA Repository

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

Added via Spring Initializr
:

Spring Web

Spring Data JPA

PostgreSQL Driver

🛠️ Setup & Run
1️⃣ Database Setup

Open PostgreSQL terminal:

psql -U postgres


Create the database:

CREATE DATABASE studentdb;


Connect to it:

\c studentdb;
3️⃣ Run the App
mvn spring-boot:run


App will start on:
👉 http://localhost:8080

📌 API Endpoints
Get all students
GET /students

Get student by ID
GET /students/{id}

Add new student
POST /students


Request Body:

{
  "name": "Aadi",
  "email": "aadi@example.com"
}

Update student
PUT /students/{id}


Request Body:

{
  "name": "Nikhil",
  "email": "nikhil@example.com"
}

Update partial (email only)
PATCH /students/{id}


Request Body:

{
  "email": "newemail@example.com"
}

Delete student
DELETE /students/{id}

🤝 Contribution

Feel free to fork this repo, open issues, and submit pull requests!
