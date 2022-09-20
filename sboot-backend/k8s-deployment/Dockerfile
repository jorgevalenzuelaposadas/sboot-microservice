FROM adoptopenjdk:11-jre-hotspot 
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} sboot-backend-1.0.0.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/sboot-backend-1.0.0.jar"]
