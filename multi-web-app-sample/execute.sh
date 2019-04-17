mvn clean install -DskipTests
cd facade/
mvn clean install -DskipTests
cd ../app-two
mvn clean install -DskipTests
cd ../app-one
mvn clean install -DskipTests
java -jar target/app-one-1.0.0-executable-ark.jar

