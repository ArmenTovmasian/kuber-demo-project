FROM openjdk:17-alpine
WORKDIR /kuber-app
COPY target/kuber-demo-project-0.0.1-SHAPSHOT.jar kuber-demo-project.jar
ENTRYPOINT ["java","-jar","/kuber-demo-project.jar"]