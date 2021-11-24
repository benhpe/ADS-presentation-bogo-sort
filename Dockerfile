FROM gradle:7.1-jdk11
COPY . /src
WORKDIR /src
RUN ["./gradlew", "run"]