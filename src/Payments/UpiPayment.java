package Payments;

import java.util.Scanner;

public class UpiPayment implements PaymentMethod {
        private String upiId;

        public UpiPayment(String upiId) {
            this.upiId = upiId;
        }

        @Override
        public boolean processPayment(double amount) {
            // Logic to process UPI payment
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 6-digit UPI pin:");
            scanner.nextInt();
            System.out.println("Payment successful!\n"+"₹"+amount+" deducted from your bank account.");
            return true; // Placeholder for successful payment
        }
}

