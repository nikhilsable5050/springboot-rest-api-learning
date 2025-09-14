
# Spring Boot REST API Learning  

A Spring Boot project to learn REST APIs with **GET, POST, PUT, PATCH, DELETE** operations.  

---

## 🚀 Features
- **GET** → Fetch all data  
- **POST** → Add new data  
- **PUT** → Update existing data (full update)  
- **PATCH** → Update partially  
- **DELETE** → Remove data  

---

## ⚙️ Technologies Used
- Java 21  
- Spring Boot 3.x  
- Maven  
- Postgresql 

---



## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/springboot-rest-api-learning.git
   cd springboot-rest-api-learning
Run the project:

bash
Copy code
mvn spring-boot:run
Or run directly from your IDE.

📡 API Endpoints
1. GET (Fetch all items)
http
Copy code
GET /api/items
📡 API Endpoints
1. GET (Fetch all students)
GET /api/students


Response:

[
  {
    "id": 1,
    "name": "Nikhil",
    "email": "nikhil@example.com"
  }
]

2. GET (Fetch single student)
GET /api/students/1


Response:

{
  "id": 1,
  "name": "Nikhil",
  "email": "nikhil@example.com"
}

3. POST (Add new student)
POST /api/students


Request Body:

{
  "name": "Ravi",
  "email": "ravi@example.com"
}


Response:

{
  "id": 2,
  "name": "Ravi",
  "email": "ravi@example.com"
}

4. PUT (Full update of student)
PUT /api/students/2


Request Body:

{
  "name": "Ravi Kumar",
  "email": "ravikumar@example.com"
}

5. PATCH (Partial update of student)
PATCH /api/students/2


Request Body:

{
  "email": "ravi.new@example.com"
}

6. DELETE (Remove student)
DELETE /api/students/2


Response:

{
  "message": "Student deleted successfully"
}

