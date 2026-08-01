FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/*.jar app.jar
COPY keystore.p12 keystore.p12

EXPOSE 8443

ENTRYPOINT ["java","-jar", "app.jar"]