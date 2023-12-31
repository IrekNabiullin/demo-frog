FROM alpine:3.16.0

VOLUME /tmp
EXPOSE 8081
RUN apk add --no-cache java-cacerts openjdk17-jdk

COPY build/libs/demo-frog.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
