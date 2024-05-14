# Use an official Java runtime as the base image  
FROM openjdk:8-jdk-alpine  
  
# Set the working directory inside the container  
WORKDIR /app  
  
# Copy the source code into the container  
COPY src/main/java/harnessio/Calculator.java .  
  
# Compile the Java source code  
RUN javac /app/Calculator.java  
  
# Set the entrypoint to run the application  
ENTRYPOINT ["java", "-cp", "/app", "harnessio.Calculator"]  