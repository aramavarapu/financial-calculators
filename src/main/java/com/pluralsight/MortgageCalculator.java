package com.pluralsight;
import java.util.Scanner;
public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mortgage Calculator:");

        System.out.println("Enter the loan amount: $");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate as a percent: ");
        double annualInteresetRateAsPercent = scanner.nextDouble();

        System.out.print("Enter the loan length in years: ");
        int loanYears = scanner.nextInt();

        double annualIntereset = annualInteresetRateAsPercent / 100;

    }
}
