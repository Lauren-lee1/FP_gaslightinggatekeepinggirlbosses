package v7;
public class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void effect(Character target) {

    }

    public String getName() {
        return name.toLowerCase().trim();
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name;
    }
}
