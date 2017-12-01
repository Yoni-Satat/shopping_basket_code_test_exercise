package codeclan.com.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 01/12/2017.
 */

public class ShoppingBasket {
    private ArrayList<Item> items;
    Item item;

    public ShoppingBasket() {
        this.items = new ArrayList<>();
    }

    public int countItems() {
        return items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
