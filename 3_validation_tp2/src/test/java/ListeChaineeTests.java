import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ListeChaineeTests {

    ListeChainee<String> a;
    ListeChainee<Integer> b;


    ListeChaineeTests() {
        a = new ListeChainee<String>(); // {}
        b = new ListeChainee<Integer>(); // {}
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);

        b = new ListeChainee<Integer>(elements); // {1, 2}


    }

    @Test
    void testConstructeur() {
        ArrayList<String> elements = new ArrayList<>();
        elements.add(null);
        assertThrows(NullPointerException.class, () -> new ListeChainee<String>(elements));
        elements.add(0, "b");
        assertThrows(NullPointerException.class, () -> new ListeChainee<String>(elements));
    }

    @Test
    void testTaille() {
        assertEquals(0, a.taille());
        assertEquals(2, b.taille());
    }

    @Test
    void testContient() {
        assertFalse(a.contient("a"));
        assertFalse(b.contient(3));
        assertTrue(b.contient(1));
    }

    @Test
    void testEstVide() {
        assertTrue(a.estVide());
        assertFalse(b.estVide());
    }

    @Test
    void testAjouter() {
        a.ajouter("a");
        assertEquals(1, a.taille());
        assertTrue(a.contient("a"));
        b.ajouter(3);
        assertEquals(3, b.taille());
        assertTrue(b.contient(3));
    }

    @Test
    void testSupprimer() {
        assertThrows(NoSuchElementException.class, () -> a.supprimer());
        a.ajouter("a");
        a.supprimer();
        assertEquals(0, a.taille());
        assertFalse(a.contient("a"));
        b.supprimer();
        b.supprimer();
        assertEquals(0, b.taille());
        assertFalse(b.contient(1));
    }

    @Test
    void testElement() {
        assertThrows(NoSuchElementException.class, () -> a.element(null));
        assertEquals(1, b.element(2));
    }

    @Test
    void union() {
        ListeChainee<Integer> c = new ListeChainee<Integer>();
        c.ajouter(1);
        c.ajouter(2);
        c.ajouter(3);

        ListeChainee<Integer> a = new ListeChainee<Integer>();

        ListeChainee<Integer> d = new ListeChainee<Integer>();
        d.ajouter(4);
        d.ajouter(5);
        d.ajouter(6);

        ListeChainee<Integer> e = new ListeChainee<Integer>();
        e.ajouter(1);
        e.ajouter(2);
        e.ajouter(3);
        e.ajouter(4);
        e.ajouter(5);
        e.ajouter(6);

        c.union(d);
        assertThrows(NullPointerException.class, () -> c.union(a));
        assertEquals(e, d);
    }


}
