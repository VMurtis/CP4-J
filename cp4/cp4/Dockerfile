# Usar OpenJDK 21 como base
FROM openjdk:21-jdk-slim

# Definir diretório de trabalho
WORKDIR /app

# Copiar o wrapper do Maven
COPY mvnw .
COPY .mvn .mvn

# Dar permissão de execução ao wrapper
RUN chmod +x mvnw

# Copiar arquivos do projeto
COPY pom.xml .
COPY src src

# Construir a aplicação
RUN ./mvnw clean package -DskipTests

# Expor a porta 8080
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "target/cp4-0.0.1-SNAPSHOT.jar"]
