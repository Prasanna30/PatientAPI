FROM adoptopenjdk/openjdk8:ubi
RUN mkdir /opt/app
COPY target/patient-api-0.0.1-SNAPSHOT.jar /opt/app/japp.jar
CMD ["java", "-jar", "/opt/app/japp.jar"]