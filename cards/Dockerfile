# Start with a base image containing Java runtime
FROM amazoncorretto:17

# Add the application's to the image
COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT [ "java", "-jar", "cards-0.0.1-SNAPSHOT.jar" ]