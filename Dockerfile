FROM openjdk:17-jdk-alpine

COPY target/practice1.jar practice1.jar

EXPOSE 9090

ENTRYPOINT ["java","-jar","practice1.jar"]
