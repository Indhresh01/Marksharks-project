MarkSharks INC - User Managment Project
Description
This project is a Java application for managing user data, including usernames, emails, and passwords. It provides functionalities for CRUD (Create, Read, Update, Delete) operations on user records.

Features
CRUD Operations: Allows creating, reading, updating, and deleting user data.
Database Connectivity: Connects to a MySQL database to store and retrieve user information securely.
Spring Boot: Utilizes Spring Boot for easy setup and configuration.
Spring Data JPA: Implements data access using Spring Data JPA for database interactions.
Hibernate: Uses Hibernate as the ORM (Object-Relational Mapping) framework for data persistence.
Password Encryption: Implements password encryption to ensure data security.
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/Indhresh01/Marksharks-project.git
Navigate to the project directory:

bash
Copy code
cd Marksharks-project
Build the project using Maven:

Copy code
mvn clean install
Run the application:

Copy code
java -jar target/Marksharks-project.jar
Usage
Access the application at http://localhost:8080.
Use the following API endpoints for CRUD operations:
GET /api/users/fetch: Retrieve all users.
GET /api/users/{id}: Retrieve user by ID.
POST /api/users/register: Create new user.
PUT /api/users/{id}: Update existing user.
DELETE /api/users/{id}: Delete user by ID.
Configuration
Database Configuration: Configure the MySQL database connection in application.properties file.
Application Port: Change the port number in application.properties if needed (server.port property).
Password Encryption: Check SecurityConfig.java for password encryption configuration.
Technologies Used
Java
Spring Boot
Spring Data JPA
Hibernate
MySQL

TODO:
Create custom exception classes for specific error scenarios.
Implement error response structure in the global exception handler.
Implement password encryption using bcrypt.
Ensure API endpoints are accessible only over HTTPS.
Implement input validation to prevent security vulnerabilities.
Implement authentication and authorization mechanisms.
