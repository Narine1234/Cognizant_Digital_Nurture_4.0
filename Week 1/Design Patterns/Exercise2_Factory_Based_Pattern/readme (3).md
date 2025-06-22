# 🏭 Factory Pattern Example

This Java project demonstrates the **Factory Design Pattern**. It defines an interface for creating objects but lets subclasses decide which class to instantiate.

## 📄 Structure

- `Document` (interface): common abstraction
- `PdfDocument`, `WordDocument`, `ExcelDocument`: concrete implementations
- `DocumentFactory` (interface): abstract factory
- `PdfFactory`, `WordFactory`, `ExcelFactory`: concrete factories
- `FactoryTest`: client code

## 🧪 Sample Output

```
Opening PDF Document.
Opening Word Document.
Opening Excel Document.
```

## 🚀 How It Works

1. Each factory creates a specific document type.
2. The client uses the factory without knowing the exact class being instantiated.

## 🛠️ How to Run

1. Save all files:

   - `Document.java`
   - `PdfDocument.java`, `WordDocument.java`, `ExcelDocument.java`
   - `DocumentFactory.java`
   - `PdfFactory.java`, `WordFactory.java`, `ExcelFactory.java`
   - `FactoryTest.java`

2. Compile and run:

```bash
javac *.java
java FactoryTest
```

## ✅ Benefits

- Loose coupling between client and object creation
- Scalable: easy to introduce new document types
- Follows SOLID principles (Open/Closed, Dependency Inversion)

