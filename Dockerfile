FROM openjdk:11-jdk-buster
#ARG JAR_FILE=target/*.jar
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
