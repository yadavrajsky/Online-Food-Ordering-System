package payments.models;

public abstract interface PaymentMethod {

    public abstract boolean processPayment(double amount);
}
