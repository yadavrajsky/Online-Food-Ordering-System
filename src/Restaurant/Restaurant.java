package Restaurant;

import java.time.LocalTime;
import java.util.HashMap;

public class Restaurant {
    private String name;
    private String location;
    private boolean isDeactivated;
    private HashMap<String, LocalTime> openingAndClosingTimings;
    private boolean ValetParking;

    public Restaurant(String name, String location, boolean valetParking) {
        isDeactivated = false;
        openingAndClosingTimings = new HashMap<>();
        this.name = name;
        this.location = location;
        ValetParking = valetParking;
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

    public HashMap<String, LocalTime> getOpeningAndClosingTimings() {
        return openingAndClosingTimings;
    }

    public void setOpeningAndClosingTimings(HashMap<String, LocalTime> openingAndClosingTimings) {
        this.openingAndClosingTimings = openingAndClosingTimings;
    }

    public boolean isValetParking() {
        return ValetParking;
    }

    public void setValetParking(boolean valetParking) {
        ValetParking = valetParking;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", isDeactivated=" + isDeactivated +
                ", openingAndClosingTimings=" + openingAndClosingTimings +
                ", ValetParking=" + ValetParking +
                '}';
    }
}
