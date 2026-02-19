# 📦 Inventory Management System

A comprehensive inventory management system built with Spring Boot, MySQL, and Docker. Manage products, suppliers, customers, orders, and track inventory in real-time.
---

## 🚀 Features

### Core Modules
- **Product Management** - Create, update, delete, and track products
- **Category Management** - Organize products into categories
- **Supplier Management** - Manage supplier information and relationships
- **Customer Management** - Track customer details and order history
- **Incoming Orders** - Receive stock from suppliers
- **Outgoing Orders** - Process customer orders and shipments
- **Real-time Inventory Tracking** - Automatic stock level updates



### Technical Features
- ✅ RESTful API with comprehensive endpoints
- ✅ DTO pattern for clean data transfer
- ✅ MySQL database
- ✅ Docker containerization for easy deployment
- ✅ Spring Security for authentication/Authorization
- ✅ Input validation
- ✅ Exception handling
- ✅ Swagger/OpenAPI documentation

---

## 📋 Table of Contents

1. [Prerequisites](#prerequisites)
2. [Installation](#installation)
3. [Configuration](#configuration)
4. [Running the Application](#running-the-application)
5. [API Documentation](#api-documentation)
6. [Database Schema](#database-schema)
7. [Docker Setup](#docker-setup)
8. [Usage Examples](#usage-examples)
9. [Testing](#testing)
10. [Troubleshooting](#troubleshooting)

## 🔧 Prerequisites

Before you begin, ensure you have the following installed:

- **Java 17+** - [Download JDK](https://adoptium.net/)
- **Maven 3.8+** - [Download Maven](https://maven.apache.org/download.cgi)
- **Docker & Docker Compose** - [Download Docker](https://www.docker.com/get-started)
- **MySQL 8.0+** (if not using Docker) - [Download MySQL](https://dev.mysql.com/downloads/)
- **Git** - [Download Git](https://git-scm.com/)

**Optional:**
- IntelliJ IDEA / Eclipse / VS Code
- Postman / Insomnia (for API testing)

---

## 📥 Installation

### 1. Clone the Repository
git clone https://github.com/bluederrick/INVENTORY-MANAGEMENT-SYSTEM.git
cd INVENTORY-MANAGEMENT-SYSTEM
```

### 2. Build the Project

# Clean and install dependencies
mvn clean install

# Skip tests if needed
mvn clean install -DskipTests
```

---

## ⚙️ Configuration

### Application Properties


# Application
spring.application.name=InventoryManagementSystem
server.port=8080

app.base-url=/api/v1

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

# Logging
logging.level.com.stockhub=DEBUG
logging.level.org.springframework.web=INFO
logging.level.org.hibernate.SQL=DEBUG
### Environment Variables (Optional)




DB_HOST=localhost
DB_PORT=3306
DB_NAME=inventory_db
DB_USER=root
DB_PASSWORD=your_password
SERVER_PORT=8080
```

---

## 🏃 Running the Application

### Option 1: Local Development (Without Docker)

#### Step 1: Start MySQL
```bash
# Start MySQL service
# macOS
brew services start mysql

# Linux
sudo systemctl start mysql

# Windows
# Start from Services app
```

#### Step 2: Create Database
```bash
mysql -u root -p

CREATE DATABASE inventory_db;
exit;
```

#### Step 3: Run Application
```bash
# Using Maven
mvn spring-boot:run

# Or run the JAR
java -jar target/InventoryManagementSystem-0.0.1-SNAPSHOT.jar
```

Application will start at: **http://localhost:8080**

---

### Option 2: Docker (Recommended)

#### Step 1: Build Docker Image
```bash
# Build application JAR
mvn clean package -DskipTests

# Build Docker image
docker build -t inventory-management-system .
```

#### Step 2: Run with Docker Compose
```bash
# Start all services (MySQL + Spring Boot)
docker-compose up -d

# View logs
docker-compose logs -f

# Stop services
docker-compose down
```

Application will start at: **http://localhost:8080**

---

## 📚 API Documentation

### Base URL
```
http://localhost:8080/api
```



---

### 📦 Product Endpoints

#### Get All Products
```http
GET /api/products
```






Docker setup

### Dockerfile
```dockerfile
# Build stage
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

### docker-compose.yml
```yaml
version: '3.8'

services:
  mysql:
    image: mysql:8.0
    container_name: inventory-mysql
    environment:
      MYSQL_ROOT_PASSWORD: root123
      MYSQL_DATABASE: inventory_db
      MYSQL_USER: inventory_user
      MYSQL_PASSWORD: inventory_pass
    ports:
      - "3307:3306"
    volumes:
      - mysql_data:/var/lib/mysql
    networks:
      - inventory-network
    healthcheck:
      test: ["CMD", "mysqladmin", "ping", "-h", "localhost"]
      interval: 10s
      timeout: 5s
      retries: 5

  app:
    build: .
    container_name: inventory-app
    environment:
      SPRING_DATASOURCE_URL: jdbc:mysql://mysql:3306/inventory_db?useSSL=false&serverTimezone=UTC
      SPRING_DATASOURCE_USERNAME: inventory_user
      SPRING_DATASOURCE_PASSWORD: inventory_pass
    ports:
      - "8080:8080"
    depends_on:
      mysql:
        condition: service_healthy
    networks:
      - inventory-network
    restart: unless-stopped

volumes:
  mysql_data:

networks:
  inventory-network:
    driver: bridge
```

### Docker Commands
```bash
# Build and start
docker-compose up -d --build

# View logs
docker-compose logs -f app

# Stop services
docker-compose down

# Remove everything (including volumes)
docker-compose down -v

# Restart services
docker-compose restart

# Access MySQL
docker exec -it inventory-mysql mysql -u root -p
```

---

