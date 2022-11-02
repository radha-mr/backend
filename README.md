## Natflix_Backend
## Before Setup
clone the repository and open in intellJ and run the application
## Run

The database ( the exported table )is provided inside resource folder under src/main/resources/db/natflix.sql  
Import natflix.sql into your local mySqlworkbench then you can run the application.(the images are placed inside src/main/resources/static)  
You may need to add you root password in application properties.

Front end repository clone and open in 
In VSC editor open the path where the file is located  for frontend
npm install ( in VSC) then npm start.

Same time open the code for backend which is provided in this repository and download and open in IntellJ and run the application.
the jar file also included in the target  folder. currently running with IntellJ run version. to run from jar file .Type mvn clean package install then jar file will be created inside target folder.
 To run the Jar file in commandprompt(cmd) using java -jar (filename).jar  
 in my case java -jar demo-0.0.1-SNAPSHOT.jar
( pls check the port are mentioned in both proxy in frontend-- package.json file and also in application.properties in resource folder in backend.
The complete application run in http:localhost:3000

## Docker 
I faced so many issues is it with Mac or installation i faced so many issues i tried with other team members and my docker either stuck or show some error. I have added a detailed note in the Project Management document how i did and what i faced and i added notes to the reviewer .

## Details/Plan
A document for Project Management about all set up and runing and outcome , screenshots and also diagrams for more understanding is provided . https://1drv.ms/w/s!Amn1Ate5iEpjfljuqPzm5GuWO-Q?e=8dFPli This is a project of making a moke of Netflix.
