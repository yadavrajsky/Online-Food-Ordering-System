import models.FastFoodRestaurant;
import models.FineDiningRestaurant;
import models.Restaurant;
import repository.RestaurantManager;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    private static String getWeekDayName(int dayOfWeek) {
        String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        return weekDays[dayOfWeek];
    }

    public static void main(String[] args) throws Exception {
        RestaurantManager restaurantManager = new RestaurantManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int option = 100;
    do {
            System.out.println("1. Add Restaurant");
            System.out.println("2. Update Restaurant");
            System.out.println("3. Deactivate Restaurant");
            System.out.println("4. Add MenuItems");
            System.out.println("5. Update MenuItems");
            System.out.println("6. Activation Restaurant");
            System.out.println("7. Display Restaurant");
            System.out.println("7. Exit");
            switch (option) {
                case 1:
                    // Add Restaurant
                    System.out.println("Name : ");
                    String name = sc.next();
                    System.out.println("Location : ");
                    String location = sc.next();
                    System.out.println("Opening and closing timings : ");
                    HashMap<String, HashMap<String, LocalTime>> openingAndClosingTimings = new HashMap<>();
                    for (int i = 0; i < 7; i++) {
                        HashMap<String, LocalTime> timings = new HashMap<>();
                        String weekDayName = getWeekDayName(i);
                        System.out.println("Enter the opening time for " + weekDayName + ": ");
                        LocalTime openingTime = LocalTime.parse(sc.next());
                        System.out.println("Enter the closing time for " + weekDayName + ": ");
                        LocalTime closingTime = LocalTime.parse(sc.next());

                        timings.put("Opening", openingTime);
                        timings.put("Closing", closingTime);
                        openingAndClosingTimings.put(weekDayName, timings);

                    }
                    System.out.println("Does it support valet parking ?(yes/no)  ");
                    boolean valetParking = false;
                    String statusValetPariking = sc.next();
                    if (statusValetPariking.equals("yes"))
                        valetParking = true;
                    boolean isDeactivated = false;
                    System.out.println("Do you want to keep this restaurant deactivated by default? (yes/no)");
                    String statusIsDeactivated = sc.next();
                    if (statusIsDeactivated.equals("yes"))
                        isDeactivated = true;
                    System.out.println("Which type of restaurant it is :");
                    System.out.println("1. FastFoodRestaurant");
                    System.out.println("2. FineDiningRestaurant");
                    int restaurantType = sc.nextInt();
                    Restaurant restaurant = null;
                    switch (restaurantType) {
                        case 1:
                            boolean takeAway = false;
                            boolean delivery = false;
                            boolean dineIn = false;
                            System.out.println("Does it support Takeaway : (yes/no)");
                            String stausTakeAway = sc.next();
                            if (stausTakeAway.equals("yes"))
                                takeAway = true;
                            System.out.println("Does it support Delivery : (yes/no)");
                            String stausDelivery = sc.next();
                            if (stausDelivery.equals("yes"))
                                delivery = true;
                            System.out.println("Does it support DineIn : (yes/no)");
                            String stausDineIn = sc.next();
                            if (stausDineIn.equals("yes"))
                                dineIn = true;
                            restaurant = new FastFoodRestaurant(name, location, isDeactivated, openingAndClosingTimings,
                                    valetParking, takeAway, delivery, dineIn);
                            restaurantManager.addRestaurant(restaurant);
                            System.out.println("Restaurant Added Successfully");
                            break;
                        case 2:
                            restaurant = new FineDiningRestaurant(name, location, isDeactivated,
                                    openingAndClosingTimings, valetParking, isDeactivated, valetParking, isDeactivated);
                            restaurantManager.addRestaurant(restaurant);
                            System.out.println("Restaurant Added Successfully");
                            break;
                        default:
                            System.out.println("Invalid Option");
                            break;
                    }
                // case 2:
                
                case 3:
                    
                    System.out.println("Enter the name of the retaurant you want to Deactivate:");
                    String nameToDeactivate = sc.next();
                    // Restaurant deactivatedReataurant = null;
                    for(Restaurant restaurantObj: restaurantManager.getRestaurants()){

                        if(restaurantObj.getName().equals(nameToDeactivate)){
                            restaurantObj.setDeactivated(true);
                            System.out.println("Restaurant Deactivated Successfully");
                    }

                    break;

                    // deactivatedRestaurant.setDeactivated(true);
                    // System.out.println("Restaurant is now deactivated!");:
                    // // Add menu Items

                    // System.out.println("Add Cuisine Type:");
                    // String cuisineType = sc.next();
                    // List<String> items = new List<>();
                    // int flag = 1;
                    // do{
                    // System.out.println("Add Cuisin Item:");
                    // String item = sc.next();
                    // items.add(item);
                    // System.out.println("Do you want to add more: 1 for Yes and 0 for NO:");
                    // flag = sc.nextInt();

                    // }while(flag == 1);

                    // break;
                    // case 5:
                    // System.out.println("Update Cuisine Type:");
                    // String cuisineType = sc.next();
                    // int flagMenu = 0;
                    // System.out.println("Do you want to update whole menu: 1 for Yes and 0 for
                    // NO:");
                    // flagMenu = sc.nextInt();
                    // if(flagMenu == 0){
                    // System.out.println("Update Cuisin Item:");
                    // String item = sc.next();
                    // }
                    // else{
                    // List<String> items = new List<>();
                    // int flagItem = 1;
                    // do{
                    // System.out.println("Update Cuisin Item:");
                    // String item = sc.next();
                    // items.add(item);
                    // System.out.println("Do you want to update more: 1 for Yes and 0 for NO:");
                    // flagItem = sc.nextInt();

                    // }while(flagItem == 1);
                    // }
                    // break;

                    }
                    default:
                    System.out.println("Invalid Option");
                    break;
                    
            }
            option=sc.nextInt();
        }    while (option != -1);
    }
}