# Use an official Java runtime as the base image  
FROM openjdk:8-jdk-alpine  
  
# Copy the source code into the container  
COPY src/main/java/harnessio/Calculator.java /  
  
# Compile the Java source code  
RUN javac /Calculator.java  
  
# Set the entry point to run the Calculator application  
ENTRYPOINT ["java", "Calculator"]  