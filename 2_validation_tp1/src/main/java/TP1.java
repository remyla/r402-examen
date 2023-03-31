import java.math.BigDecimal;
import java.util.Arrays;

public class TP1 {

    /* Exercice 1: défauts, erreurs et défaillances
     *
     * Pour chacune des méthodes indexOfLastOccurrence, average, et countOddElements:
     * 1) déterminez le défaut logiciel dans la méthode (si vous ne trouvez pas le défaut simplement en inspectant le
     *    code, écrivez des tests pour vous aider)
     * 2) écrivez un test qui n'exécute pas le défaut
     * 3) écrivez un test qui exécute le défaut, mais ne provoque pas de défaillance
     * 4) écrivez un test qui provoque une défaillance
     *
     */

    /**
     * Retourne la position de la dernière occurrence de la valeur x dans le tableau a, ou -1 si la valeur n'est pas
     * présente dans le tableau.
     *
     * @param a le tableau où chercher la valeur
     * @param x la valeur recherchée
     * @return la plus grande position <code>i</code> telle que <code>a[i] == x</code>, ou -1 si aucune position ne
     * contient la valeur recherchée
     * @throws NullPointerException si <code>a == null</code>
     */
    /*
    Cette fonction calcule l'indice de la dernière occurrence de x dans le tableau a. Mais si on test avec la dernière valeur
    du tableau, on obtient -1. Cela est du au fait que i commence à a.length - 2. On doit le mettre a.length -1. La défault logiciel est ici
     */
    public static int indexOfLastOccurrence(int[] a, int x) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Retourne la moyenne des valeurs stockées dans le tableau.
     *
     * @param a le tableau contenant les valeurs
     * @return la moyenne des valeurs stockées, ou 0.0 si le tableau est vide
     * @throws NullPointerException si <code>a == null</code>
     */
    /*
    Ici on peut voir que le i < a.length - 1 est un premier défault. On doit rajouter un =. De plus
    Si le résultat de la moyenne est un nombre décimal, on ne peut pas le stocker dans un int. Il faut donc utiliser un double au niveau
    du return.
     */
    public static double average(int[] a) {
        if (a.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i <= a.length -1; i++) {
            sum += a[i];
        }
        return (double) sum / a.length;
    }

    /**
     * Retourne le nombre d'entiers impairs contenus dans le tableau.
     *
     * @param a le tableau contenant les valeurs
     * @return le nombre d'entier impairs contenus dans le tableau
     * @throws NullPointerException si <code>a == null</code>
     */
    /*
    Ici on peut voir que si on insère des nombres négatifs dans le tableau, on obtient un résultat qui est faux.
    On doit donc utiliser la fonction Math.abs pour avoir le nombre absolu est donc ne pas faire la différence entre -1 et 1 par exemple.
     */
    public static int countOddElements(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i]) % 2 == 1) {
                res++;
            }
        }
        return res;
    }

}
