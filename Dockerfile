FROM openjdk:11
EXPOSE 9091
ADD target/springboot-images-new.jar springboot-images-new.jar

ENTRYPOINT ["java","-jar","/springboot-images-new.jar"]