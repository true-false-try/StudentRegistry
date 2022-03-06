# Student Registry project

## General info
This is Spring Boot based registry project.
The module depends on the following external resources:
- Mongodb - as a main datasource

All of them are available for local use with **docker-compose**

## Preparation
- Install docker and docker-compose for your OS
- Add mongodb, kafka, elasticsearch docker hosts into /etc/hosts as follows:   
  `127.0.0.1 mongo mongo-express`

## Build process

- Install JDK 17
- Build the module (skip tests by adding `-DskipTests` flag):  
  `./mvnw clean package`
- Create dedicated Docker network (needs to be created ony once):  
  `docker network create ${your_name_network}`

## Run process
### Locally
- `docker-compose -f docker-compose.yml up`

## Exception
- If you have: **Cannot connect to the Docker daemon at unix:///var/run/docker.sock. Is the docker daemon running? (Details: [13] Permission denied)**, you should use `sudo chmod 666 /var/run/docker.sock`


