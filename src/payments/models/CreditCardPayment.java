package payments.models;

public class CreditCardPayment extends CardPaymentMethod{
    public CreditCardPayment(String cardNumber, String expiryDate, String cvv, String cardHolderName) {
        super(cardNumber, expiryDate, cvv, cardHolderName);
    }
}
