package basicjava;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the employee:");
        String name = scanner.nextLine();

        System.out.println("Enter the annual income of the employee:");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Name: " + name);
        System.out.println("Income Tax: ₹" + tax);

        scanner.close();
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 250000) {
            // No tax for income up to ₹2,50,000
            tax = 0;
        } else if (income <= 500000) {
            // 10% of the income exceeding ₹2,50,000 for income between ₹2,50,001 to ₹5,00,000
            tax = (income - 250000) * 0.10;
        } else if (income <= 1000000) {
            // ₹30,000 + 20% of the amount exceeding ₹5,00,000 for income between ₹5,00,001 to ₹10,00,000
            tax = 30000 + (income - 500000) * 0.20;
        } else {
            // ₹50,000 + 30% of the amount exceeding ₹10,00,000 for income above ₹10,00,000
            tax = 50000 + (income - 1000000) * 0.30;
        }

        return tax;
    }
}