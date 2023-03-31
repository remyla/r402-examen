import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class listechaineetest {

        listeChainee<Integer> a;
        listeChainee<Integer> b;
        listeChainee<Integer> c;
        listeChainee<Integer> d;

        listechaineetest() {
            a = new listeChainee<Integer>(); // {}
            ArrayList<Integer> elements = new ArrayList<>();
            elements.add(1);
            b = new listeChainee<>(elements); // {1}
            elements.remove(1);
            elements.add(2);
            elements.add(3);
            elements.add(4);
            c = new listeChainee<>(elements); // {2, 3, 4}
            elements.add(2);
            d = new listeChainee<>(elements); // {2, 3, 4}
            d.subList(0,2); // {2, 3}
        }

        @Test
        void testConstructeur() {
            ArrayList<Integer> elements = new ArrayList<>();
            elements.add(null);
            assertThrows(NullPointerException.class, () -> new listeChainee<Integer>(elements));
            elements.add(0, 1);
            assertThrows(NullPointerException.class, () -> new listeChainee<Integer>(elements));
        }

        @Test
        void testTaille() {
            assertEquals(0, a.getSize());
            assertEquals(1, b.getSize());
            assertEquals(3, c.getSize());
            assertEquals(3, d.getSize());
        }

        @Test
        void testContient() {
            assertFalse(a.contains(1));
            assertFalse(b.contains(1));
            assertTrue(b.contains(1));
            assertFalse(c.contains(0));
            assertTrue(c.contains(2));
            assertFalse(d.contains(0));
            assertTrue(d.contains(2));
        }


}
