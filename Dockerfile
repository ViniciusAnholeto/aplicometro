# Etapa de build
FROM --platform=linux/amd64 eclipse-temurin:21-jdk-alpine AS build

WORKDIR /app

# Copia o wrapper do Maven e dá permissão de execução
COPY .mvn .mvn
COPY mvnw .
RUN chmod +x mvnw

# Copia o POM e baixa dependências (cache otimizado)
COPY pom.xml .
RUN ./mvnw dependency:go-offline -B

# Copia o código-fonte
COPY src src

# Compila a aplicação
RUN ./mvnw clean package -DskipTests

# Etapa de execução
FROM --platform=linux/amd64 eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copia o .jar da etapa de build
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta (a Render injeta via $PORT)
EXPOSE 8080

# Comando para rodar o .jar
ENTRYPOINT ["java", "-Dserver.port=${PORT:-8080}", "-jar", "/app/app.jar"]

