package codeclan.com.shoppingbasket;

/**
 * Created by user on 01/12/2017.
 */

public class Item {
    private double price;
    private String name;
    private int barcode;
    
    public Item(double price, String name, int barcode) {
        this.price = price;
        this.name = name;
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getBarcode() {
        return barcode;
    }
}
