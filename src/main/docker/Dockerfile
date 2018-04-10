FROM openjdk:8-jdk-alpine

RUN  mkdir /application

COPY boiler-plate-0.0.1-SNAPSHOT.jar /application/boiler-plate.jar

EXPOSE 8081

WORKDIR /application

CMD ["java", "-jar", "boiler-plate.jar"]% 