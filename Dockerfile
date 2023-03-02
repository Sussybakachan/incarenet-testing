FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /testrunner

COPY . .

#COPY src .

#COPY pom.xml .

#next time running will use cache in target directory
RUN --mount=type=cache,target=C:\Users\dboiko\.m2 mvn clean install

FROM openjdk:17-jdk-alpine

COPY --from=build /testrunner/target .

ENTRYPOINT ["java", "-jar", "build-jar-inside-docker-1.jar"]