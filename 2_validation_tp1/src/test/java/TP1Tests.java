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
        int[] expected = {1, 2, 3};

        Arrays.sort(a);
        // cette assertion permet de tester que deux tableaux ont le même contenu
        assertArrayEquals(expected, a);
    }

    @Test
    public void indexOfLastOccurence_noError(){
        int[] a = {3, 2, 1, 0, 5, 8, 5, 6, 2, 3 };
        int expected = -1;

        assertEquals(expected,TP1.indexOfLastOccurrence(a,9));
    }

    @Test
    public void indexOfLastOccurence_errorNoFail(){
        int[] a = {3, 2, 1, 0, 5, 8, 5, 6, 2, 3 };
        int expected = 3;

        assertEquals(expected,TP1.indexOfLastOccurrence(a,0));
    }

    @Test
    public void indexOfLastOccurence_Fail(){
        int[] a = {3, 2, 1, 0, 5, 8, 5, 6, 2, 3 };
        int expected = 9;

        assertEquals(expected,TP1.indexOfLastOccurrence(a,3));
    }

    @Test
    public void average_noError(){
        int[] a = {};
        double expected = 0.0;

        assertEquals(expected,TP1.average(a));
    }

    @Test
    public void average_errorNoFail(){
        int[] a = {0,0,0,0};
        double expected = 0.0;

        assertEquals(expected,TP1.average(a));
    }

    @Test
    public void average_Fail(){
        int[] a = {3, 2, 1};
        double expected = 2.0;

        assertEquals(expected,TP1.countOddElements(a));
    }

    @Test
    public void countOddElements_noError(){
        int[] a = {0,2,4,8};
        int expected = 0;

        assertEquals(expected,TP1.countOddElements(a));
    }

    @Test
    public void countOddElements_errorNoFail(){
        int[] a = {3,1,4,2,5};
        int expected = 3;

        assertEquals(expected,TP1.countOddElements(a));
    }

    @Test
    public void countOddElements_Fail(){
        int[] a = {3, 2, 1};
        int expected = 2;

        assertEquals(expected,TP1.countOddElements(a));
    }
    
    

}
