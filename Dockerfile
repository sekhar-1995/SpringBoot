FROM openjdk:17
EXPOSE 8080
ADD target/*.jar SpringBoot.jar
ENTRYPOINT ["java", "-jar", "/SpringBoot.jar"]
