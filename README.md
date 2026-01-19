# Course Schedule Planner API Interface

This repository defines the shared API contracts used by both the backend REST API server and its clients. It is packaged as a standalone JAR containing DTOs and resource interface definitions, and is consumed by the [Course Schedule Planner REST API](https://github.com/tvdmitrii/courseSchedulePlanner-api) and the [Course Schedule Planner WebApp](https://github.com/tvdmitrii/courseSchedulePlanner-webApp).

The interface module exists to enforce a clear separation of concerns between service implementation and API consumption, and to provide compile-time guarantees around request/response models and available endpoints. This structure helps keep backend and client components decoupled while enabling safe evolution of the API.

## Contents

- `com.turygin.api.model` — DTO class definitions shared across services and clients (e.g., `CourseDTO`).
- `com.turygin.api.resource` — Resource interface definitions describing available REST endpoints (e.g., `ICourseRepository`).
