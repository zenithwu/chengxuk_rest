BUILD:
./mvnw clean package -DskipTests


RUN:
java -Dspring.profiles.active=prod -jar rest-1.0-SNAPSHOT.jar