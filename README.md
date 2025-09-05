<img width="1536" height="1024" alt="Logo de LibraryTrack" src="https://github.com/user-attachments/assets/2b5feb07-97c0-42f0-826c-90accd468f87" />

# API REST de Gestión de Bibliotecas


---

Esta es una API REST para la gestión de libros y autores en una biblioteca. Construida con **Spring Boot WebFlux** y **MongoDB**, sigue los principios de la **Arquitectura Hexagonal** para un diseño robusto y desacoplado.

---

## 🛠️ Tecnologías Clave

* **Java 21**: Lenguaje de programación.
* **Spring Boot WebFlux**: Framework reactivo para crear APIs no bloqueantes.
* **MongoDB Reactivo**: Base de datos NoSQL con soporte para programación reactiva.
* **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.
* **Arquitectura Hexagonal (Clean Architecture)**: Implementada a través del **Scaffold de Bancolombia** para un diseño robusto y desacoplado.

---


## 📝 Requisitos Previos

Asegúrate de tener instalado lo siguiente:

* **Java Development Kit (JDK) 17 o superior**
* **Gradle 8.8  o superior**
* **Docker** (para levantar la base de datos de forma sencilla)

---

## 🏛️ Arquitectura del Proyecto

Este proyecto está construido siguiendo los principios de la **Arquitectura Limpia**, utilizando el **Scaffold de Bancolombia**. Esta metodología nos permite separar las preocupaciones del negocio del resto del proyecto, asegurando que nuestra lógica de negocio sea independiente de frameworks, bases de datos o interfaces de usuario.

Los componentes principales de la arquitectura se organizan de la siguiente manera:

* **Dominio**: Contiene las entidades y la lógica de negocio principal del proyecto.
* **Aplicación**: Orquesta el flujo de datos y las interacciones con el dominio.
* **Infraestructura**: Incluye los adaptadores y la implementación de detalles técnicos (como la conexión a la base de datos MongoDB).

Puedes encontrar más información detallada sobre esta arquitectura en la documentación oficial del [Scaffold de Bancolombia](https://bancolombia.github.io/scaffold-clean-architecture/docs/getting-started).

---

## 📂 Estructura del Proyecto

Este proyecto sigue una arquitectura modular, separando las responsabilidades en capas claras. La estructura principal del código fuente se encuentra en `src/main/java/com/biblioteca`.

<pre>
📦LibraryTrack
┣ 📂applications
┃ ┗ 📂app-service
┃ ┃ ┣ 📂src
┃ ┃ ┃ ┣ 📂main
┃ ┃ ┃ ┃ ┣ 📂java
┃ ┃ ┃ ┃ ┃ ┗ 📂con.com.librarytrack
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂config
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜[configs and beans]
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MainApplication.java
┃ ┃ ┃ ┃ ┗ 📂resources
┃ ┃ ┃ ┃ ┃ ┣ 📜[properties]
┃ ┃ ┃ ┗ 📂test
┃ ┃ ┃ ┃ ┗ 📂java
┃ ┃ ┃ ┃ ┃ ┗ 📂[package]
┃ ┃ ┗ 📜build.gradle
┣ 📂deployment
┃ ┣ 📜[Dockerfile, Pipelines as a code]
┣ 📂domain
┃ ┣ 📂model
┃ ┃ ┣ 📂src
┃ ┃ ┃ ┣ 📂main
┃ ┃ ┃ ┃ ┗ 📂java
┃ ┃ ┃ ┃ ┃ ┗ 📂con.com.librarytrack.model
┃ ┃ ┃ ┗ 📂test
┃ ┃ ┃ ┃ ┗ 📂java
┃ ┃ ┃ ┃ ┃ ┗ 📂[package]
┃ ┃ ┗ 📜build.gradle
┃ ┗ 📂usecase
┃ ┃ ┣ 📂src
┃ ┃ ┃ ┣ 📂main
┃ ┃ ┃ ┃ ┗ 📂java
┃ ┃ ┃ ┃ ┃ ┗ 📂con.com.librarytrack.usescase
┃ ┃ ┃ ┗ 📂test
┃ ┃ ┃ ┃ ┗ 📂java
┃ ┃ ┃ ┃ ┃ ┗ 📂[package]
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂usecase
┃ ┃ ┗ 📜build.gradle
┣ 📂infrastructure
┃ ┣ 📂driven-adapters
┃ ┣ 📂entry-points
┃ ┗ 📂helpers
┣ 📜.gitignore
┣ 📜build.gradle
┣ 📜gradle.properties
┣ 📜lombok.config
┣ 📜main.gradle
┣ 📜README.md
┗ 📜settings.gradle
</pre>
---

## 🚀 Instalación y Ejecución

1.  **Clona el repositorio:**

    ```bash
    git clone [https://github.com/tu-usuario/nombre-del-repositorio.git](https://github.com/tu-usuario/nombre-del-repositorio.git)
    cd nombre-del-repositorio
    ```

2.  **Levanta la base de datos MongoDB con Docker:**

    ```bash
    docker run --name mi-mongo-db -d -p 27017:27017 mongo:latest
    ```

3.  **Compila y ejecuta la aplicación con Maven:**

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

La aplicación estará disponible en `http://localhost:8080`.

---

## 📌 Endpoints de la API

A continuación se detallan algunos de los principales endpoints para empezar a utilizar la API.

### Libros

#### **`GET /api/libros`**
Obtiene una lista de todos los libros.

**Respuesta de ejemplo:**
```json
[
  {
    "id": "60a4e6b2e1a2c3d4e5f67890",
    "titulo": "El Señor de los Anillos",
    "autor": "J.R.R. Tolkien"
  },
  {
    "id": "60a4e6b2e1a2c3d4e5f67891",
    "titulo": "Cien Años de Soledad",
    "autor": "Gabriel García Márquez"
  }
]
```
---
#### **`POST /api/libros`**
Crea un nuevo libro.

**Cuerpo de la Solicitud:**

```json

{
  "titulo": "1984",
  "autor": "George Orwell"
}

```

**Respuesta de ejemplo:**
```json

{
  "id": "60a4e6b2e1a2c3d4e5f67892",
  "titulo": "1984",
  "autor": "George Orwell"
}

```
---

**Para la documentación completa de todos los endpoints, sus parámetros y códigos de respuesta, por favor, consulta la Wiki del proyecto.**


---

# 🤝 Contribución

Nos encantaría que contribuyeras a este proyecto. Si deseas colaborar, por favor, lee nuestra Guía de Contribución para saber cómo empezar.
