FROM gcr.io/distroless/java:8
ADD ./target/assignment*.jar app.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","/app.jar"]