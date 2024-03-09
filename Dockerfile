FROM openjdk:17
WORKDIR /var/app
COPY target/*.jar /var/app/my-rest-api.jar
ENTRYPOINT ["java","-jar","/var/app/my-rest-api.jar"]
EXPOSE 8080
