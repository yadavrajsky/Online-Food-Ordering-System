package repository;

import java.util.HashSet;

import admin.models.Restaurant;

public class RestaurantManager {
    HashSet<Restaurant> restaurants;

    public RestaurantManager() {
        this.restaurants = new HashSet<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void updateRestaurant(Restaurant restaurant) {

    }

    public HashSet<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void displayRestaurants() {
        int count = 1;
        System.out.println("---------------------------------");
        for (Restaurant restaurant : restaurants) {
            System.out.println(count++ + ".");
            System.out.println(restaurant);
        }
        System.out.println("---------------------------------");
    }
}
