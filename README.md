# Notes App

A small full-stack notes application built to learn the Spring Boot ecosystem end-to-end — backend, database, and a plain frontend — by building something real rather than following a toy tutorial.

## Features

- Create, edit, and delete notes
- Edits are appended as a timestamped update rather than overwriting history
- Auto-tracked `createdAt` / `updatedAt` timestamps via Spring Data JPA auditing
- Recent notes view with "Show more" pagination (loads 10 at a time)
- Clean, dark-themed UI with no frontend framework — just HTML, CSS, and vanilla JavaScript

## Tech Stack

**Backend**
- Java, Spring Boot
- Spring Web (REST API)
- Spring Data JPA (database access)
- PostgreSQL (production database)
- Lombok (boilerplate reduction)
- Maven (build tool)

**Frontend**
- HTML / CSS / vanilla JavaScript (no framework — intentional, to keep focus on the backend)

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/create` | Create a new note, or append an edit to an existing one (`?edit=true`) |
| GET | `/api/notes` | Get all notes |
| DELETE | `/api/delete/{id}` | Delete a note by id |

## Running Locally

1. Clone the repo:
   ```bash
   git clone https://github.com/YOUR_USERNAME/notes-app.git
   ```
2. Create a local PostgreSQL database named `notesdb`.
3. Update `src/main/resources/application.properties` with your local database username.
4. Run the app from IntelliJ, or:
   ```bash
   ./mvnw spring-boot:run
   ```
5. Open `http://localhost:8080/index.html`.

## What I Learned

Built as project 1 of a broader hands-on roadmap to strengthen backend fundamentals and deployment skills: Spring Boot project structure, JPA entities and repositories, the service/controller layering pattern, database connection configuration, Spring Data JPA auditing, and debugging real startup/connection errors (component scanning, dialect resolution, role/auth mismatches).

## Roadmap / Possible Next Steps

- Dockerize the app
- Deploy live (Render / Railway)
- Add tags and search
- Add input validation and proper error handling
- Add automated tests
