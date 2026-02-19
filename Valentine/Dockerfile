# Use official Maven image to build
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY Valentine/pom.xml .
COPY Valentine/src ./src
RUN mvn clean package -DskipTests

# Use lightweight Java image to run
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 10000
ENTRYPOINT ["java","-jar","app.jar"]
