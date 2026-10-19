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

        double yearlyRate = annualInteresetRateAsPercent / 100;
        double monthlyRate = yearlyRate / 12;
        int numberOfPayments = loanYears * 12;

        double growth = Math.pow(1 + monthlyRate, numberOfPayments);
        double monthlyPay = principal * (monthlyRate * growth) / (growth - 1);
        double interest = (monthlyPay * numberOfPayments) - principal;

    }
}
