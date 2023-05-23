FROM openjdk:13
COPY .   app
WORKDIR  app
RUN mkdir /app/data
RUN mkdir /app/data/batch
RUN ["javac","Student_Statistics.java"]
ENTRYPOINT ["java","Student_Statistics"]


