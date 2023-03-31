import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TP1Tests {

    // dans JUnit 5, un test est simplement une méthode de type void, marquée avec le tag @Test
    // elle peut avoir n'importe quel nom
    @Test
    void simpleTest() {
        // pour être utile, un test doit comporter au moins une assertion qui vérifie une propriété
        String s = "s" + "tring";
        // cette assertion vérifie que le deuxième argument est égal au premier (le résultat attendu)
        assertEquals("string", s);
    }

    @Test
    public void testOverArrays() {
        int[] a = {3, 2, 1};
        int[] expected = {1, 2, 3};

        Arrays.sort(a);
        // cette assertion permet de tester que deux tableaux ont le même contenu
        assertArrayEquals(expected, a);
    }

    /*
    indexOfLastOccurrence
     */
    @Test
    public void shouldReturnNotDefault() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 3;
        int expected = 2;
        int actual = TP1.indexOfLastOccurrence(a, x);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnDefaultWithNoBug() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 12;
        int expected = -1;
        int actual = TP1.indexOfLastOccurrence(a, x);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnWithBug() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 10;
        int expected = 9;
        int actual = TP1.indexOfLastOccurrence(a, x);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfLastOccurrenceTest() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 10;
        int expected = 9;
        int actual = TP1.indexOfLastOccurrence(a, x);
        assertEquals(expected, actual);
    }

    /* Average */
    @Test
    public void averageShouldNotReturnDefault() {
        int[] a = {1,2};
        double expected = 1.5;
        double actual = TP1.average(a);
        assertEquals(expected, actual);
    }

    @Test
    public void averageShouldReturnDefaultWithNoBug() {
        int[] a = {};
        double expected = 0;
        double actual = TP1.average(a);
        assertEquals(expected, actual);
    }

    @Test
    public void averageShouldReturnWithBug1() {
        int[] a = {2,4};
        double expected = 3;
        double actual = TP1.average(a);
        assertEquals(expected, actual);
    }

    @Test
    public void averageShouldReturnWithBug2() {
        int[] a = {1,2};
        double expected = 1.5;
        double actual = TP1.average(a);
        assertEquals(expected, actual);
    }

    /*
        countOddElements
     */
    @Test
    public void countOddElementShouldReturnNotDefault() {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int expected = 5;
        int actual = TP1.countOddElements(a);
        assertEquals(expected, actual);
    }

    @Test
    public void countOddElementShouldReturnDefaultWithNoBug() {
        int[] a = {};
        int expected = 0;
        int actual = TP1.countOddElements(a);
        assertEquals(expected, actual);
    }

    @Test
    public void countOddElementShouldReturnWithBug() {
        int[] a = {-1,2,3,4,-5,6,7,8,9,10};
        int expected = 5;
        int actual = TP1.countOddElements(a);
        assertEquals(expected, actual);
    }

}
