package src;

import java.util.Scanner;

public class PaymentConverter {
    private static final double USD_TO_AZN = 1.7;

    public static void convertPayments() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many payments? ");
        int count = scanner.nextInt();

        int converted = 0;
        int skipped = 0;
        double totalUsd = 0.0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter amount in USD (" + i + "): ");
            double amount = scanner.nextDouble();

            if (amount < 0) {
                skipped++;
                continue;
            }

            converted++;
            totalUsd += amount;
        }

        double totalAzn = totalUsd * USD_TO_AZN;

        System.out.println("\nPayments converted: " + converted);
        System.out.println("Payments skipped: " + skipped);
        System.out.println("Total USD: " + totalUsd);
        System.out.println("Total AZN: " + totalAzn);
    }
}
