package Payments;

import java.util.Scanner;

public class DebitCardPayment implements PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public DebitCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
    @Override
    public boolean processPayment(double amount){
        System.out.println("Enter the otp sent to 923244xxxx:");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        System.out.println("Payment successful!\n"+"₹"+amount+" deducted from your bank account.");;
        return true;
    }
}
