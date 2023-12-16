package MiniTeste2;

public class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " " + price;
    }


}
