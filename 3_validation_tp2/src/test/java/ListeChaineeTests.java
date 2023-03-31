import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ListeChaineeTests {

    ListeChainee a;
    ListeChainee b;
    ListeChainee c;
    ListeChainee d;

    ListeChaineeTests() {
        a = new ListeChainee(); // {}
        ArrayList<Object> elements = new ArrayList<>();
        elements.add("b");
        b = new ListeChainee(elements); // {"b"}
        elements.remove("b");
        elements.add(2.0);
        elements.add("a");
        elements.add(3);
        c = new ListeChainee(elements); // {2.0, "a", 3}
        elements.add(2.0);
        d = new ListeChainee(elements); // {2.0, "a", 3, 2.0}
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
    void testElement() {
        assertThrows(NoSuchElementException.class, () -> a.element());
        assertEquals("b", b.element());
        assertTrue(c.contient(c.element()));
        assertTrue(d.contient(d.element()));
    }

    @Test
    void testUnion() {
        ListeChainee e = b.union(c);
        assertEquals(4, e.taille());
        assertTrue(e.contient("b"));
        assertTrue(e.contient(3));
        assertFalse(e.contient(1.0));

        ListeChainee f = c.union(d);
        assertEquals(3, f.taille());
        assertTrue(f.contient(3));
        assertFalse(f.contient(1.0));
    }

    @Test
    void testSuivant() {
        assertEquals("a", b.suivant());
        assertEquals(3, b.suivant());
    }
    @Test
    void testPrecedent() {
        b.suivant();
        assertEquals(2.0, b.precedent());
    }
}
