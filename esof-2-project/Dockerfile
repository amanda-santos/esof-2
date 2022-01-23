FROM java:8
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
VOLUME /tmp
ADD target/esof-2-project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]