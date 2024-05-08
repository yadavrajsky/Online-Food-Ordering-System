package admin.models;

import java.util.HashMap;
import java.time.LocalTime;

public class FineDiningRestaurant extends Restaurant {
    boolean takeAway;
    boolean delivery;
    boolean dineIn;

    public FineDiningRestaurant(long id,String name,
            String location,
            boolean isDeactivated,
            HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings,
            boolean valetParking, boolean takeAway,
            boolean delivery,
            boolean dineIn) {
        super(id,name, location, isDeactivated, openingAndClosingTimings, valetParking);
        this.takeAway=takeAway;
        this.delivery=delivery;
        this.dineIn=dineIn;

    }
}
