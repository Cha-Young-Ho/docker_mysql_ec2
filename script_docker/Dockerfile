FROM openjdk:11
EXPOSE ${SPRINGBOOt_PORT}
ADD ./build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","-Duser.timezone=Asia/Seoul","-jar","/app.jar"]
