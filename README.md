# 🧑‍💻 CRUD de Alumno - Spring Boot

Este proyecto forma parte del **Laboratorio de Desarrollo de Aplicaciones Web (DAW)**.  
El objetivo es **crear una aplicación CRUD (Crear, Leer, Actualizar y Eliminar)** usando **Spring Boot** con conexión a una base de datos MySQL.

---

## 🎯 Idea del laboratorio

El proyecto consiste en un **sistema básico de gestión de alumnos**, donde se puede:
- Registrar nuevos alumnos.  
- Listar todos los alumnos registrados.  
- Editar los datos de un alumno existente.  
- Eliminar registros.  

Todo esto se gestiona mediante un **backend en Spring Boot** y un **frontend sencillo con HTML y JavaScript**.

---

## 🧩 Tecnologías utilizadas

- **Java 17+**
- **Spring Boot 3.x**
  - Spring Web
  - Spring Data JPA
- **MySQL 8.x**
- **Maven**
- **HTML + JavaScript**
- **IntelliJ IDEA / STS / VS Code**
- **Tomcat embebido (Spring Boot)**

---

## ⚙️ Recursos necesarios

Antes de ejecutar el proyecto, asegúrate de tener:
1. **Java JDK 17 o superior**
2. **MySQL (XAMPP o instalación local)**
3. **SQLyog o cualquier cliente MySQL**
4. **IntelliJ IDEA o Spring Tool Suite (STS)**
5. **Maven configurado (ya viene con IntelliJ)**

---

## 🧱 Configuración de la base de datos

1. Abre tu cliente MySQL (por ejemplo, SQLyog o phpMyAdmin).
2. Crea la base de datos:

CREATE DATABASE colegio;

---

## ⚙️ Archivo application.properties

src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/colegio?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
server.port=8080













