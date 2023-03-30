import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitDemoBasics {

    // dans JUnit 5, un test est simplement une méthode de type void, marquée avec le tag @Test
    // elle peut avoir n'importe quel nom
    @Test
    void simpleTestThatPasses() {
        // pour être utile, un test doit comporter au moins une assertion qui vérifie une propriété
        String s = "st" + "ring";
        // cette assertion vérifie que le deuxième argument est égal au premier (le résultat attendu)
        assertEquals("string", s);
    }

    // la visibilité d'un test doit être au moins 'package-private' (pas de mot clé)
    // on peut mettre la visibilité en 'protected' ou 'public', mais pas en 'private'
    @Test
    public void simpleTestThatFails() {
        int i = 1 + 1;
        // cette assertion échoue si les deux arguments sont égaux
        assertNotEquals(2, i);
    }

    // on peut spécifier un nom pour le test à l'aide du tag @DisplayName
    @Test
    @DisplayName("Un test avec un nom")
    void testWithADisplayName() {
        String s = "";
        // cette assertion échoue si l'argument est null
        assertNotNull(s);
    }

    @Test
    void testWithAFailureMessage() {
        int i = 1 + 1;
        // on peut aussi ajouter un message affiché en cas d'échec de l'assertion
        assertEquals(1, i, "la valeur " + i + " n'est pas celle attendue");
    }

    @Test
    void testOverArrays() {
        int[] a = {1, 1+1, 1+1+1};
        // cette assertion permet de tester le contenu d'un tableau
        assertArrayEquals(new int[] {1, 2, 3}, a);
    }

    @Test
    void sameIsNotTheSameAsEquals() {
        String s1 = "test";
        String s2 = new String("test");
        // cette assertion fait appel à la méthode equals, dans le cas présent elle réussit
        assertEquals(s1, s2);
        // cette assertion fait appel à l'égalité des objets (==), ici elle échoue
        assertSame(s1, s2);
    }

    // les opérations sur les nombres flottants (float ou double) peuvent entraîner des erreurs d'arrondis
    @Test
    void testOverFloatingNumbers() {
        double a = 0.1;
        double b = 0.2;
        // cette assertion échoue!
        assertEquals(0.3, a + b);
    }

    // on préfèrera donner une marge d'erreur (un "delta") pour tester l'égalité de deux nombres flottants
    @Test
    void testOverFloatingNumbersWithDelta() {
        double a = 0.1;
        double b = 0.2;
        double delta = 2.22e-16; // pour une explication sur cette valeur: https://fr.wikipedia.org/wiki/Epsilon_d%27une_machine
        assertEquals(0.3, a + b, delta);

        // certaines méthodes n'ont pas à introduire des erreurs d'arrondis et doivent retourner un résultat exact
        assertEquals(0.2, Math.max(a, b));
    }

    @Test
    void testOverIterables() {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        List<Integer> l = List.of(1, 2, 3);
        // cette assertion permet de tester que le contenu de deux objets Iterable est identique
        assertIterableEquals(v, l);
    }

}
