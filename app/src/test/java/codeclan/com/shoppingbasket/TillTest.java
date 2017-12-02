package codeclan.com.shoppingbasket;

import org.junit.Before;

/**
 * Created by user on 02/12/2017.
 */

public class TillTest {
    Item item;
    ShoppingBasket shoppingBasket;
    Customer customer;

    @Before
    public void before() {
        item = new Item(30.00, "Microwave", 0002);
    }
}
