FROM openjdk:11-jdk-buster
#ARG JAR_FILE=target/*.jar
#Comment
ENV JAVA_TOOL_OPTIONS=-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
