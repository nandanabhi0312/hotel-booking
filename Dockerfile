FROM openjdk:8
ADD target/GK-Booking-0.0.1-SNAPSHOT.jar GK-Booking-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "GK-Booking-0.0.1-SNAPSHOT.jar"]