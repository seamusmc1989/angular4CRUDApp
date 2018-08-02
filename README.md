# angular4CRUDApp
Angular4CRUDApp boilerplate code for bootstrap, in-mem db and CRUD n-tier architecture 
It has logic for commandlineRunner, get, save and update save/repository logic.

To build this project.
You must have maven configure and angular cli, rimraf, mkdirp and copyfiles installed

Run these commands in the frontend project folder

npm install -g @angular/cli

npm install --save bootstrap

npm install --save-dev rimraf

npm install --save-dev mkdirp

npm install --save-dev copyfiles

To bundle spring boot and the angular2 app together
The project is built by running the following command in the src/main/frontend folder: 
npm run build

To run the app.
Start the spring boot app by running in IDE or command:
mvn spring-boot:run

To view the inmem db once the spring boot Server is started go to:
http://localhost:8080/h2-console/

Connection string for the inmem db
JDBC URL: jdbc:h2:mem:tasks
username: sa
No password required

# The project has the following code features

CommandLineRunner in the main application class to initialise some dummy data in the database

Event Emitter in the tasks-add.component.ts and the task.service.ts

Conditional ngClass logic for display based on boolean

Parent and child components in the task.component.html

CrudRepository implementation in TaskRepository
