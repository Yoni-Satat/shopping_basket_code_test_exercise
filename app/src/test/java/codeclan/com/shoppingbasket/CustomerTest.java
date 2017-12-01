package codeclan.com.shoppingbasket;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/12/2017.
 */

public class CustomerTest {
    Customer customer;

    @Test
    public void isCustomerLoyal() {
        customer = new Customer(false);
        assertEquals(false, customer.isLoyal());
    }
}
