# GraphQL with Spring Boot

A very simple project to show how to get started with [GraphQL](https://graphql.org/learn/) using Spring Boot.

Once started, you can access the graphiql interface using the url: http://localhost:8080/graphiql

This project supports the following mutations and queries.

## Mutation

```graphql
mutation {
  createVehicle(type: "car", modelCode: "XYZ0192", brandName:"XYZ", launchDate: "2018-09-19")
  {
    id
  }
}
```

Result:

```json
{
  "data": {
    "createVehicle": {
      "id": "1"
    }
  }
}
```

## Query list of vehicles

```graphql
query {
  vehicles(count: 1)
  {
    id,
    type,
    modelCode
  }
}
```

Result:

```json
{
  "data": {
    "vehicles": [
      {
        "id": "1",
        "type": "car",
        "modelCode": "XYZ0192"
      }
    ]
  }
}
```

## Query by id

```graphql
query {
  vehicle(id: 1)
  {
    type,
    modelCode,
    launchDate
  }
}
```

Result:

```json
{
  "data": {
    "vehicle": {
      "type": "car",
      "modelCode": "XYZ0192",
      "launchDate": "2018-09-19"
    }
  }
}
```

## Docker

### Building the docker image

```bash
$ ./gradlew build docker
```


### To run using docker

```bash
docker run -p 8080:8080 -t henrygbrown/graphql-demo
```

### See running docker containers

```bash
$ docker ps
```

which should give output such as:

```bash
CONTAINER ID        IMAGE                      COMMAND                  CREATED              STATUS              PORTS                    NAMES
e71b0b316921        henrygbrown/graphql-demo   "java -cp app:app/li…"   About a minute ago   Up About a minute   0.0.0.0:4000->8080/tcp   admiring_johnson
```

### Stopping running container

```bash
$ docker stop e71b0b316921
```

### Deleting image

```bash
$ docker rm e71b0b316921
```

### Running with prod profile

```bash
$ docker run -e "SPRING_PROFILES_ACTIVE=prod" -p 8080:8080 -t henrygbrown/graphql-demo
```

For more options, see: https://spring.io/guides/gs/spring-boot-docker/



