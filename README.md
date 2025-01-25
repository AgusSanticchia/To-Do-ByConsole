# ToDo Application

A basic application to manage tasks (ToDo) using Spring Boot for the backend.

## Technologies Used

- **Spring Boot**: Framework for creating Java applications.
- **JPA (Java Persistence API)**: To interact with the database.
- **MySQL**: Database to persist task information.
- **CORS**: Configured to allow requests from a client at `http://localhost:3000`. (Frontend on port 3000 needs to be added)

## Project Structure

### Entities

#### ToDo

Represents a task within the system.

**Fields:**
- `id`: Unique identifier (auto-generated).
- `title`: Title of the task.
- `completed`: Status of the task (completed or not).
- `description`: Detailed description of the task.

### Controller

#### ToDoController

Handles HTTP requests related to tasks.

**Routes:**
- `GET /todos`: Retrieves all tasks.
- `GET /todos/{id}`: Retrieves a specific task by its ID.
- `POST /todos`: Creates a new task.
- `PUT /todos/{id}`: Updates an existing task.
- `DELETE /todos/{id}`: Deletes a task.

### CORS Configuration

Allows requests from `http://localhost:3000`.

### Services

#### ToDoService

Contains the business logic to manage tasks.

**Methods:**
- `getAllToDos()`: Returns a list of all tasks.
- `getToDoById(Long id)`: Returns a specific task by its ID.
- `createToDo(ToDo toDo)`: Creates and saves a new task.
- `updateToDo(Long id, ToDo toDo)`: Updates an existing task.
- `deleteToDo(Long id)`: Deletes a task by its ID.

### Repository

#### ToDoRepository

Interface extending JpaRepository to perform CRUD operations on the database.

## Database Configuration

The application uses MySQL as the database. Ensure to configure the correct properties in the `application.properties` file:

```properties
spring.application.name=ToDo
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
