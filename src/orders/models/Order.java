package orders.models;

import cart.models.Cart;
import cart.models.CartProduct;
import payments.models.PaymentMethod;

public class Order {
    private int orderId;
    private String specialInstructions;
    private Cart cart;
    private String deliveryAddress;
    private String billingAddress;
    private PaymentMethod payment;

    public Order(Cart cart,int orderId, String deliveryAddress, String billingAddress, PaymentMethod payment, String specialInstructions) {
        this.cart = cart;
        this.orderId = orderId;
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

    @Override
    public String toString() {
        return "Order{" +
                "deliveryAddress='" + deliveryAddress + '\'' +
                ", orderId=" + orderId +
                ", specialInstructions='" + specialInstructions + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", payment=" + payment +
                ", cart=" + cart +
                '}';
    }
}
