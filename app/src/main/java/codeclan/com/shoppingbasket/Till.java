package codeclan.com.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 01/12/2017.
 */

public class Till {
    ShoppingBasket shoppingBasket = new ShoppingBasket();

    public Till() {

    }


    public double calculateTotal() {
        double total = 0.00;
        for (Item i : shoppingBasket.getItems()) {
            total += i.getPrice();
        }
        return total;
    }


}
