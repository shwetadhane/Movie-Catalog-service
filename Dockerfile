FROM openjdk:11
EXPOSE 8080
ADD target/Movie-Catalog-service-0.0.1-SNAPSHOT.jar Movie-Catalog-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Movie-Catalog-service-0.0.1-SNAPSHOT.jar"]