# Start with a base image containing Java runtime
FROM amazoncorretto:17

# Add the application's jar to the container
COPY target/gatewayserver-0.0.1-SNAPSHOT.jar gatewayserver-0.0.1-SNAPSHOT.jar

# Expose the application port
EXPOSE 8070

# Execute the application
ENTRYPOINT [ "java", "-jar", "gatewayserver-0.0.1-SNAPSHOT.jar" ]
