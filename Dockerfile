FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /builddir

#xxx don't copy the whole resouces only log4j2.properties is actually needed though
#with a change the pom.xml needs to be changed too
COPY resources/log4j2.properties resources/log4j2.properties

COPY src src

COPY pom.xml .

#next time running will use cache in target directory
RUN --mount=type=cache,target=/root/.m2 mvn package

FROM openjdk:17-jdk-alpine

COPY resources resources

COPY --from=build /builddir/target target

ENTRYPOINT ["java", "-jar", "target/sdx-testing-projects.jar"]