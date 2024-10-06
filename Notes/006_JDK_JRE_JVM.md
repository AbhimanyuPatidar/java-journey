# Differences between JDK, JRE and JVM

### Java Development Kit (JDK)
1. Kit that provides the environment to develop and execute java applications
2. Contains *dev tools* to develop the program and *JRE* to execute the program

### Java Runtime Environment (JRE)
1. End users that only want to run the program, need only JRE
2. JRE contains:
    - Deployment technologies
    - User Interface toolkits (Abstract Window Toolkit{AWT}, Swing, Java 2D, etc)
    - Integration Libraries (Java Database Connectivity {JDBC}, Java Naming and Directory Interface {JNDI}, etc)
    - Other base libraries (I/O, Java Native Interface {JNI},  Java for XML Processing {XML JAXP}, etc)
    - Lang and util base libs (Concurrency utilities, Collections, Java Archive {JAR}, Logging, Regular Expressions, etc)
    - JVM

### Java Virtual Machine
1. A *specification* where the working of Java Virtual Machine is specified. But implementation provider is independent to choose the algorithm. Its implementation has been provided by Sun and other companies.
2. An *implementation* is a computer program that meets the requirements of the JVM specification.
3. *Runtime Instance* Whenever you write a java command on the command prompt to run the java class, an instance of JVM is created.
4. Runtime engine or Virtual Machine that actually calls the main method of the program inside the environment provided by JRE
5. **Responsible for loading, linking and initialization**.