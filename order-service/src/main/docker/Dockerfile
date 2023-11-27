FROM openjdk:11
VOLUME /tmp

ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar /tmp/opentelemetry-javaagent.jar

ENV JAVA_TOOL_OPTIONS "-javaagent:/tmp/opentelemetry-javaagent.jar -Dotel.exporter.otlp.protocol=grpc -Dotel.traces.exporter=logging,otlp -Dotel.metrics.exporter=logging,otlp -Dotel.resource.attributes=service.name=order-service -Dotel.exporter.otlp.endpoint=\"http://opentelemetrycollector:4317\""

ADD order-service-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-javaagent:/tmp/opentelemetry-javaagent.jar","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
