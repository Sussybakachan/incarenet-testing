FROM maven:3.8.5-openjdk-17

COPY . .

RUN mvn clean package

ENTRYPOINT ["java", "-jar", "/target/sdx-testing-projects-1.0-SNAPSHOT.jar"]