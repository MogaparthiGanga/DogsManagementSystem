FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests


FROM openjdk:17-ea-28-slim
COPY --from=build /target/DogsManagementSystem-0.0.1-SNAPSHOT.jar DogsManagementSystem.jar
CMD ["java", "-jar", "DogsManagementSystem.jar"]
