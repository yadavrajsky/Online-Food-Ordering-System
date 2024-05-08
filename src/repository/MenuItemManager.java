package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import admin.models.MenuItem;

public class MenuItemManager {
    private HashMap<String, List<MenuItem>> items;

    public MenuItemManager() {
        this.items = new HashMap<>();
    }

    // Add Menu as a whole
    public void addMenu(String key, List<MenuItem> items) {
        this.items.put(key, items);
    }

    // Add menu item in a menu
    public void addMenuItem(String key, String itemName, double price) {
        List<MenuItem> menuItems = this.items.get(key);
        menuItems.add(new MenuItem(itemName, price));
        this.items.put(key, menuItems);
    }

    // Update menu as whole
    public void updateMenu(String key, List<MenuItem> items) {
        addMenu(key, items);
    }

    // Update menu item in a menu
    public void updateItem(String menuType, int itemMenuKey, String itemName, double price) {
        List<MenuItem> menuItems = this.items.get(menuType);
        menuItems.get(itemMenuKey).setName(itemName);
        menuItems.get(itemMenuKey).setPrice(price);
        this.items.put(menuType, menuItems);
    }

    // Delete a menu
    public void deleteMenu(String key) {
        this.items.remove(key);
    }

    // // Delete a menu item from a menu
    // public void deleteItem(String key, String itemName) {
    // List<String> menuItems = this.items.get(key);
    // menuItems.remove(itemName);
    // this.items.put(key, menuItems);
    // }

    // display all menu types
    public void displayMenu() {
        int count = 1;
        for (String itemKey : items.keySet()) {
            System.out.println(count++ + ". " + itemKey);
        }
    }

    // Get Menu Types
    public List<String> getMenuTypes() {
        return new ArrayList<String>(items.keySet());
    }

    // Get Menu Items of a particular menu
    public List<MenuItem> getMenuItems(String key) {
        return items.get(key);
    }

    // display all menu items of a particular menu
    public void displayMenuItems(String key) {
        List<MenuItem> menuItems = items.get(key);
        int count = 1;
        for (MenuItem item : menuItems) {
            System.out.println(count++ + ". Item :  " + item.getName() + " Price : " + item.getPrice());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String key : items.keySet()) {
            sb.append(key).append(": ");
            List<MenuItem> menuItems = items.get(key);
            for (MenuItem item : menuItems) {
                sb.append("Item : ").append(item.getName()).append(", ");
                sb.append("Price : ").append(item.getPrice()).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length()); // Remove the last comma and space
            sb.append("\n");
        }
        return sb.toString();
    }
}
