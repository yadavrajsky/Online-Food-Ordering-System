package repository;

import java.util.HashSet;

import admin.models.MenuItem;
import admin.models.Restaurant;
import admin.utility.RandomRestaurantGenerator;
import cart.models.Cart;
import cart.models.CartProduct;
import orders.models.Order;
import payments.models.CreditCardPayment;
import payments.models.PaymentMethod;

/**
 * Order
 */
public class OrderManager {

    public static void main(String[] args) {
        System.out.println("Order");
        // Create Restaurant 
        RestaurantManager restaurantManager = new RestaurantManager();
        restaurantManager.addRestaurant(RandomRestaurantGenerator.generateRandomRestaurant());
        restaurantManager.addRestaurant(RandomRestaurantGenerator.generateRandomRestaurant());
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
        order.placeOrder();

        


        
    }
}