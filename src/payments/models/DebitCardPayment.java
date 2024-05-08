package payments.models;

public class DebitCardPayment extends CardPaymentMethod{
    public DebitCardPayment(String cardNumber, String expiryDate, String cvv, String cardHolderName) {
        super(cardNumber, expiryDate, cvv, cardHolderName);
    }
}
