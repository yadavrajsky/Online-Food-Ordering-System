package admin.models;

import java.util.HashMap;
import java.time.LocalTime;

public class FastFoodRestaurant extends Restaurant {
    boolean takeAway;
    boolean delivery;
    boolean dineIn;

    public FastFoodRestaurant(long id, String name,
            String location,
            boolean isDeactivated,
            HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings,
            boolean valetParking, boolean takeAway,
            boolean delivery,
            boolean dineIn) {
        super(id, name, location, isDeactivated, openingAndClosingTimings, valetParking);
        this.delivery = delivery;
        this.takeAway = takeAway;
        this.dineIn = dineIn;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "takeAway: " + takeAway + "\n" +
                "delivery: " + delivery + "\n" +
                "dineIn: " + dineIn;
    }
}
