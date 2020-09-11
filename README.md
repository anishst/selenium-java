# Selenium Java Projects 

## Pre-req

- mvn is setup on target machine; https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html


1. create a simple maven project by running below in cmd line ; 
    ```shell
    mvn archetype:generate -DgroupId=com.anish.app -DartifactId=selenium-java -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
    ```

2. test/Build commands
    - test ```mvn test``` - runs tests
    - build  ```mvn package```; this will create target folder with jar files

3. test the newly compiled and packaged JAR with the following command: ```java -cp target/selenium-java-1.0-SNAPSHOT.jar com.anish.app.App```; this will output 'Hello World!'

