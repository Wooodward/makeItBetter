FROM openjdk:8-jdk-alpine
ADD maven/make-it-better-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongo/test", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]