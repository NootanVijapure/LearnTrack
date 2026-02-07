1. What is JDK, JRE, and JVM

JDK (Java Development Kit)
JDK is a complete package used by developers to create Java programs.
It contains tools like the Java compiler (javac), debugger, and also includes JRE.
In simple words: JDK = tools to develop and run Java programs.

JRE (Java Runtime Environment)
JRE provides the environment needed to run Java applications.
It contains JVM and libraries required to execute Java programs.
In simple words: JRE = environment to run Java programs.

JVM (Java Virtual Machine)
JVM is the engine that runs Java programs.
It converts compiled Java code into machine-level instructions so the computer can understand and execute it.
Each operating system has its own JVM implementation.

2. What is Bytecode

When a Java program is compiled using javac, it does not become machine code directly.
Instead, it is converted into an intermediate format called bytecode (.class file).

This bytecode is platform-independent and can run on any system that has a JVM.
The JVM reads this bytecode and converts it into machine code during execution.

3. What does “Write Once, Run Anywhere” mean

Java follows the principle of Write Once, Run Anywhere (WORA).
This means a developer writes the Java code only once, compiles it into bytecode, and that same bytecode can run on any operating system such as Windows, Linux, or macOS.

This is possible because the JVM acts as a bridge between the Java program and the operating system.
As long as a system has a compatible JVM installed, the same Java program can run without modification.


JDK → Development tools (compiler + JRE)

JRE → Runtime environment (JVM + libraries)

JVM → Executes bytecode


JDK builds, JRE runs, JVM executes.

