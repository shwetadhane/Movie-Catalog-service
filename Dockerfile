FROM openjdk:11
EXPOSE 8761
ADD target/movie-catalog-service.jar movie-catalog-service.jar

ENTRYPOINT ["java","-jar","/movie-catalog-service.jar"]