package Restaurant;

import java.time.LocalTime;
import java.util.HashMap;

public class Restaurant {
    private String name;
    private String location;
    private boolean isDeactivated;
    HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings;
    private boolean valetParking;

    public Restaurant(String name, String location, boolean isDeactivated,
            HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings, boolean valetParking) {
        this.name = name;
        this.location = location;
        this.isDeactivated = isDeactivated;
        this.openingAndClosingTimings = openingAndClosingTimings;
        this.valetParking = valetParking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isDeactivated() {
        return isDeactivated;
    }

    public void setDeactivated(boolean deactivated) {
        isDeactivated = deactivated;
    }

    public HashMap<String, HashMap<String, LocalTime>> getOpeningAndClosingTimings() {
        return openingAndClosingTimings;
    }

    public void setOpeningAndClosingTimings(HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings) {
        this.openingAndClosingTimings = openingAndClosingTimings;
    }

    public boolean isValetParking() {
        return valetParking;
    }

    public void setValetParking(boolean valetParking) {
        this.valetParking = valetParking;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", isDeactivated=" + isDeactivated +
                ", openingAndClosingTimings=" + openingAndClosingTimings +
                ", ValetParking=" + valetParking +
                '}';
    }
}
