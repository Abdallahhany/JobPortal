## Project Description

The **Job Portal** project is a web application designed to facilitate job postings and applications. It allows recruiters to post job openings and manage applications, while job seekers can search and apply for jobs. The application is built using Java and Spring Boot, providing a robust and scalable backend, with a MySQL database for data storage.

## Important Features

- **Job Posting Management**: Recruiters can create, update, and delete job postings.
- **Job Application Management**: Job seekers can search for jobs, view job details, and apply for jobs.
- **User Authentication and Authorization**: Secure login and registration for both recruiters and job seekers.
- **File Upload and Download**: Supports uploading resumes and downloading job-related documents.
- **Search Functionality**: Advanced search options to filter jobs based on various criteria like location, job type, and remote options.

## Used Technologies

- **Java**: The primary programming language used for the backend.
- **Spring Boot**: Framework used to build the backend services.
- **Spring Security**: Used for authentication and authorization.
- **MySQL**: Database used for storing application data.
- **Maven**: Build automation tool used for managing project dependencies.
- **IntelliJ IDEA**: Integrated Development Environment (IDE) used for development.
- **Spring Data JPA**: Used for data access and manipulation.
- **Spring MVC**: Used for building the web layer of the application.
- **Thymeleaf**: Template engine used for rendering views (if applicable).
- **JavaScript**: Used for client-side scripting.
- **HTML/CSS**: Used for building the frontend interface.

## Getting Started

To run the project locally, follow these steps:

1. **Clone the repository**:
   ```sh
   git clone <repository-url>
   ```

2. **Navigate to the project directory**:
   ```sh
   cd jobportal
   ```

3. **Build the project using Maven**:
   ```sh
   mvn clean install
   ```

4. **Run the application**:
   ```sh
   mvn spring-boot:run
   ```

5. **Access the application**:
   Open your web browser and navigate to `http://localhost:8000`.

## Configuration

The application configuration is managed through the `application.properties` file located in the `src/main/resources` directory. Key configurations include:

- **Database Configuration**:
  ```ini
  spring.datasource.url=jdbc:mysql://localhost:3306/jobportal
  spring.datasource.username=dbuser
  spring.datasource.password=dbpass
  ```

- **Server Port**:
  ```ini
  server.port=8000
  ```

## Summary
This project is built to demonstrate the skills and knowledge of Java, Spring Boot, and MySQL.
It provides a basic implementation of a job portal application with essential features for job posting and application management.
The application can be further enhanced with additional features like email notifications, user profiles, and job recommendations.