import ecommerce.Client;
import ecommerce.Multiset;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultisetTests {

    @Test
    void testAddObjectIntoMultiset() {
        Multiset<Object> cart = new Multiset<>();
        Multiset<Object> cart2 = new Multiset<>();

        assertEquals(cart2.add("1"), cart.add("1"));
    }

    @Test
    void testRemoveOneElementMultiset() {
        Multiset<Object> cart = new Multiset<>();
        Multiset<Object> cart2 = new Multiset<>();

        cart.add("1");
        cart.remove("1");
        assertEquals(cart2, cart);
    }

    @Test
    void testRemoveMultipleElementMultiset() {
        Multiset<Object> cart = new Multiset<>();
        Multiset<Object> cart2 = new Multiset<>();

        cart.add("1");
        cart.add("2");
        cart.add("1");
        cart.remove("1");
        cart.remove("2");

        cart2.add("1");
        assertEquals(cart2, cart);
    }

    @Test
    void testMultisetContainObject() {
        Multiset<Object> cart = new Multiset<>();
        Multiset<Object> cart2 = new Multiset<>();

        cart.add("1");

        assertTrue(cart.contains("1"));
        assertFalse(cart.contains("2"));
    }
}
