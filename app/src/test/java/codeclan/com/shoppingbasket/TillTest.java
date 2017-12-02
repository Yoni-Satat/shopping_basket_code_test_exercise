package codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 02/12/2017.
 */

public class TillTest {
    Till till;
    Item toothpaste;
    Item shirt;
    Item vitamins;
    ShoppingBasket shoppingBasket;
    Customer customer1;
    Customer customer2;

    @Before
    public void before() {
        till = new Till();
        toothpaste = new Item(3.00, "Toothpaste", 0001);
        shirt = new Item(5.00, "T shirt", 0002);
        vitamins = new Item(8.00, "Vitamin C tablets", 0003);
        shoppingBasket = new ShoppingBasket();
        customer1 = new Customer(false);
        customer2 = new Customer(true);
    }

    @Test
    public void canCalculateTotalAmountOfBasket() {
        till.shoppingBasket.addItem(shirt);
        till.shoppingBasket.addItem(vitamins);
        till.shoppingBasket.addItem(toothpaste);
        assertEquals(16.00, till.calculateTotal());
    }

    @Test
    public void testBuyOneGetOneFree() {
        till.shoppingBasket.addItem(shirt);
        till.shoppingBasket.addItem(vitamins);
        till.shoppingBasket.addItem(toothpaste);
        till.shoppingBasket.addItem(toothpaste);
        assertEquals(16.00, till.getOneFree());
    }
}
