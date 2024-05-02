package utility;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Random;

import models.FastFoodRestaurant;
import models.FineDiningRestaurant;
import models.Restaurant;

public class RandomRestaurantGenerator {
    private static String getRandomName() {
        String[] names = { "Bistro Hub", "Cafe Delight", "Sushi Corner", "Pizza Planet", "Taco Bell" };
        return names[new Random().nextInt(names.length)];
    }

    private static String getRandomLocation() {
        String[] locations = { "Downtown", "City Center", "North Hill", "East End", "Suburb" };
        return locations[new Random().nextInt(locations.length)];
    }

    private static HashMap<String, HashMap<String, LocalTime>> getRandomTimings() {
        HashMap<String, HashMap<String, LocalTime>> timings = new HashMap<>();
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        Random random = new Random();
        for (String day : days) {
            HashMap<String, LocalTime> dayTimings = new HashMap<>();
            int openHour = random.nextInt(6) + 6; // Opening hours between 6 to 12
            int closeHour = random.nextInt(6) + 18; // Closing hours between 18 to 24
            dayTimings.put("Opening", LocalTime.of(openHour, 0));
            dayTimings.put("Closing", LocalTime.of(closeHour, 0));
            timings.put(day, dayTimings);
        }
        return timings;
    }

    private static boolean getRandomBoolean() {
        return new Random().nextBoolean();
    }

    public static Restaurant generateRandomRestaurant() {
        Restaurant restaurant=null;
        Random random = new Random();
            long id = random.nextInt(10000);
            String name = getRandomName();
            String location = getRandomLocation();
            boolean isDeactivated = getRandomBoolean();
            HashMap<String, HashMap<String, LocalTime>> timings = getRandomTimings();
            boolean valetParking = getRandomBoolean();

            if (random.nextBoolean()) { // Randomly decide type of restaurant
                // Creating a FastFoodRestaurant
                boolean takeAway = getRandomBoolean();
                boolean delivery = getRandomBoolean();
                boolean dineIn = getRandomBoolean();
                restaurant = new FastFoodRestaurant(
                        id, name, location, isDeactivated, timings, valetParking, takeAway, delivery, dineIn);
            } else {
                // Creating a FineDiningRestaurant
                boolean reservations = getRandomBoolean();
                boolean privateRooms = getRandomBoolean();
                boolean sommelierService = getRandomBoolean();
                restaurant = new FineDiningRestaurant(
                        id, name, location, isDeactivated, timings, valetParking, reservations, privateRooms,
                        sommelierService);
            }
        return restaurant;
    }

}
