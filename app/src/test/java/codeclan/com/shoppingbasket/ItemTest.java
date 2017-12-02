package codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 01/12/2017.
 */

public class ItemTest {
    Item item;

    @Before
    public void before() {
        item = new Item(30.00, "record", 0001);
    }

    @Test
    public void canGetPrice() {
        assertEquals(30.00, item.getPrice());
    }

    @Test
    public void canGetName() {
        assertEquals("record", item.getName());
    }

    @Test
    public void canGetBarcode() {
        assertEquals(0001, item.getBarcode());
    }
}
