FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /src
COPY . .
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /src/target/*.jar app.jar

EXPOSE 8443

ENTRYPOINT ["java","-jar", "app.jar"]