coding-challenge-seitenbau-cgonzalez
====================================
#Compile
```
mvn clean compile assembly:single
```

#Execute
```
java -jar -Dconfig.file=application.conf coding-challenge-seitenbau-cgonzalez-jar-with-dependencies.jar
```

##application.conf
- set (-Dconfig.file=application.conf)
- default
```scala
instructions: [
  "LOAD A, 1",
        "SETM 0, A",
        "LOADM A,0",
        "OR A, 8",
        "PRINT A",
        "XOR A, 42",
        "PRINT A",
        "XOR A, 42",
        "PRINT A",
        "LOAD C, 10",
        "PRINT C",
        "DEC C",
        "CMP C, 0",
        "JNE -3",
        "STOP"
]
```