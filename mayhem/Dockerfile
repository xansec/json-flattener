FROM maven:latest as builder

RUN mkdir /json-flattener
WORKDIR /json-flattener
COPY . .

RUN mvn compile

#FROM cifuzz/jazzer:latest

#COPY --from=builder /json-flattener /json-flattener
