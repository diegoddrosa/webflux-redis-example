FROM adoptopenjdk/openjdk11:latest
ADD build/libs/redis-example-0.0.1-SNAPSHOT.jar redis-example-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /redis-example-0.0.1-SNAPSHOT.jar'
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dfile.encoding=UTF8", "-Duser.timezone=America/Sao_Paulo", "-jar", "/redis-example-0.0.1-SNAPSHOT.jar"]