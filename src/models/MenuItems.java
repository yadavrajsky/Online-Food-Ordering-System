package models;

import java.util.HashMap;
import java.util.List;

public class MenuItems {
    private HashMap<String, List<String>> items;

    public MenuItems() {
        this.items = new HashMap<>();
    }

    // Add Menu as a whole
    public void addMenu(String key, List<String> items) {
        this.items.put(key, items);
    }

    // Add menu item in a menu
    public void addMenuItem(String key, String itemName) {
        List<String> menuItems = this.items.get(key);
        menuItems.add(itemName);
        this.items.put(key, menuItems);
    }

    // Update menu as whole
    public void updateMenu(String key, List<String> items) {
        this.items.put(key, items);
    }

    // Update menu item in a menu
    public void updateItem(String key, String itemName) {
        List<String> menuItems = this.items.get(key);
        int index = menuItems.indexOf(itemName);
        menuItems.set(index, itemName);
        this.items.put(key, menuItems);
    }

    // Delete a menu
    public void deleteMenu(String key) {
        this.items.remove(key);
    }

    // Delete a menu item from a menu
    public void deleteItem(String key, String itemName) {
        List<String> menuItems = this.items.get(key);
        menuItems.remove(itemName);
        this.items.put(key, menuItems);
    }
}
