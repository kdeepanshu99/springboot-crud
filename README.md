# 🚀 Employee Management System (Spring Boot + Docker)

A **RESTful CRUD application** built using **Spring Boot**, **MySQL**, and **Docker**.  
This project demonstrates backend development best practices including clean architecture, environment-based configuration, and containerized deployment.

---

## 🧰 Tech Stack

- **Java 21**
- **Spring Boot 4.x**
- **Spring Data JPA (Hibernate)**
- **MySQL 8**
- **Docker & Docker Compose**
- **Maven**
- **Swagger (OpenAPI)**

---

## 📁 Project Structure
crudapp/\
│\
├── src/\
│ └── main/\
│ ├── java/com/example/crudapp\
│ │ ├── controller\
│ │ ├── service\
│ │ ├── repository\
│ │ └── model\
│ └── resources\
│ ├── application.properties\
│ ├── application-local.properties\
│ └── application-docker.properties\
│\
├── Dockerfile\
├── docker-compose.yml\
├── pom.xml\
└── README.md\


---

## ⚙️ Application Profiles

| Profile | Description |
|--------|-------------|
| `local` | Runs app using local MySQL |
| `docker` | Runs app inside Docker with MySQL container |

---

## 🐳 Docker Setup

### Dockerfile
Builds and runs the Spring Boot application inside a container.

### docker-compose.yml
Runs:
- **employee-app** → Spring Boot backend
- **mysql-db** → MySQL database

---

## ▶️ Run Application

### ✅ Option 1: Run Using Docker (Recommended)

```bash
  docker compose up --build
```

### Access:
- API: http://localhost:8080
- Swagger UI: http://localhost:8080/swagger-ui/index.html

### Stop containers:
```bash
  docker compose down
```

---

### ✅ Option 2: Run Locally (Without Docker)
( Make sure MySQL is running and database ems exists. )
```bash
  mvn clean package -DskipTests
  mvn spring-boot:run -P local
```

### Access:
- API: http://localhost:8080
- Swagger UI: http://localhost:8080/swagger-ui/index.html

---

## 📌 API Endpoints
| Method   | Endpoint              | Description         |
|----------|-----------------------|---------------------|
| `Get`    | `/api/employees`      | Get all employees   | 
| `Get`    | `/api/employees/{id}` | Get employee by ID  |
| `POST`   | `/api/employees`      | Create new employee |
| `PUT`    | `/api/employees/{id}` | Update employee     |
| `DELETE` | `/api/employees/{id}` | Delete employee     |

---
