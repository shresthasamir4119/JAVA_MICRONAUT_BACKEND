FROM openjdk:14-alpine
COPY build/libs/todo-app-*-all.jar todo-app.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "todo-app.jar"]