FROM maven:3-amazoncorretto-17 AS build
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN ["mvn", "-f", "pom.xml", "clean", "package", "-DskipTests"]

FROM amazoncorretto:17-alpine
COPY --from=build /workspace/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]