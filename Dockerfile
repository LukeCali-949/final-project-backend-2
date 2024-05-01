FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/final-project-backend-2-0.0.1-SNAPSHOT.jar final-project-backend-2.jar
ENTRYPOINT ["java", "-jar", "final-project-backend-2.jar"]