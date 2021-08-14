FROM openjdk:11
EXPOSE 8081
ADD target/spring-docker-demo.jar docker-spring-docker-demo.jar
ENTRYPOINT ["java", "-jar", "docker-spring-docker-demo.jar"]