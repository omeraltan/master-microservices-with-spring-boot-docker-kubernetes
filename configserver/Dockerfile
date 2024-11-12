# Start with a base image containing Java runtime
FROM amazoncorretto:17

# Add the application's jar to the container
COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar

# Expose the application port
EXPOSE 8071

# Execute the application
ENTRYPOINT [ "java", "-jar", "configserver-0.0.1-SNAPSHOT.jar" ]
