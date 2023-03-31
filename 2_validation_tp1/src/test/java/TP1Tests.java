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

    /**
     * Dans ce test, nous avons un tableau "a" qui contient 6 éléments, dont la valeur "4" se trouve à la dernière position de l'index "5".
     * La méthode "indexOfLastOccurrence" doit donc retourner "5" si elle fonctionne correctement.
     * Si la méthode renvoie un résultat différent de "5" pour ce test,
     * alors cela indique qu'il y a une erreur dans la méthode et qu'elle doit être corrigée.
    */
    @Test
    public void testIndexOfLastOccurrence(){
        int[] arr = {1, 2, 3, 4, 5, 4};
        int x = 4;
        int expectedIndex = 5;
        int actualIndex = TP1.indexOfLastOccurrence(arr, x);
        assertEquals(expectedIndex, actualIndex);
        System.out.println(actualIndex);
    }

    /**
     * Dans ce test, nous testons plusieurs cas possible de la méthode indexOfLastOccurence ou il n'execute pas le défaut :
     * Dans le premier cas (arr) renvoie l'index de la dernière occurrence de la valeur "4" dans le tableau, soit l'index 5.
     * Dans le deuxième cas (arr2) teste une situation où la valeur "7" n'existe pas dans le tableau "a2".
     * La méthode doit donc renvoyer "-1".
     * Dans le troisième cas (arr3) teste une situation où la valeur "3" se répète plusieurs fois dans le tableau "a3".
     * La méthode doit renvoyer l'index de la dernière occurrence de la valeur "3" dans le tableau, soit l'index 5.
     */
    @Test
    public void testExecuteDefaultIndexOfLastOccurrence() {
        int[] arr = {1, 2, 3, 4, 5, 4};
        int x = 4;
        int expectedIndex = 5;
        int actualIndex = TP1.indexOfLastOccurrence(arr, x);
        assertEquals(expectedIndex, actualIndex);
        System.out.println(actualIndex);

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int y = 7;
        int expectedIndex2 = -1;
        int actualIndex2 = TP1.indexOfLastOccurrence(arr2, y);
        assertEquals(expectedIndex2, actualIndex2);
        System.out.println(actualIndex2);

        int[] arr3 = {1, 2, 3, 3, 3, 3};
        int z = 3;
        int expectedIndex3 = 5;
        int actualIndex3 = TP1.indexOfLastOccurrence(arr3, z);
        assertEquals(expectedIndex3, actualIndex3);
        System.out.println(actualIndex3);
    }

    /**
     *Dans ce test, nous avons un tableau "arr" qui ne contient pas la valeur "6", qui est la valeur recherchée.
     * La méthode "indexOfLastOccurrence" doit donc renvoyer "-1" si elle fonctionne correctement.
     * Si la méthode renvoie "-1" pour ce test, alors cela indique que la méthode fonctionne correctement et que le test est réussi.
     * Si la méthode renvoie un autre résultat, alors cela indique qu'il y a une erreur dans la méthode et qu'elle doit être corrigée.
     */
    @Test
    public void testNotExecuteDefaultIndexOfLastOccurrence() {
            int[] arr = {1, 2, 3, 4, 5};
            int x = 6;
            int expectedIndex = -1;
            int actualIndex = TP1.indexOfLastOccurrence(arr, x);
            assertEquals(expectedIndex, actualIndex);
            System.out.println(actualIndex);
    }

    /**
     * Dans ce test, nous avons un tableau "arr" qui contient deux occurrences de la valeur "1" aux index 0 et 4.
     * Cependant, la méthode "indexOfLastOccurrence" doit renvoyer l'index de la dernière occurrence de la valeur "1",
     * qui est l'index 4 dans ce cas. Le test s'attend donc à recevoir l'index 4 comme résultat attendu.
     */
    @Test
    public void testFailureIndexOfLastOccurrence(){
        int[] arr = {1, 2, 3, 2, 1};
        int x = 1;
        int expectedIndex = 0;
        int actualIndex = TP1.indexOfLastOccurrence(arr, x);
        assertEquals(expectedIndex, actualIndex);
        System.out.println(actualIndex);
    }

    /**
     * Dans ce test, nous avons un tableau "arr" contenant des entiers de 1 à 5.
     * La méthode "average" doit calculer la moyenne de ces nombres et la renvoyer.
     * Nous nous attendons à ce que la moyenne soit égale à 3.
     * La méthode "assertEquals" compare le résultat attendu (3.0) avec le résultat réel renvoyé par la méthode "average"
     * avec une marge d'erreur de 0,0001. Si les deux valeurs sont égales, alors le test est réussi.
     * Sinon, le test échouera et indiquera qu'il y a une erreur dans la méthode "average".
     */
    @Test
    public void testAverage(){
        int[] arr = {1, 2, 3, 4, 5};
        double expectedAvg = 3.0;
        double actualAvg = TP1.average(arr);
        assertEquals(expectedAvg, actualAvg, 0.0001);
        System.out.println(actualAvg);
    }

    /**
     * Dans ce test, nous avons un tableau "arr" contenant des entiers de 1 à 5.
     * La méthode "average" doit calculer la moyenne de ces nombres et la renvoyer.
     * Cependant, nous nous attendons à ce que la moyenne soit égale à 2,5, mais la méthode "average" renvoie 3.0.
     * La méthode "assertEquals" compare le résultat attendu (2.5) avec le résultat réel renvoyé par la méthode "average"
     * avec une marge d'erreur de 0,0001.
     * Comme les deux valeurs ne sont pas égales, le test échouera et indiquera qu'il y a une erreur dans la méthode "average".
     */
    @Test
    public void testAverageFailure() {
        int[] arr = {1, 2, 3, 4, 5};
        double expectedAvg = 2.5;
        double actualAvg = TP1.average(arr);
        assertEquals(expectedAvg, actualAvg, 0.0001);
        System.out.println(actualAvg);
    }

    /**
     * Dans ce test, nous avons un tableau "arr" contenant des entiers de 1 à 3.
     * La méthode "average" est appelée avec ce tableau en entrée et le résultat attendu est de 2.0.
     * Le test vérifie si la méthode "average" renvoie le résultat attendu avec une précision de 0.0001.
     * Ce test ne devrait pas executer le défaut.
     */
    @Test
    public void testAverageNotExecuteDefault(){
        int[] arr = {1, 2, 3};
        double expectedAvg = 2.0;
        double actualAvg = TP1.average(arr);
        assertEquals(expectedAvg, actualAvg, 0.0001);
        System.out.println(actualAvg);
    }

    /**
     * Dans ce test, nous avons un tableau "arr" contenant des entiers de 1 à 5.
     * La méthode "countOddElements" est appelée avec ce tableau en entrée et le résultat attendu est de 3.
     * Le test vérifie si la méthode "countOddElements" renvoie le résultat attendu.
     */
    @Test
    public void testCountOddElements(){
        int[] arr = {1, 2, 3, 4, 5};
        int expectedCount = 3;
        int actualCount = TP1.countOddElements(arr);
        assertEquals(expectedCount, actualCount);
        System.out.println(actualCount);
    }

    /**
     * Dans ce test, nous avons un tableau "arr" contenant des entiers pairs de 2 à 10.
     * La méthode "countOddElements" est appelée avec ce tableau en entrée et le résultat attendu est de 0,
     * car il n'y a aucun nombre impair dans le tableau. Cependant, la méthode "countOddElements" ne tient pas compte des nombres
     * pairs et ne devrait pas augmenter le compteur "res" pour eux.
     * Le test vérifie si la méthode "countOddElements" renvoie le résultat attendu.
     */
    @Test
    public void testCountOddElementsFailure(){
        int[] arr = {2, 4, 6, 8, 10};
        int expectedCount = 0;
        int actualCount = TP1.countOddElements(arr);
        assertEquals(expectedCount, actualCount);
        System.out.println(actualCount);
    }

    /**
     * Ce test vérifie que la méthode countOddElements renvoie le bon résultat
     * pour des tableaux avec des nombres pairs et impairs, ainsi qu'un tableau vide.
     */
    @Test
    public void testCountOddElementsExecuteDefault(){
        int[] arr1 = {1, 2, 3, 4, 5};
        assertEquals(3, TP1.countOddElements(arr1));
        System.out.println(arr1);

        int[] arr2 = {0, 2, 4, 6};
        assertEquals(0, TP1.countOddElements(arr2));
        System.out.println(arr2);

        int[] arr3 = {1, 1, 1, 1};
        assertEquals(4, TP1.countOddElements(arr3));
        System.out.println(arr3);

        int[] arr4 = {};
        assertEquals(0, TP1.countOddElements(arr4));
        System.out.println(arr4);

    }



}
