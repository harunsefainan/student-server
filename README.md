﻿<div align="center">
<h1>Student Server</h1>


![GitHub Issues](https://img.shields.io/github/issues/harunsefainan/student-server)
![GitHub License](https://img.shields.io/github/license/harunsefainan/student-server)
![GitHub Pull Requests](https://img.shields.io/github/issues-pr/harunsefainan/student-server)
![GitHub Forks](https://img.shields.io/github/forks/harunsefainan/student-server)
![GitHub Stars](https://img.shields.io/github/stars/harunsefainan/student-server)

| [English](README.md) | [Turkish](./docs/README_TR.md) |

<a href="https://github.com/harunsefainan/student-server/tree/master/docs"><strong>Explore the more
documentation »</strong></a>
</div>

## Project Overview

This project encompasses a web-based information management application for storing, managing, and presenting student
records. It includes a database management system for student information such as names, surnames, ID numbers,
birthdates, registration dates, and course times. Additionally, it automatically tracks the time of each student's
registration in the system.

The project is developed using Java technologies like Spring Boot and Hibernate. Lombok library is utilized to reduce
code repetitions and create a more readable structure. JpaRepository is used for database operations.

The project features API endpoints for listing student data, searching by student OID, adding new students, updating
existing student information, and deleting student records. After each operation, relevant logs are generated to record
the status of the operation, making it traceable when needed.

The goal of this project is to develop a modern and user-friendly web application that effectively manages student
information.

## Getting Started

### Install Java 17

- This application requires Java 17.
- Please click the link below to download and install
  Java-17: [Java-17](https://www.oracle.com/java/technologies/downloads/#java17)

### Install Gradle 8.7

- This application requires Gradle-8.7.
- Please click the link below to download and install Gradle-8.7: [Gradle-8.7](https://gradle.org/releases/)

### Install & Setup Database

- This application requires MySQL 8.
- Please click the link below to download and install MySQL-8: [MySQL-8](https://dev.mysql.com/downloads/installer/)
- You can use the following file to create a database: [db_setup.sql](./docs/database/db_setup.sql)

### Install Student-Cronjob Project

- If you want to update students' remaining course duration on a daily basis, you can download the Student-Cronjob
  project from: [Student-Cronjob](https://github.com/harunsefainan/student-cronjob)

### Running the application

- Clone the repo
   ```sh
   git clone https://github.com/harunsefainan/student-server
   ```
- Open the project in IntelliJ IDEA or any suitable IDE of your choice.
- Run the project.
- Open the browser and locate to ```localhost:8080``` (If you changed the port use changed port instead of 8080)

## Project Details

![System Context](docs/images/readme/student-ing.png)

### Database

![Entity Models](docs/images/readme/student-entity.png)

### Swagger Documentatiton

You can access the API documentation at `http://localhost:8080/swagger-ui/index.html`.
If you can't see the endpoints when you access the Swagger page, make sure that you typed `/v3/api-docs` in the search
bar and click explore button.<br>

We have an encryption mechanism on the API. If you want to access the endpoints, use the username and password given
below;

- <i>Username - Password</i>
    - User - User

![endpoints](./docs/images/readme/endpoints.png)

#### To view all students, follow the instructions below;

- Go to endpoint `v1/api/students/getAll` .

#### Follow the instructions below to view students by oid;

- Go to endpoint `v1/api/students/getByOID/{oid}`  and fill in the required fields.

#### Follow the instructions below to create a new student;

- Go to endpoint `v1/api/students/newStudent` and fill in the required fields.

#### Follow the instructions below to update student information;

- Go to endpoint `v1/api/students/updateStudent` and fill in the required fields.

#### Follow the instructions below to delete student information;

- Go to endpoint `v1/api/students/deleteStudent/{oid}` and fill in the required fields.

## Built With

 <p align="center">
      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Spring_Framework_Logo_2018.svg/1200px-Spring_Framework_Logo_2018.svg.png" width="155" height="50" alt="Spring Boot" title="Spring Boot 17" class="img-small">
      <img src="https://raw.githubusercontent.com/docker-library/docs/c3d3ca6beed000f9ba6eabc98f3399158f520256/gradle/logo.png" width="155" height="50" alt="Gradle" title="Gradle" class="img-small">
      <img src="https://cogitech.pl/wp-content/uploads/2023/02/Swagger-logo.png" height="50" alt="Swagger" title="OpenAPI 2.0.4" class="img-small">
      <img src="https://cdn-icons-png.flaticon.com/512/5968/5968282.png" width="50" height="50" alt="Java" title="Java 17" class="img-small">
      <img src="https://cdn-icons-png.flaticon.com/512/5968/5968313.png" width="50" height="50" alt="" title="MySQL Workbench 8.0" class="img-small">
   </p>

  <hr>
<div align="center">
   <a href="mailto: harunsefa.inan@gmail.com" target="blank"><img align="center" src="https://cdn-icons-png.flaticon.com/512/9840/9840614.png" height="40" width="40" /></a>
   <a href="https://www.linkedin.com/in/harun-sefa-inan-761a2324b/" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" height="30" width="40" /></a>
</div>
<hr> 




<p align="right">(<a href="#top">back to top</a>)</p>
