# Get Java 17 image
FROM openjdk:17

# Copy the builded .jar file into docker
COPY /build/libs/* /studentserver

# Run the application
ENTRYPOINT ["java","-jar","/studentserver.jar"]

# Expose the port that your application will run on
EXPOSE 8080