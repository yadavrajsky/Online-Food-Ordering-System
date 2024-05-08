package admin.models;

import java.time.LocalTime;
import java.util.HashMap;

import repository.MenuItemManager;

public class Restaurant {
    private long id;
    private String name;
    private String location;
    private boolean isDeactivated;
    HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings;
    private boolean valetParking;
    public MenuItemManager menuItemManager;

    public Restaurant(long id, String name, String location, boolean isDeactivated,
            HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings, boolean valetParking) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.isDeactivated = isDeactivated;
        this.openingAndClosingTimings = openingAndClosingTimings;
        this.valetParking = valetParking;
        this.menuItemManager = new MenuItemManager();
    }

    public long getId() {
        return id;
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
                "\nId='" + id + '\'' +
                "\nname='" + name + '\'' +
                "\nlocation='" + location + '\'' +
                "\nisDeactivated=" + isDeactivated +
                "\nopeningAndClosingTimings=" + openingAndClosingTimings +
                "\nValetParking=" + valetParking +
                "\nMenu=" + menuItemManager +
                '}';
    }
}
