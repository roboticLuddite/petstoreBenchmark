FROM alpine:3.3

EXPOSE 8080

RUN apk --update add openjdk8-jre

COPY ./target/ribenchmark.jar /usr/src/bin/ribenchmark.jar

CMD ["/usr/bin/java","-jar","/usr/src/bin/ribenchmark.jar"]
