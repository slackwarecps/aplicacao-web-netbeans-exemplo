FROM openjdk:8-jdk-alpine 
MAINTAINER Fabio Alvaro <fabio.alvaro@gmail.com>
MAINTAINER Antonio Fernandes <antonio.fernandes@assertivasolucoes.com.br> 
VOLUME /tmp 
ADD target/*.war app.war 
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.war" ]
