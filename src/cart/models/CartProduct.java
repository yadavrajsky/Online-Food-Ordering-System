package cart.models;

import admin.models.MenuItem;

public class CartProduct {
        private String restaurantId;
    private int quantity;
    private MenuItem menuItem;

    public CartProduct(String restaurantId, int quantity, MenuItem menuItem) {
        this.restaurantId = restaurantId;
        this.quantity = quantity;
        this.menuItem = menuItem;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public int getQuantity() {
        return quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return this.quantity * this.menuItem.getPrice();
    }
}
