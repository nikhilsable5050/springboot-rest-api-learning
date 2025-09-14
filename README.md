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


3️⃣ Run the App
mvn spring-boot:run


App will start on:
👉 http://localhost:8080

📌 API Endpoints
| Method | Endpoint         | Description            | Request Body                                                    | Response                                                                                                                                                  |
| ------ | ---------------- | ---------------------- | --------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| GET    | `/students`      | Fetch all students     | -                                                               | `[{"id":1,"name":"Nikhil","email":"nikhil@example.com"},{"id":2,"name":"Aadi","email":"aadi@example.com"},{"id":3,"name":"Om","email":"om@example.com"}]` |
| GET    | `/students/{id}` | Fetch student by ID    | -                                                               | `{"id":1,"name":"Nikhil","email":"nikhil@example.com"}`                                                                                                   |
| POST   | `/students`      | Add a new student      | `{"name":"Nikhil","email":"nikhil@example.com"}`                | `{"id":1,"name":"Nikhil","email":"nikhil@example.com"}`                                                                                                   |
| PUT    | `/students/{id}` | Update student details | `{"name":"Nikhil Updated","email":"nikhilupdated@example.com"}` | `{"id":1,"name":"Nikhil Updated","email":"nikhilupdated@example.com"}`                                                                                    |
| PATCH  | `/students/{id}` | Update partial details | `{"email":"nikhilnew@example.com"}`                             | `{"id":1,"name":"Nikhil Updated","email":"nikhilnew@example.com"}`                                                                                        |
| DELETE | `/students/{id}` | Delete a student       | -                                                               | `{"message":"Student deleted successfully"}`                                                                                                              |

🤝 Contribution

Feel free to fork this repo, open issues, and submit pull requests!
