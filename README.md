BUILD:
./mvnw clean package -DskipTests -Pprod


RUN:
java -jar rest-1.0-SNAPSHOT.jar