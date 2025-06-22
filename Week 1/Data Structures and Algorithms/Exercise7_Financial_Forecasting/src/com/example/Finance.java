package com.example;

import java.util.Scanner;

public class Finance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Present Value : ");
		double pValue = sc.nextDouble();

		System.out.println("Enter the Growth Rate : ");
		double gRate = sc.nextDouble();

		System.out.println("Enter the Periods : ");
		double periods = sc.nextDouble();

		double fValue = calculateFutureValue(pValue, gRate, periods);
		System.out.println("The future value after " + periods + " periods is : " + fValue);
	}

	// Recursive method
	public static double calculateFutureValue(double presentValue, double growthRate, double periods) {
		if (periods == 0) return presentValue; // Base case
		return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
	}
}
