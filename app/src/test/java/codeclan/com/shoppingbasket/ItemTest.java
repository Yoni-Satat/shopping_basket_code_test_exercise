package codeclan.com.shoppingbasket;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 01/12/2017.
 */

public class ItemTest {
    Item item;

    @Test
    public void canGetPrice() {
        item = new Item(30.00);
        assertEquals(30.00, item.getPrice());
    }
}
