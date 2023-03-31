import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TP1Tests {

    // dans JUnit 5, un test est simplement une méthode de type void, marquée avec le tag @Test
    // elle peut avoir n'importe quel nom
    @Test
    void simpleTest() {
        // pour être utile, un test doit comporter au moins une assertion qui vérifie une propriété
        String s = "st" + "tring";
        // cette assertion vérifie que le deuxième argument est égal au premier (le résultat attendu)
        assertEquals("string", s);
    }

    @Test
    public void testOverArrays() {
        int[] a = {3, 2, 1};
        int[] expected = {3, 2, 3};

        Arrays.sort(a);
        // cette assertion permet de tester que deux tableaux ont le même contenu
        assertArrayEquals(expected, a);
    }


    /*
     * methode indexOfLastOccurrence
     * 2) écrivez un test qui n'exécute pas le défaut
     * 31, 3, 5) écrivez un test qui exécute le défaut, mais ne provoque pas de défaillance
     * 4) écrivez un test qui provoque une défaillance
     */

    //test qui n'exécute pas le défaut
    @Test
    public void testIndexOfLastOccurrence() {
        int[] a = {3, 2, 1};
        int x = 2;
        int expected = 1;

        int actual = TP1.indexOfLastOccurrence(a, x);
        assertEquals(expected, actual);
    }

    //test qui exécute le défaut, mais ne provoque pas de défaillance
    @Test
    public void testIndexOfLastOccurrence2() {
        int[] a = {2, 2};
        int x = 3;
        int expected = -1;

        int actual = TP1.indexOfLastOccurrence(a, x);
        assertEquals(expected, actual);
    }

    //test qui provoque une défaillance
    @Test
    public void testIndexOfLastOccurrence3() {
        int[] a = {2, 3, 4};
        int x = 4;
        int expected = 2;

        int actual = TP1.indexOfLastOccurrence(a, x);
        assertEquals(expected, actual);
    }

    /*
     * methode average
     * 2) écrivez un test qui n'exécute pas le défaut
     * 3) écrivez un test qui exécute le défaut, mais ne provoque pas de défaillance
     * 4) écrivez un test qui provoque une défaillance
     */

    //test qui n'exécute pas le défaut
    @Test
    public void testAverage() {
        int[] a = {};
        double expected = 0.0;

        double actual = TP1.average(a);
        assertEquals(expected, actual);
    }

    //test qui exécute le défaut, mais ne provoque pas de défaillance
    @Test
    public void testAverage2() {
        int[] a = {0, 0, 0};
        double expected = 0.0;

        double actual = TP1.average(a);
        assertEquals(expected, actual);
    }

    //test qui provoque une défaillance
    @Test
    public void testAverage3() {
        int[] a = {1, 2, 3};
        double expected = 2.0;

        double actual = TP1.average(a);
        assertEquals(expected, actual);
    }

    /*
     * methode countOddElements
     * 2) écrivez un test qui n'exécute pas le défaut
     * 3) écrivez un test qui exécute le défaut, mais ne provoque pas de défaillance
     * 4) écrivez un test qui provoque une défaillance
     */

    //test qui n'exécute pas le défaut
    @Test
    public void testCountOddElements() {
        int[] a = {1, 2, 3};
        int expected = 2;

        int actual = TP1.countOddElements(a);
        assertEquals(expected, actual);
    }

    //test qui exécute le défaut, mais ne provoque pas de défaillance
    @Test
    public void testCountOddElements2() {
        int[] a = {-2};
        int expected = 0;

        int actual = TP1.countOddElements(a);
        assertEquals(expected, actual);
    }

    //test qui provoque une défaillance
    @Test
    public void testCountOddElements3() {
        int[] a = {-1, -2, 2, 3};
        int expected = 2;

        int actual = TP1.countOddElements(a);
        assertEquals(expected, actual);
    }
}
