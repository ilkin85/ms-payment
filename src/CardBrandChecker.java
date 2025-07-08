package src;

import java.util.Scanner;

public class CardBrandChecker {
    public static void checkCardBrand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card number (16 digits): ");
        String cardNumber = scanner.nextLine().trim();

        if (cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            System.out.println("Invalid card number. Must be 16 digits.");
            return;
        }

        char firstDigit = cardNumber.charAt(0);
        switch (firstDigit) {
            case '4':
                System.out.println("Card brand: VISA");
                break;
            case '5':
            case '6':
                System.out.println("Card brand: MASTERCARD");
                break;
            default:
                System.out.println("Unknown card brand.");
        }
    }
}
