FROM openjdk:8
ADD target/gk-hotel-booking-1.0-SNAPSHOT.jar gk-hotel-booking-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "gk-hotel-booking-1.0-SNAPSHOT.jar"]