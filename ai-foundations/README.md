# ai-foundations (TIID)

Base Maven project for the entire semester (Fundamentals of Artificial Intelligence).

## Requirements
- Java JDK 11 (LTS)
- Apache Maven 3.8+

## Project structure
- src/main/java -> production code
- src/test/java -> unit tests (JUnit 5)

## How to run
Compile:
mvn clean compile

Run:
mvn exec:java

Test:
mvn test

## Suggested packages for the course
Create these over the semester (do not create new projects, extend this one):
- mx.utma.tiid.aifoundations.rules
- mx.utma.tiid.aifoundations.logic
- mx.utma.tiid.aifoundations.vision
- mx.utma.tiid.aifoundations.ml
- mx.utma.tiid.aifoundations.ethics
