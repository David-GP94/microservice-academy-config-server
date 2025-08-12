FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/microservice-academy-config-server-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8890
ENTRYPOINT ["java", "-jar", "app.jar"]