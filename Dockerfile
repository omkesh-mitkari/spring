FROM openjdk:8-jdk-alpine
ADD target/s1adapter-0.0.1-SNAPSHOT.jar img1.jar
EXPOSE 8087
ENTRYPOINT ["java","-jar","img1.jar"]