# springboot-rest-api-learning
“A Spring Boot project to learn REST APIs with GET, POST, PUT, PATCH, DELETE”
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
- H2 Database (in-memory)  

---

## 📂 Project Structure
src/main/java/com/example/learningrestapis
├── controller
├── service
├── model
└── repository

yaml
Copy code

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
Response:

json
Copy code
[
  {
    "id": 1,
    "name": "Book",
    "price": 200
  }
]
2. POST (Add new item)
http
Copy code
POST /api/items
Request Body:

json
Copy code
{
  "name": "Laptop",
  "price": 55000
}
Response:

json
Copy code
{
  "id": 2,
  "name": "Laptop",
  "price": 55000
}
3. PUT (Full update)
http
Copy code
PUT /api/items/2
Request Body:

json
Copy code
{
  "name": "Laptop Pro",
  "price": 60000
}
4. PATCH (Partial update)
http
Copy code
PATCH /api/items/2
Request Body:

json
Copy code
{
  "price": 58000
}
5. DELETE (Remove item)
http
Copy code
DELETE /api/items/2
Response:

json
Copy code
{
  "message": "Item deleted successfully"
}
✨ Future Improvements
Add authentication (JWT)

Connect with MySQL/Postgres

Add Swagger UI for API docs

🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss.
