FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend__a_b_c_d_a_p_p__44 backend__a_b_c_d_a_p_p__44
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend__a_b_c_d_a_p_p__44/target/_a_b_c_d_a_p_p_-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar _a_b_c_d_a_p_p_-0.0.1-SNAPSHOT.jar"]