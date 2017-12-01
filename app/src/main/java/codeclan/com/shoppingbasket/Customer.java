package codeclan.com.shoppingbasket;

/**
 * Created by user on 01/12/2017.
 */

public class Customer {
    private boolean loyaltyCard;

    public Customer(boolean loyaltyCard) {
        this.loyaltyCard = false;
    }

    public boolean isLoyal() {
        return loyaltyCard;
    }
}
