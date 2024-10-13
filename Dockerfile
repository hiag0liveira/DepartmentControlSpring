# Estágio 1: Construção do JAR usando Maven
FROM maven:3.8.7-openjdk-17 AS build

# Define o diretório de trabalho no container
WORKDIR /app

# Copia o pom.xml e baixa dependências antecipadamente
COPY pom.xml ./
RUN mvn dependency:go-offline

# Copia todo o código-fonte para o container
COPY src ./src

# Compila e empacota a aplicação sem rodar os testes
RUN mvn clean package -DskipTests

# Estágio 2: Criação da imagem final leve
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho no container
WORKDIR /app

# Expondo a porta 8080 para a aplicação
EXPOSE 8080

# Copia o JAR gerado do estágio de build para a imagem final
COPY --from=build /app/target/demo-mvc-0.0.1-SNAPSHOT.jar app.jar

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
