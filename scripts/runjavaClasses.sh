#!/bin/bash

# List of Java classes to execute
classes=(
 "techiearchive.lab.HelloWorld"
 "techiearchive.lab.Pyramide"
 "techiearchive.lab.ReverseString"
)

# Directory containing compiled classes
classpath="target/classes"

# Iterate over each class and execute it
for class in "${classes[@]}"; do
 echo "Running $class..."
 if java -cp $classpath "$class";
 then
   echo "Execution of $class failed"
   exit 1
 fi
done

echo "All classes executed successfully"
