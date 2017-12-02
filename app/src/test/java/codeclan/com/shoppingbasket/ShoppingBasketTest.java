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
        item = new Item(30.00, "record", 0001);
    }

    @Test
    public void shoppingBasketStartsEmpty() {
        assertEquals(0, shoppingBasket.countItems());
    }

    @Test
    public void testCanAddItemToShoppingBasket() {
        shoppingBasket.addItem(item);
        shoppingBasket.addItem(item);
        assertEquals(2, shoppingBasket.countItems());
    }

    @Test
    public void testCanRemoveItem() {
        shoppingBasket.addItem(item);
        shoppingBasket.removeItem(item);
        assertEquals(0, shoppingBasket.countItems());
    }

    @Test
    public void testCanEmptyBasket() {
        shoppingBasket.addItem(item);
        shoppingBasket.addItem(item);
        shoppingBasket.addItem(item);
        shoppingBasket.addItem(item);
        shoppingBasket.emptyBasket();
        assertEquals(0, shoppingBasket.countItems());
    }
}
