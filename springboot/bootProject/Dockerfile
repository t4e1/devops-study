FROM openjdk:17-alpine
COPY build/libs/*.jar app.jar

#터미널에서의 java -jar app.jar와 같다.
ENTRYPOINT ["java", "-jar", "app.jar"]
