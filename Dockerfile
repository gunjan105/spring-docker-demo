FROM openjdk:11
EXPOSE 8081
ADD target/example-0.0.1-SNAPSHOT.jar docker-spring-docker-demo.jar
ENTRYPOINT exec java -jar /docker-spring-docker-demo.jar