FROM openjdk:8-jdk-alpine 
MAINTAINER Fabio Alvaro <fabio.alvaro@gmail.com>
VOLUME /tmp 
ADD target/*.war app.war 
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.war" ]
