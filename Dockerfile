FROM openjdk:21-jdk

# Set the working directory
WORKDIR /app

# Copy all files and force permission fixes
COPY . /app
RUN chmod +x /app/gradlew

# Cache Gradle dependencies by running Gradle tasks
RUN ./gradlew --no-daemon dependencies

# Build the application
RUN ./gradlew --no-daemon build

# Expose the application port
EXPOSE 8080

# Set the entry point for the container
CMD ["java", "-jar", "build/libs/ServerReferences-all.jar"]