# springboot-boiler-plate

Spring boot webservice boiler plate with docker.

Having maven and docker installed follow the steps bellow:

Clone the project run inside the folder project `$ mvn clean install docker:build`, to use `docker:build` you will need to have [docker plugin for maven](https://github.com/spotify/docker-maven-plugin).

After building the app and the docker image you can start your container running `$ docker run -d -p 8081:8081 --name boiler-plate notype/boiler-plate` in your shell.
