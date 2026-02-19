#!/bin/bash
# --------------------------
# Start MySQL Docker container
# --------------------------
echo "Starting MySQL container..."
docker-compose up -d db

# Wait a few seconds for MySQL to be ready
echo "Waiting for MySQL to initialize..."
sleep 10

# --------------------------
# Run Spring Boot application
# --------------------------
echo "Starting Spring Boot application..."
mvn spring-boot:run

