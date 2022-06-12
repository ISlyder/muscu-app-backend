# Project
This project is the backend of my muscu-app made in Java using spring boot and hibernate

## Run the app

You first need a postgres database.
- create a .env file in the docker repository (use the .env-example if needed)
- run the ``docker-compose up`` command to start a postgres database and adminer

If you didn't modify the docker-compose file :
- database will be running on 5432 port
- adminer will be running on 8081 port

### Use the adminer
If you want to see your data you can go on [localhost:8081](http://localhost:8081) 
and connect to your database using your environment variables (variables from your .env file)

### First run
When running the app for the first time some data are going to be added in the database.

I used Flyway for the data migration. You can find the migration scripts in the resources/db/migration repository.

All scripts are executed the first time you run the app. To re-execute them just clean the database volume.