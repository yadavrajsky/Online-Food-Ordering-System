import repository.RestaurantManager;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import admin.models.FastFoodRestaurant;
import admin.models.FineDiningRestaurant;
import admin.models.MenuItem;
import admin.models.Restaurant;
import admin.utility.RandomRestaurantGenerator;

public class App {
    private static String getWeekDayName(int dayOfWeek) {
        String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        return weekDays[dayOfWeek];
    }

    public static HashMap<String, HashMap<String, LocalTime>> getDefaultOpeningAndClosingTimings() {
        HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings = new HashMap<>();
        for (int i = 0; i < 7; i++) {
            HashMap<String, LocalTime> timings = new HashMap<>();
            String weekDayName = getWeekDayName(i);
            // Use predefined LocalTime values for testing
            LocalTime openingTime = LocalTime.of(9, 0); // 9:00 AM
            LocalTime closingTime = LocalTime.of(17, 0); // 5:00 PM
            timings.put("Opening", openingTime);
            timings.put("Closing", closingTime);
            openingAndClosingTimings.put(weekDayName, timings);
        }
        return openingAndClosingTimings;
    }

    public static void main(String[] args) throws Exception {
        RestaurantManager restaurantManager = new RestaurantManager();
        boolean flag = false;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("");
            int option = 0;
            do {
                System.out.println("1. Add Restaurant");
                System.out.println("2. Update Restaurant");
                System.out.println("3. Deactivate Restaurant");
                System.out.println("4. Add MenuItems");
                System.out.println("5. Update MenuItems");
                System.out.println("6. Activation Restaurant");
                System.out.println("7. Display Restaurant");
                System.out.println("8. Exit");
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        // Add Restaurant
                        // System.out.println("Id : ");
                        // long id = sc.nextLong();
                        // System.out.println("Name : ");
                        // String name = sc.nextLine();
                        // System.out.println("Location : ");
                        // String location = sc.nextLine();
                        // System.out.println("Opening and closing timings : ");
                        // HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings = new
                        // HashMap<>();
                        // HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings =
                        // getDefaultOpeningAndClosingTimings();
                        // for (int i = 0; i < 7; i++) {
                        // HashMap<String, LocalTime> timings = new HashMap<>();
                        // String weekDayName = getWeekDayName(i);
                        // System.out.println("Enter the opening time for " + weekDayName + ": ");
                        // LocalTime openingTime = LocalTime.parse(sc.nextLine());
                        // System.out.println("Enter the closing time for " + weekDayName + ": ");
                        // LocalTime closingTime = LocalTime.parse(sc.nextLine());
                        // timings.put("Opening", openingTime);
                        // timings.put("Closing", closingTime);
                        // openingAndClosingTimings.put(weekDayName, timings);
                        // }
                        // System.out.println("Does it support valet parking ?(yes/no) ");
                        // boolean valetParking = false;
                        // String statusValetPariking = sc.nextLine();
                        // if (statusValetPariking.equals("yes"))
                        // valetParking = true;
                        // boolean isDeactivated = false;
                        // System.out.println("Do you want to keep this restaurant deactivated by
                        // default? (yes/no)");
                        // String statusIsDeactivated = sc.nextLine();
                        // if (statusIsDeactivated.equals("yes"))
                        // isDeactivated = true;
                        // System.out.println("Which type of restaurant it is :");
                        // System.out.println("1. FastFoodRestaurant");
                        // System.out.println("2. FineDiningRestaurant");
                        // int restaurantType = sc.nextInt();
                        // Restaurant restaurant = null;
                        // switch (restaurantType) {
                        // case 1:
                        // boolean takeAway = false;
                        // boolean delivery = false;
                        // boolean dineIn = false;
                        // System.out.println("Does it support Takeaway : (yes/no)");
                        // String stausTakeAway = sc.nextLine();
                        // if (stausTakeAway.equals("yes"))
                        // takeAway = true;
                        // System.out.println("Does it support Delivery : (yes/no)");
                        // String stausDelivery = sc.nextLine();
                        // if (stausDelivery.equals("yes"))
                        // delivery = true;
                        // System.out.println("Does it support DineIn : (yes/no)");
                        // String stausDineIn = sc.nextLine();
                        // if (stausDineIn.equals("yes"))
                        // dineIn = true;
                        // restaurant = new FastFoodRestaurant(id, name, location, isDeactivated,
                        // openingAndClosingTimings,
                        // valetParking, takeAway, delivery, dineIn);
                        // restaurantManager.addRestaurant(restaurant);
                        // System.out.println("Restaurant Added Successfully");
                        // break;
                        // case 2:
                        // restaurant = new FineDiningRestaurant(id, name, location, isDeactivated,
                        // openingAndClosingTimings, valetParking, isDeactivated, valetParking,
                        // isDeactivated);
                        // restaurantManager.addRestaurant(restaurant);
                        // System.out.println("------------------".repeat(3));
                        // System.out.println("Restaurant Added Successfully");
                        // System.out.println("------------------".repeat(3));
                        // break;
                        // default:
                        // System.out.println("Invalid Option");
                        // break;
                        // }
                        restaurantManager.addRestaurant(RandomRestaurantGenerator.generateRandomRestaurant());
                        System.out.println("------------------".repeat(3));
                        System.out.println("Restaurant Added Successfully");
                        System.out.println("------------------".repeat(3));
                        break;
                    case 2:
                        // Update Restaurant
                        System.out.println("Enter the ID of the restaurant you want to Update:");
                        long idToUpdate = sc.nextLong();
                        flag = false;
                        for (Restaurant updateRestaurant : restaurantManager.getRestaurants()) {
                            if (updateRestaurant.getId() == idToUpdate) {
                                int options = 0;
                                do {
                                    System.out.println("1. Update Name");
                                    System.out.println("2. Update Location");
                                    System.out.println("3. Update valet parking");
                                    System.out.println("4. Exit");
                                    options = sc.nextInt();
                                    sc.nextLine(); // Consume the remaining newline character
                                    switch (options) {
                                        case 1:
                                            System.out.println("Enter new restaurant name:");
                                            String newName = sc.nextLine();
                                            updateRestaurant.setName(newName);
                                            System.out.println("------------------".repeat(3));
                                            System.out.println("Name Updated Successfully");
                                            System.out.println("------------------".repeat(3));
                                            break;
                                        case 2:
                                            System.out.println("Enter new restaurant location:");
                                            String newLoc = sc.nextLine();
                                            updateRestaurant.setLocation(newLoc);
                                            System.out.println("------------------".repeat(3));
                                            System.out.println("Location Updated Successfully");
                                            System.out.println("------------------".repeat(3));
                                            break;
                                        case 3:
                                            System.out.println("Does it support valet parking ?(yes/no)");
                                            String statusValetPariking1 = sc.nextLine();
                                            if (statusValetPariking1.equals("yes"))
                                                updateRestaurant.setValetParking(true);
                                            System.out.println("------------------".repeat(3));
                                            System.out.println("Parking Updated Successfully");
                                            System.out.println("------------------".repeat(3));
                                            break;
                                        case 4:
                                            System.out.println("------------------".repeat(3));
                                            System.out.println("Restaurant Updated Successfully");
                                            System.out.println("------------------".repeat(3));
                                            options = -1;
                                            break;
                                    }
                                } while (options != -1);
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("------------------".repeat(3));
                            System.out.println("Restaurant with given id not found!");
                            System.out.println("------------------".repeat(3));
                        }
                        break;
                    // Deactivation
                    case 3:
                        System.out.println("Enter the ID of the retaurant you want to Deactivate:");
                        long idToDeactivate = sc.nextLong();
                        flag = false;
                        for (Restaurant restaurantObj : restaurantManager.getRestaurants()) {
                            if (restaurantObj.getId() == idToDeactivate) {
                                restaurantObj.setDeactivated(true);
                                System.out.println("------------------".repeat(3));
                                System.out.println("Restaurant Deactivated Successfully");
                                System.out.println("------------------".repeat(3));
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("------------------".repeat(3));
                            System.out.println("Restaurant with given id not found!");
                            System.out.println("------------------".repeat(3));
                        }
                        break;
                    case 4:
                        // Add menu
                        restaurantManager.displayRestaurants();
                        System.out.println("Choose the restaurant you want to add menu to:");
                        int restaurantIndex = sc.nextInt();
                        sc.nextLine();
                        ArrayList<Restaurant> restaurantsList = new ArrayList<>(restaurantManager.getRestaurants());
                        Restaurant restaurant = restaurantsList.get(restaurantIndex - 1);
                        System.out.println("Add Menu Type:");
                        String menuType = sc.nextLine();
                        String menuItemName = "";
                        double price = 0;
                        List<MenuItem> menuItems = new ArrayList<>();
                        System.out.println("Enter -1 to exit : ");
                        do {

                            System.out.println("Enter Menu Item Name :");
                            menuItemName = sc.nextLine();
                            if (!menuItemName.equals("-1")) {
                                System.out.println("Enter Price :");
                                price = sc.nextDouble();
                                sc.nextLine();
                                menuItems.add(new MenuItem(menuItemName, price));
                            }
                        } while (!menuItemName.equals("-1"));
                        restaurant.menuItemManager.addMenu(menuType, menuItems);
                        break;
                    case 5:
                        // Update Menu
                        restaurantManager.displayRestaurants();
                        System.out.println("Choose the restaurant you want to update menu :");
                        restaurantIndex = sc.nextInt();
                        sc.nextLine();
                        restaurantsList = new ArrayList<>(restaurantManager.getRestaurants());
                        Restaurant restaurantForUpdatingMenu = restaurantsList.get(restaurantIndex - 1);
                        System.out.println("Choose Menu Type:");
                        restaurantForUpdatingMenu.menuItemManager.displayMenu();
                        List<String> menuTypes = restaurantForUpdatingMenu.menuItemManager.getMenuTypes();
                        int menuTypeIndex = sc.nextInt();
                        sc.nextLine();
                        menuType = menuTypes.get(menuTypeIndex - 1);
                        System.out.println("1. Do you want to update whole menu:");
                        System.out.println("2. Do you want to update a items in particular menu:");
                        int options = sc.nextInt();
                        switch (options) {
                            case 1:
                                menuItems = new ArrayList<>();
                                System.out.println("Enter list of items or -1 to exit : ");
                                do {
                                    System.out.println("Enter Menu Item Name :");
                                    menuItemName = sc.nextLine();
                                    if (menuItemName.equals("-1")) {
                                        System.out.println("Enter Price :");
                                        price = sc.nextDouble();
                                        sc.nextLine();
                                        menuItems.add(new MenuItem(menuItemName, price));
                                    }
                                } while (!menuItemName.equals("-1"));
                                restaurantForUpdatingMenu.menuItemManager.updateMenu(menuType, menuItems);
                                break;
                            case 2:
                                System.out.println("Choose menu Item you want to update:");
                                restaurantForUpdatingMenu.menuItemManager.displayMenuItems(menuType);
                                int menuItemIndex = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter new Menu Item Name :");
                                menuItemName = sc.nextLine();
                                System.out.println("Enter new Price :");
                                price = sc.nextDouble();
                                restaurantForUpdatingMenu.menuItemManager.updateItem(menuType, menuItemIndex,
                                        menuItemName, price);
                                break;
                            default:
                                System.out.println("Invalid Option");
                                break;
                        }
                        break;

                    case 6:
                        System.out.println("Enter the ID of the retaurant you want to Activate:");
                        long idToActivate = sc.nextLong();
                        boolean flag2 = false;
                        for (Restaurant restaurantObj : restaurantManager.getRestaurants()) {
                            if (restaurantObj.getId() == idToActivate) {
                                restaurantObj.setDeactivated(false);
                                System.out.println("Restaurant Activated Successfully");
                                flag2 = true;
                            }
                        }
                        if (!flag2) {
                            System.out.println("Restaurant with given id not found!");
                        }
                        break;

                    case 7:
                        restaurantManager.displayRestaurants();
                        break;
                    case 8:
                        System.out.println("Thank you visit again! ");
                        option = -1;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
            } while (option != -1);
        }
    }
}

