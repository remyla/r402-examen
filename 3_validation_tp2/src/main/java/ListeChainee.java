import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * Cette classe modélise une liste chainée, un ensemble de maillons, chacun ayant une référence vers le maillon suivant.
 * Les instances de cette classe sont immuables.
 * Les éléments sont garantis non-<code>null</code>.
 */
public class ListeChainee {

    private Maillon tete;
    private ArrayList<Maillon> liste;


    /**
     * Construit une nouvelle liste vide.
     */
    public ListeChainee() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Construit une nouvelle liste contenant les éléments d'une collection.
     *
     * @param objets la collection d'objet contenu dans la liste
     * @throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public ListeChainee(Collection<Object> objets) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne le nombre d'éléments dans la liste (sa cardinalité).
     * @return le nombre d'éléments contenus dans la liste
     */
    public int taille() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne <code>true</code> si l'ensemble contient l'élément spécifié.
     *
     * @param o l'élément dont la présence est testée
     * @return <code>true</code> si et seulement si l'ensemble contient un élément <code>x</code> tel que <code>o.equals(x)</code>.
     */
    public boolean contient(Object o) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne la tête de la liste chainee.
     * @return la tête de la liste chainee
     * @throws NoSuchElementException si la liste est vide
     */
    public Object tete() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne l'union de l'ensemble et de l'ensemble spécifié.
     *
     * @param autre l'ensemble avec lequel calculer l'union
     * @return un nouvel ensemble contenant tous les éléments distincts contenus dans cet ensemble ou dans <code>e</code>
     */
    public ListeChainee union(ListeChainee autre) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Ajoute un nouvel objet à la liste chainee.
     * @param o l'objet à ajouter
     * @throws NullPointerException si l'objet est <code>null</code>
     */
    public void ajouter(Object o) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retire un objet de la liste chainee.
     * @param o l'objet à retirer
     * @throws NoSuchElementException si l'objet n'est pas présent dans la liste
     */
    public void retirer(Object o) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne la liste chainee sous forme de chaine de caracteres.
     * @return la liste chainee sous forme de chaine de caracteres
     */
    @Override
    public String toString() {
        return "ListeChainee{" + liste + '}';
    }
}
