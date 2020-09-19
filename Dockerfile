FROM adoptopenjdk/openjdk11:jdk11u-alpine-nightly-slim

USER root

ARG USER=polopo
ARG GROUP=shampo

RUN addgroup -S ${GROUP} && adduser -S ${USER} -G ${GROUP}
      

COPY target/service.jar service.jar

USER polopo

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-jar", "service.jar"] 