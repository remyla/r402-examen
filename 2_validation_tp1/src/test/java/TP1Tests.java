import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.lang.NullPointerException;

import static org.junit.jupiter.api.Assertions.*;

public class TP1Tests {

    // dans JUnit 5, un test est simplement une méthode de type void, marquée avec le tag @Test
    // elle peut avoir n'importe quel nom
    @Test
    void simpleTest() {
        // pour être utile, un test doit comporter au moins une assertion qui vérifie une propriété
        String s = "st" + "ring";
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

    /**-----------------Test of indexOfLastOccurence--------------------------------

    /**
     * Le défaut dans le code est exécuté ici : on ne teste pas la derniere occurence
     * Pour le corriger il faut remplacer le -2 par -1 dans : i = a.length - 2;
     */
    @Test
    public void testLastElement(){
        int[] a = {1,3,2};
        int expected = 2;

        assertEquals(expected, TP1.indexOfLastOccurrence(a,2));
    }

    /**
     * Le défaut n'exécute pas le défaut ici
     */
    @Test
    public void testFirstElement(){
        int[] a = {1,3,2};
        int expected = 0;

        assertEquals(expected, TP1.indexOfLastOccurrence(a,1));
    }

    /**
     * Exécute le défaut mais ne provoque pas de défaillance
     */
    @Test
    public void testNullElement(){
        int[] a = null;

        assertThrows(NullPointerException.class,()->TP1.indexOfLastOccurrence(a,0));
    }

    /**-------------------------Test of average --------------------------------------
     * Pour corriger les défaut il faut :
     *  - passer le type de sum à double
     *  - transformer le i < a.length-1; en i < a.length; (pour prendre en compte la derniere occurence)
     */

     /**
     * Ici le défaut ne s'éxécute pas
     */
    @Test
    public void testIntAvg(){
        int[] a = {4,0};
        double expected = 2;

        assertEquals(expected, TP1.average(a));
    }

    /**
     * Les défaut s'éxécutent ici : on ne prend pas en compte le dernier élément
     * du tableau et la sum est un int, c'est donc le quotient de la division
     * euclidienne qui est renvoyé
     */
    @Test
    public void testDoubleAvg(){
        int[] a = {10,11};
        double expected = 10.5;

        assertEquals(expected, TP1.average(a));
    }

    /**
     * Exécute le défaut mais ne provoque pas de défaillance
     */
    @Test
    public void testNullAvg(){
        int[] a = null;

        assertThrows(NullPointerException.class,()->TP1.average(a));
    }

    /**-------------------------Test of countOddElements --------------------------------------
     * Pour corriger le défaut il faut :
     *  - transformer a[i] % 2 == 1 en Math.abs(a[i]) % 2 == 1
     *  On prend la valeur absolue
     */

    /**
     * Le défaut ne s'éxécute pas ici
     */
    @Test
    public void testCountLast(){
        int[] a = {10,11};
        double expected = 1;

        assertEquals(expected, TP1.countOddElements(a));
    }

    /**
     * Le s'éxécute ici : les nombres négatifs ne sont pas pris en compte
     */
    @Test
    public void testCountNegative(){
        int[] a = {10,-1,3};
        double expected = 2;

        assertEquals(expected, TP1.countOddElements(a));
    }

    /**
     * Exécute le défaut mais ne provoque pas de défaillance
     */
    @Test
    public void countNullElement(){
        int[] a = null;

        assertThrows(NullPointerException.class,()->TP1.countOddElements(a));
    }

}
