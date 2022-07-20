FROM openjdk:11
EXPOSE ${SPRINGBOOT_PORT}
ADD ./*.jar app.jar
ENTRYPOINT ["java","-jar","-Duser.timezone=Asia/Seoul","-jar","/app.jar"]