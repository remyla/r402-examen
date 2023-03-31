import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ListeChaineeTests {

    ListeChainee a;
    ListeChainee b;
    ListeChainee c;
    ListeChainee d;
    ListeChainee e;

    @Test
    void testConstructeur() {
        assertThrows(NullPointerException.class, ListeChainee::new);
    }

    @Test
    void ajouterDebut() {
        a.ajouterDebut("début");
        assertEquals("début", a.lire());
    }

    @Test
    void lire() {
        b.ajouterDebut('1');
        assertEquals(1, b.lireIndex());
    }

    @Test
    void supprimerFin() {
        a.ajouterDebut("1");
        a.ajouterDebut("2");
        a.ajouterDebut("3");
        b.ajouterDebut("1");
        b.ajouterDebut("2");

        a.supprimerFin();
        assertEquals(b, a);

    }

    @Test
    void deplacer() {
        d.ajouterDebut("1");
        d.ajouterDebut("2");
        d.ajouterDebut("3");

        d.deplacer(true);
        assertEquals(1, d.lireIndex());
    }

    @Test
    void modifier() {
        c.ajouterDebut("1");
        c.modifier("2");

        assertEquals("2", d.lire());
    }

    @Test
    void lireIndex() {
        e.lireIndex();
        assertEquals(0, e.lireIndex());
    }
}
