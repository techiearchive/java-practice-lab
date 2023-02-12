# java-practice-lab
Practice codebase for core java logic

# Java online compiler
* https://www.tutorialspoint.com/online_java_compiler.php
* https://www.programiz.com/java-programming/online-compiler/
* https://www.w3schools.com/java/java_compiler.asp

# Generate java project archetype
mvn archetype:generate -DgroupId=techiearchive.lab -DartifactId=java-practice-lab -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

# Build and test the code
```
mvn clean package
```

# Run the jva code
```
java -cp target/classes techiearchive.lab.HelloWorld
```
