import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ListeChaineeTests {

    ListeChainee a;
    ListeChainee c;
    ListeChainee d;

    ListeChaineeTests() {
        a = new ListeChainee(); // {}
        ArrayList<Object> elements = new ArrayList<>();
        elements.add(2);
        elements.add(3);
        c = new ListeChainee(elements); // {2, 3}
        elements.add(2);
        d = new ListeChainee(elements); // {2, 3}
    }

    @Test
    void testConstructeur() {
        ArrayList<Object> elements = new ArrayList<>();
        elements.add(null);
        assertThrows(NullPointerException.class, () -> new ListeChainee(elements));
        elements.add(0, 2);
        assertThrows(NullPointerException.class, () -> new ListeChainee(elements));
    }

    @Test
    void testTaille() {
        assertEquals(0, a.taille());
        assertEquals(2, c.taille());
        assertEquals(2, d.taille());
    }

    @Test
    void testContient() {
        assertFalse(a.contient(1));
        assertFalse(c.contient(0));
        assertTrue(c.contient(2));
        assertFalse(d.contient(0));
        assertTrue(d.contient(2));
    }

    @Test
    void testElement() {
        assertThrows(NoSuchElementException.class, () -> a.element());
        assertTrue(c.contient(c.element()));
        assertTrue(d.contient(d.element()));
    }

    @Test
    void testUnion() {
        ListeChainee e = d.union(c);
        assertEquals(4, e.taille());
        assertTrue(e.contient(3));
        assertFalse(e.contient(1));

        ListeChainee f = c.union(d);
        assertEquals(3, f.taille());
        assertTrue(f.contient(3));
        assertFalse(f.contient(1));
    }

    @Test
    void testObtenirTete(){
        assertEquals(2,c.obtenirTete());
        assertEquals(2,d.obtenirTete());
    }

    @Test
    void testObtenirQueue(){
        assertEquals(3, c.obtenirQueue());
        assertEquals(3, d.obtenirQueue());
    }

    @Test
    void testInsertionFin(){
        c.insertionFin(5);
        assertEquals(5, c.obtenirQueue());
    }

    @Test
    void testInsertionDebut(){
        d.insertionDebut(1);
        assertEquals(1, c.obtenirTete());
    }

    @Test
    void testSupprimerFin(){
        c.supprimerFin();
        assertEquals(3,c.obtenirQueue());
    }

    @Test
    void testSupprimerDebut(){
        d.supprimerDebut();
        assertEquals(2,d.obtenirTete());
    }

}
