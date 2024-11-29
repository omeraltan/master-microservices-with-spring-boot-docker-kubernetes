# Start with a base image containing Java runtime
FROM amazoncorretto:17

# Add the application's jar to the container
COPY target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver-0.0.1-SNAPSHOT.jar

# Expose the application port
EXPOSE 8070

# Execute the application
ENTRYPOINT [ "java", "-jar", "eurekaserver-0.0.1-SNAPSHOT.jar" ]
