FROM maven:3.8.5-openjdk-17

COPY . .

RUN mvn clean package

CMD ["java", "-jar", "/target/sdx-testing-projects-1.0-SNAPSHOT.jar"]