# Spring Webflux with Redis example

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This project is a exemple of simple Spring Webflux application with Redis.
	
## Technologies
Project is created with:
* JDK 11
* Gradle
* Spring Boot 2.2.9
* Redis
	
## Setup
To run this project, install jdk-11, docker, docker-compose and run:

```
$ docker-compose build
$ docker-compose up -d
$ ./gradlew bootRun

Access: http://localhost:8080/coffees 
```
