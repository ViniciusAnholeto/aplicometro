FROM eclipse-temurin:21-jdk-alpine AS build

WORKDIR /app
COPY .mvn .mvn
COPY mvnw .
RUN chmod +x mvnw
COPY pom.xml .
RUN ./mvnw dependency:go-offline -B
COPY src src
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dserver.port=${PORT:-8080}","-jar","/app.jar"]
