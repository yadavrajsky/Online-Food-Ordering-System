package admin.models;

public class MenuItem {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
