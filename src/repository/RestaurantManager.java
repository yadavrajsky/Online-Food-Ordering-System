package repository;

import java.util.HashSet;

import models.Restaurant;

public class RestaurantManager {
    HashSet<Restaurant> restaurants;

    public RestaurantManager() {
        this.restaurants = new HashSet<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }
    public  HashSet<Restaurant> getRestaurants()
    {
        return restaurants;
    }
    public void displayRestaurants()
    {
        for(Restaurant restaurant: restaurants)
        {
            System.out.println("Name: "+restaurant.getName());
            System.out.println("Location: "+restaurant.getLocation());
            System.out.println("Is Deactivated: "+restaurant.isDeactivated());
            System.out.println("Valet Parking: "+restaurant.isValetParking());
            System.out.println("Opening and Closing Timings: ");
            restaurant.getOpeningAndClosingTimings().forEach((key, value) -> {
                System.out.println(key + " : " + value.get("Opening") + " - " + value.get("Closing"));
            });
            System.out.println("-------------------------------------------------");
        }
    }
}
