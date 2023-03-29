FROM adoptopenjdk/openjdk11:alpine-slim
RUN mkdir /apps
WORKDIR /apps
COPY target/bk-pipeline-test-0.0.1-SNAPSHOT.jar /apps
CMD ["java", "-jar", "bk-pipeline-test-0.0.1-SNAPSHOT.jar"]
