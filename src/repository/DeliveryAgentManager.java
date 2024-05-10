package repository;

import admin.models.MenuItem;
import cart.models.Cart;
import cart.models.CartProduct;
import delivery.models.DeliveryAgent;
import delivery.models.OrderDeliveryStatus;
import orders.models.Order;
import payments.models.CreditCardPayment;
import payments.models.PaymentMethod;
import user.models.User;

public class DeliveryAgentManager {
    public static void main(String[] args) {
        System.out.println("Delivery Agent");
        // Create User   name email,phone,address,password 
        User user = new User("John Doe","john@email.com","123456789","Delhi","password");
        // Create Delivery Agent
                //Demo Menu Item
        MenuItem menuItem1 = new MenuItem("Burger", 10.0);
        MenuItem menuItem2 = new MenuItem("Pizza", 20.0);
        MenuItem menuItem3 = new MenuItem("Pasta", 15.0);
        Cart cart = new Cart("1");
        CartProduct cartProduct1 = new CartProduct("1234",2,menuItem1);
        CartProduct cartProduct2 = new CartProduct("1234",3,menuItem2);
        CartProduct cartProduct3 = new CartProduct("1254",5,menuItem3);
        cart.addProduct(cartProduct1);
        cart.addProduct(cartProduct2);
        cart.addProduct(cartProduct3);
        PaymentMethod paymentMethod = new CreditCardPayment("1234", "1234", "123", "12/23");
        Order order=new Order(cart, 1,"Delhi", "Delhi", paymentMethod, "No Special Instructions");
        DeliveryAgent deliveryAgent = new DeliveryAgent(1,user);
        OrderDeliveryStatus orderDeliveryStatus = new OrderDeliveryStatus(order, deliveryAgent);
        orderDeliveryStatus.pendingDelivery();
        orderDeliveryStatus.deliverOrder();
        System.out.println(orderDeliveryStatus.getStatus());

       
    }
}
