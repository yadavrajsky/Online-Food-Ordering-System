package payments.models;

import java.util.Scanner;

public class CardPaymentMethod implements PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private String cardHolderName;

    public CardPaymentMethod(String cardNumber, String expiryDate, String cvv, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public boolean processPayment(double amount) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the OTP sent to your registered mobile number (ending in xxxx):");
            int otp = sc.nextInt(); // Reading OTP entered by the user
            // backend verification)
            if (verifyOTP(otp)) {
                System.out.println("Payment successful!\n" + "₹" + amount + " deducted from your bank account.");
                return true;
            } else {
                System.out.println("Invalid OTP entered. Payment failed.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("An error occurred during payment processing. Please try again.");
            return false;
        } finally {
            sc.close(); 
        }
    }

    // Placeholder method for OTP verification
    private boolean verifyOTP(int otp) {
        // for demo it is always true
        return true;
    }
}
