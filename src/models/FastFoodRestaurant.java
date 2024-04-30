package models;

import java.util.HashMap;
import java.time.LocalTime;

public class FastFoodRestaurant extends Restaurant {
    MenuItem menuITems;
    boolean takeAway;
    boolean delivery;
    boolean dineIn;

    public FastFoodRestaurant(String name,
            String location,
            boolean isDeactivated,
            HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings,
            boolean valetParking, boolean takeAway,
            boolean delivery,
            boolean dineIn) {
        super(name, location, isDeactivated, openingAndClosingTimings, valetParking);
        this.delivery = delivery;
        this.takeAway = takeAway;
        this.dineIn = dineIn;
    }
}
