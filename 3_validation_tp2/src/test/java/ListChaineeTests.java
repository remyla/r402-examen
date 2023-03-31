import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ListChaineeTests {
    ListeChainee a;
    ListeChainee b;
    ListeChainee c;
    ListeChainee d;

    ListChaineeTests() {
        a = new ListeChainee(); // {}
        ArrayList<Object> elements = new ArrayList<>();
        elements.add("b");
        b = new ListeChainee(elements); // {"b"}
        elements.remove("b");
        elements.add(2.0);
        elements.add("a");
        elements.add(3);
        c = new ListeChainee(elements); // {2.0, "a", 3}
        elements.add(6);
        d = new ListeChainee(elements); // {2.0, "a", 3, 6}
    }

    @Test
    void testConstructeur() {
        ArrayList<Object> elements = new ArrayList<>();
        elements.add(null);
        assertThrows(NullPointerException.class, () -> new ListeChainee(elements));
        elements.add(0, "b");
        assertThrows(NullPointerException.class, () -> new ListeChainee(elements));
    }

    @Test
    void testTaille() {
        assertEquals(0, a.taille());
        assertEquals(1, b.taille());
        assertEquals(3, c.taille());
        assertEquals(3, d.taille());
    }

    @Test
    void testContient() {
        assertFalse(a.contient(1));
        assertFalse(b.contient(1));
        assertTrue(b.contient("b"));
        assertFalse(c.contient(0));
        assertTrue(c.contient(2.0));
        assertFalse(d.contient(0));
        assertTrue(d.contient(2.0));
    }

    @Test
    void testAjouter() {
        assertThrows(NullPointerException.class, () -> a.ajouter(null));
        d.ajouter(1);
        assertTrue(d.contient(1));
    }

    @Test
    void testRetirer() {
        assertThrows(NoSuchElementException.class, () -> a.retirer(new Object()));
        d.retirer(1);
        assertFalse(d.contient(1));
    }

    @Test
    void testToString() {
        assertEquals("{}", a.toString());
        assertEquals("{b}", b.toString());
        assertEquals("{2.0, a, 3}", c.toString());
        assertEquals("{2.0, a, 3, 6}", d.toString());
    }

    @Test
    void testTete() {
        assertThrows(NoSuchElementException.class, () -> a.tete());
        assertEquals("b", b.tete());
        assertEquals(2.0, c.tete());
        assertEquals(2.0, d.tete());
    }
}
