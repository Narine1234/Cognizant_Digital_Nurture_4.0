# 📈 Finance Future Value Calculator

This Java program calculates the **Future Value (FV)** of an investment using **recursion**, based on the Present Value (PV), Growth Rate, and Number of Periods.

## 🧼 Formula

The future value is computed recursively using:

```
FV = PV × (1 + r)^n
```

Where:

- `PV` is the present value
- `r` is the growth rate per period (in decimal form)
- `n` is the number of periods

## 🚀 How It Works

The program:

1. Accepts user input for Present Value, Growth Rate, and Periods.
2. Uses a recursive method to calculate the future value.
3. Displays the result.

## 📋 Sample Input & Output

```
Enter the Present Value :
1000
Enter the Growth Rate :
0.10
Enter the Periods :
3
The future value after 3.0 periods is : 1331.0000000000002
```

Explanation:

- Period 1: 1000 × 1.10 = 1100
- Period 2: 1100 × 1.10 = 1210
- Period 3: 1210 × 1.10 = 1331

## 🛠️ How to Run

1. Save the code in a file named `Finance.java`
2. Compile and run:

```bash
javac Finance.java
java Finance
```

## ✅ Features

- Recursive calculation
- User-friendly input prompts
- Simple and clear output

## 📌 Note

This version uses recursion. For larger periods, an iterative version is preferred for efficiency.

