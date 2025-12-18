# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

iRIX HRS is a Spring Boot 4.0.0 application with Vaadin 25 (Java-based UI), jOOQ for database access, Flyway for migrations, and H2 as the database.

## Build & Development Commands

```bash
# Run the application (starts on http://localhost:8080)
./mvnw spring-boot:run

# Run all tests
./mvnw test

# Run a single test class
./mvnw test -Dtest=IrixHrsApplicationTests

# Run a single test method
./mvnw test -Dtest=Irix/HrsApplicationTests#contextLoads

# Build the project
./mvnw package

# Build frontend (Vaadin)
./mvnw vaadin:build-frontend

# Generate jOOQ code from Flyway migrations
./mvnw generate-sources
```

## Technology Stack

- **Java 25** with Spring Boot 4.0.0
- **Vaadin 25** - Java-based UI framework (use Java views, not React)
- **jOOQ** - Type-safe SQL query building and database access
- **Flyway** - Database migrations (place in `src/main/resources/db/migration/`)
- **H2** - Embedded database (accessible via H2 Console)

## Project Structure

- `src/main/java/hrs/` - Main application code
- `src/main/java/hrs/jooq/` - Generated jOOQ code (tables, records, POJOs, DAOs)
- `src/main/resources/db/migration/` - Flyway SQL migration files
- `src/main/resources/application.properties` - Application configuration
- `src/test/java/hrs/` - Test classes

## Key Conventions

- Use jOOQ for all database queries (not JPA/Hibernate)
- Flyway migration naming: `V{version}__{description}.sql` (e.g., `V1__create_tables.sql`)
- After adding/modifying Flyway migrations, run `./mvnw generate-sources` to regenerate jOOQ code
- Vaadin views use Java-based component API