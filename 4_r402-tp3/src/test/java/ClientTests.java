import ecommerce.Client;
import ecommerce.Multiset;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTests {

    Client client = new Client("prénom", "nom");
    Multiset<Object> cart = new Multiset<>();

    @Test
    void testGetShoppingCart() {
        assertEquals(cart, client.getShoppingCart());
    }

}
