# Course Schedule Planner API Interface

The project compiles class and interface definitions required by both REST API server and client into a JAR. The [Course Schedule Planner REST API](https://github.com/tvdmitrii/courseSchedulePlanner-api) project uses the JAR to implement the REST API server, while [Course Schedule Planner WebApp](https://github.com/tvdmitrii/courseSchedulePlanner-webApp) uses it to implement the client for accessing the API.

## Contents
- `com.turygin.api.model` package contains DTO class definitions, for example, `CourseDTO` which contains the course information.
- `com.turygin.api.repository` package contains repository interface definitions, for example, `ICourseRepository` which describes available endpoints for course manipulation.