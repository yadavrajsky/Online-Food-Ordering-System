package cart.models;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartProduct> products;
    private String customerId;

    public Cart(String customerId) {
        this.customerId = customerId;
        this.products = new ArrayList<>();
    }

    public void addProduct(CartProduct product) {
        products.add(product);
    }

    public ArrayList<CartProduct> getProducts() {
        return products;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void removeProduct(int index) {
        products.remove(index);
    }

}
