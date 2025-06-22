# 🧵 Singleton Pattern Example

This example demonstrates the **Singleton Design Pattern** in Java. The Singleton pattern ensures a class has only one instance and provides a global point of access to it.

## 🔁 Pattern Structure

- **Private constructor** prevents external instantiation.
- **Static instance** holds the only object of the class.
- **Public static method** returns the unique instance.

## 🧪 Behavior Demonstration

```java
Logger obj1 = Logger.getInstance();
Logger obj2 = Logger.getInstance();

if (obj1 == obj2)
    System.out.println("Singleton Pattern: All objects refer to same reference.");
else
    System.out.println("Not a Singleton pattern.");
```

## 🛠️ How to Run

1. Save the files as `Logger.java` and `Test.java`
2. Compile and run:

```bash
javac Logger.java Test.java
java Test
```

## 📌 Output

```
Singleton Pattern: All objects refer to same reference.
```

## ✅ Features

- Ensures only one instance of a class
- Provides controlled access to the instance
- Useful in logging, configuration, and shared resource management

