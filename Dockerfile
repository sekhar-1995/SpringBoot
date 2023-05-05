FROM openjdk:11
ADD target/SpringBoot-0.0.1-SNAPSHOT.jar subham_addressbook.jar
ENTRYPOINT ["java", "-jar", "/subham_addressbook.jar"]