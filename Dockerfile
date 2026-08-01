FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/*.jar app.jar
COPY keystore.12 keystore.p12

EXPOSE 8443

ENTRYPOINT ["java","-jar", "app.jar"]