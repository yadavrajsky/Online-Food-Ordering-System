package repository;

import admin.models.MenuItem;
import admin.models.Restaurant;

/**
 * Order
 */
public class OrderManager {

    public static void main(String[] args) {
        System.out.println("Order");
        // Create Restaurant 
        RestaurantManager restaurantManager = new RestaurantManager();
        restaurantManager.addRestaurant(new Restaurant(1, "KFC", "Bangalore", false, null, true));
        //Demo Menu Item
        MenuItem menuItem1 = new MenuItem("Burger", 10.0);
        MenuItem menuItem2 = new MenuItem("Pizza", 20.0);
        MenuItem menuItem3 = new MenuItem("Pasta", 15.0);
        


        
    }
}