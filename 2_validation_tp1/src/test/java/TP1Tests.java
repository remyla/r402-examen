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

    @Test
    public void testIsLast() {
        int[] a = {1,2,3};

        //Vérifier si la valeur retourné est celle de l'index en dernière position
        assertEquals(2, TP1.indexOfLastOccurrence(a,3));
    }

    @Test
    public void testIsFirst() {
        int[] a = {1,2,3};

        //Vérifier si la valeur retourné est celle de l'index en première position
        assertEquals(0, TP1.indexOfLastOccurrence(a,1));
    }

    @Test
    public void testMultiple() {
        int[] a = {1,1,1,1};

        //Vérifier si la valeur retourné est celle de l'index de la dernière occurence du chiffre 1
        assertEquals(3, TP1.indexOfLastOccurrence(a,1));
    }

    @Test
    public void testAverage() {
        int[] a = {10,10,20,20};

        //Vérifier si la valeur retourné est celle de la moyenne des entiers de a
        assertEquals(15, TP1.average(a));
    }

    @Test
    public void testAverageWithEmptyArray() {
        int[] a = {};

        //Vérifier si la valeur retourné est 0.0
        assertEquals(0.0, TP1.average(a));
    }

    @Test
    public void testCountOddElement() {
        int[] a = {1,2,3,4,5,6,7,8,9,10};

        //Vérifier si la valeur retourné est bien le nombre d'entier impairs
        assertEquals(5, TP1.countOddElements(a));
    }

    @Test
    public void testCountOddElementWithNegative() {
        int[] a = {-1,0,1,2,3,4,5,6,7,8,9,10};

        //Vérifier si la valeur retourné est bien le nombre d'entier impairs
        assertEquals(6, TP1.countOddElements(a));
    }

    @Test
    public void testCountOddElementWithEmptyArray() {
        int[] a = {};

        //Vérifier si la valeur retourné est bien 0
        assertEquals(0, TP1.countOddElements(a));
    }

}
