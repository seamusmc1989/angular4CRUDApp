# angularBootBasicDemo
angular4SpringBootBasic angular4 spring boot basic example with in-mem db, commandLineRunner, get, save and update example logic

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

