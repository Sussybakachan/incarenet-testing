FROM maven:3.8.5-openjdk-17

WORKDIR /testrunner

COPY . .

RUN mvn clean package

ENTRYPOINT ["java", "-jar", "/target/build-jar-inside-docker-1.jar"]