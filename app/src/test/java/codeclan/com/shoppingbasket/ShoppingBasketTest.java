package codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.DoubleStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/12/2017.
 */

public class ShoppingBasketTest {
    Item item;
    ShoppingBasket shoppingBasket;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        item = new Item(30.00, "record");
    }

    @Test
    public void shoppingBasketStartsEmpty() {
        assertEquals(0, shoppingBasket.countItems());
    }

    @Test
    public void testCanAddItemToShoppingBasket() {
        shoppingBasket.addItem();
        assertEquals(1, shoppingBasket.countItems());
    }
}
