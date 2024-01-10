FROM openjdk:19

WORKDIR /app

COPY target/Project_Microservice_2-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "Project_Microservice_2-0.0.1-SNAPSHOT.jar"]