
# # springboot_todo-app
 
Demo react video: https://youtu.be/w45BqsNz4hs
Demo jsp video: https://youtu.be/jH_SBqm20uc

## Introduction
Practice project in building a simple web application using Spring Boot and React.
Two variant with react frontend and simply using jsp as view
#### Functionality
 - Create, update and delete notes (todo)

## Structure
	- Backend Port
		- port 8080 (default spring port)
	-  Login
		- username: ckkqwer
		- password: abc123
	- Model
		- Todo
			- int id, String username, String description, LocalDate targetDate, boolean isDone

## React Version
	- Frontend Port
		- port 3000 (default react port)
	- Route
		- GET
			- /users/{username}/todos
				- retrieve all todos of the user
			- /users/{username}/todos/{id}
				- retrieve a todo of the user by id 
		- POST
			- /users/{username}/todos
				- create todo object
		- PUT
			- /users/{username}/todos/{id}
				- update todo of the user by id 
		- DELETE
			- /users/{username}/todos/{id}
				- delete todo of the user by id

## JSP Version
	- Database
		- using h2 database, interact via jpa
		- access GUI in route /h2-console
		- jdbc url = jdbc:h2:mem:testdb
		- username = sa, no password
	- Security
		- using Spring Security to manage and control user credentials


