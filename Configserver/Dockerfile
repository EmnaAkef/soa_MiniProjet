#Start with a base image containing Java runtime
FROM eclipse-temurin:21-jdk
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="emna.com"
# Add the application's jar to the image
COPY target/Configserver-0.0.1-SNAPSHOT.jar Configserver-0.0.1-SNAPSHOT.jar
# execute the application
ENTRYPOINT ["java", "-jar", "Configserver-0.0.1-SNAPSHOT.jar"]

EXPOSE 9999