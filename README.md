# WebApp of team ChillWatcher

This file shall be an instruction how to start the app at localhorst. A public version of the app is hosted with a webserver on the domain pfobs.de/ChillWatcher. The WebApp is based on the frameworks Angular (frontend) and Spring-Boot (backend). Elasticsearch is used as a search engine.

## Hosting
The public version of the ChillWatcher WebApp is hosted on a WebServer from the Telekom. From this webserver the client receives static data like HTML, CSS or JS files. On the other hand, the client have to talk to an API of an app that keeps the business logic. This (backend) app is hosted on Heroku. Client and server communicate on a REST-API. Notice: Because of swabian parsimony, the backend app on Heroku has to sleep between 00:00 and 07:00 every day. To store data permanently and also search for it, Elasticsearch is used as a search engine. Elasicsearch is hosted on Bonsai.

## Step One

Download and install Node.js and npm with the guideline on https://www.npmjs.com/get-npm and confirm the installation of both.

## Step Two

Download and install the Angular CLI with the command "npm install -g @angular/cli". Install the Angular Material module, too (https://material.angular.io/guide/getting-started). Answer questions of the Material module with "yes" and select indigo as color. Furthermore install several libraries with these commands "npm install ng2-date-countdown --save", "npm install ngx-bootstrap --save".

## Step Three

Download and install the Spring Boot CLI with the guideline on https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html. Important: In the pox.xml Java 8 is used as JDK, if you want to use another JDK you have to change the dependence.

## Step Four

Create a new Angular project on your local pc with the command "ng new ChillWatcher". 
Answer every question with "yes" and choose SASS as compiler.

## Step Five

Download the code from the repository https://github.com/Pfob/ChillWatcher to another local folder on your PC.

## Step Six

Copy the downloaded files and the "src" folder to the folder of your recently created Angular project. Delete all files and folders there, except the "e2e" and "node_modules" folder overwrite the existing files.

## Step Seven

On the CLI switch to the folder of your Angular project. Start the Spring-Boot app there with the command "mvn spring-boot:run". 
The Spring-Boot app will now run on http://localhost:8080/movies.

## Step Eight

Create another CLI window and switch to the folder, too. Start the Angular app with the command "ng serve". 
The Angular app will now run on http://localhost:4200/ChillWatcher. The app will automatically reload if you change any of the source files.

## Congratulations

The WebApp will now run on the localhost of your PC. You can interact with the app on http://localhost:4200/ChillWatcher, the output of the interface of the backend can be seen on http://localhost:8080/movies.