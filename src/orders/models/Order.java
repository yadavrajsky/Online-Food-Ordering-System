package orders.models;

import cart.models.Cart;
import cart.models.CartProduct;
import payments.models.PaymentMethod;

class Order {
    private String specialInstructions;
    private Cart cart;
    private String deliveryAddress;
    private String billingAddress;
    private PaymentMethod payment;

    public Order(Cart cart, String deliveryAddress, String billingAddress, PaymentMethod payment, String specialInstructions) {
        this.cart = cart;
        this.deliveryAddress = deliveryAddress;
        this.billingAddress = billingAddress;
        this.payment = payment;
        this.specialInstructions = specialInstructions;
    }

    public void placeOrder() {
        payment.processPayment(calculateTotalPrice());
        System.out.println("Order placed with delivery to: " + deliveryAddress);
        // Additional implementation as needed.
    }

    private double calculateTotalPrice() {
        double total = 0;
        for (CartProduct cp : cart.getProducts()) {
            total += cp.getMenuItem().getPrice() * cp.getQuantity();
        }
        return total;
    }
}
