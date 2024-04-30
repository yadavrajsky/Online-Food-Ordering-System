package models;

import java.util.HashMap;
import java.time.LocalTime;

public class FineDiningRestaurant extends Restaurant {
    MenuItem menuITems;
    boolean takeAway;
    boolean delivery;
    boolean dineIn;

    public FineDiningRestaurant(String name,
            String location,
            boolean isDeactivated,
            HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings,
            boolean valetParking, boolean takeAway,
            boolean delivery,
            boolean dineIn) {
        super(name, location, isDeactivated, openingAndClosingTimings, valetParking);
    }
}
