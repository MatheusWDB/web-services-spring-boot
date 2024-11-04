# syntax = docker/dockerfile:1.2

FROM ubuntu:latest AS build

RUN apt-get update

RUN apt-get install openjdk-21-jdk -y

COPY . .

RUN  apt-get install maven -y

RUN --mount=type=secret,id=DB_PASS,dst=/etc/secrets/DB_PASS cat /etc/secrets/DB_PASS

RUN --mount=type=secret,id=DB_URL,dst=/etc/secrets/DB_URL cat /etc/secrets/DB_URL

RUN --mount=type=secret,id=DB_USER,dst=/etc/secrets/DB_USER cat /etc/secrets/DB_USER

RUN mvn clean install

FROM openjdk:21-jdk-slim

EXPOSE 8080

COPY --from=build /target/project-web-services-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar"]