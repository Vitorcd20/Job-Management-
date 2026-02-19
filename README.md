# 📌 Job Management API

A RESTful API built with **Java + Spring Boot** for managing job applications and job tracking workflows.

Designed using clean architecture principles, layered structure, and production-ready configuration.

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker & Docker Compose
- Maven
- Lombok
- Jakarta Bean Validation

---

## 📂 Project Structure

```
job-management-api
├── controller
├── service
├── repository
├── dto
├── entity
├── exception
└── config
```

- **controller** → Handles HTTP requests
- **service** → Business logic
- **repository** → Database access layer
- **dto** → Request & Response objects
- **entity** → JPA entities
- **exception** → Global exception handling

---

## ⚙️ Running the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/job-management-api.git
cd job-management-api
```

---

### 2️⃣ Configure Database

Update your `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/job_management
    username: admin
    password: admin
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

---

### 3️⃣ Run with Docker (Database Only)

Create a `docker-compose.yml` file:

```yaml
version: '3.8'

services:
  postgres:
    container_name: job_management_postgres
    image: postgres:16-alpine
    ports:
      - "5432:5432"
    environment:
      POSTGRES_USER: admin
      POSTGRES_PASSWORD: admin
      POSTGRES_DB: job_management
```

Start PostgreSQL:

```bash
docker-compose up -d
```

---

### 4️⃣ Run the Application

```bash
./mvnw spring-boot:run
```

Or:

```bash
mvn clean install
java -jar target/job-management-api.jar
```

Application runs at:

```
http://localhost:8080
```

---

## 📡 API Endpoints

### Jobs

| Method | Endpoint | Description |
|--------|----------|------------|
| POST   | /api/jobs       | Create a job |
| GET    | /api/jobs       | List all jobs |
| GET    | /api/jobs/{id}  | Get job by ID |
| PUT    | /api/jobs/{id}  | Update job |
| DELETE | /api/jobs/{id}  | Delete job |

---

## 📝 Example Request

### Create Job

**POST** `/api/jobs`

```json
{
  "title": "Frontend Developer",
  "description": "React + TypeScript experience required",
  "company": "Tech Company",
  "status": "OPEN"
}
```

---

## 📦 Example Response

```json
{
  "id": 1,
  "title": "Frontend Developer",
  "description": "React + TypeScript experience required",
  "company": "Tech Company",
  "status": "OPEN",
  "createdAt": "2026-02-19T10:15:30"
}
```

---

## 🧪 Running Tests

```bash
mvn test
```

---

## 🛡️ Error Handling

Global error handling implemented using:

- `@ControllerAdvice`
- Custom Exceptions
- Bean Validation (`@Valid`)

Example error response:

```json
{
  "timestamp": "2026-02-19T10:20:00",
  "status": 400,
  "error": "Validation Error",
  "message": "Title must not be blank"
}
```

---

## 📈 Future Improvements

- JWT Authentication
- Role-based Authorization
- Swagger / OpenAPI documentation
- Pagination & Filtering
- CI/CD Pipeline
- Cloud Deployment

---

## 👨‍💻 Author

**Vitor Alexandre Vieira**  
Full Stack Developer  
Java | Spring Boot | React | TypeScript

