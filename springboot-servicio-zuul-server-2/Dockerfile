FROM openjdk:12
VOLUME /tmp
EXPOSE 8090
ADD ./target/springboot-servicio-zuul-server-2-0.0.1-SNAPSHOT.jar zuul-server-2.jar
ENTRYPOINT ["java","-jar","/zuul-server-2.jar"]
