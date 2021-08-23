FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} 4asoifoodapi.jar
ENTRYPOINT ["java","-jar","/4asoifoodapi.jar"]
EXPOSE 8026