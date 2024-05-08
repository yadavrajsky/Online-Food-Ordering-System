package payments.models;

import java.util.Scanner;

public class UPIPayment implements PaymentMethod {
    private String upiId;
    private String upiPin;
    private static final Scanner sc = new Scanner(System.in); // Shared scanner for user input

    public UPIPayment(String upiId, String upiPin) {
        this.upiId = upiId;
        this.upiPin = upiPin;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Please confirm your UPI ID: " + upiId);
        System.out.println("Enter your UPI PIN to proceed:");
        String enteredPin = sc.next();

        if (verifyUPICredentials(upiId, enteredPin)) {
            System.out.println("Payment successful!\n" + "₹" + amount
                    + " has been deducted from your bank account linked to UPI.");
            return true;
        } else {
            System.out.println("Invalid UPI PIN entered. Payment failed.");
            return false;
        }
    }

    private boolean verifyUPICredentials(String upiId, String pin) {
        // For demonstration purposes, assume the pin matches if it equals '1234'
        return "1234".equals(pin);
    }
}
