import java.util.Collection;

/**
 * Classe ListeChainee
 * Cette classe définit les différentes méthodes pour construire une liste chainée.
 * Vous pouvez soit créer une liste chainée vide, soit créer une liste chainée à partir d'une collection.
 * @param <T> le type des éléments de la liste chaînée
 * @author Guillaume Kusiak
 * @version 1.0
 */
public class ListeChainee<T> {

    /**
     * Construit une nouvelle liste chaînée vide.
     */
    public ListeChainee() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Construit un nouvelle liste chaînée contenant les éléments d'une collection.
     * @param objets la collection d'objets contenus dans la liste chaînée
     * @throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public ListeChainee(Collection<T> objets) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne le nombre d'éléments dans la liste chaînée (sa cardinalité).
     * @return le nombre d'éléments contenus dans la liste chaînée
     */
    public int taille(){
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne <code>true</code> si la liste chaînée est vide ou non.
     * @return true si la liste chaînée est vide, false sinon
     */
    public boolean estVide(){
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne l'élément à la position spécifiée dans la liste chaînée.
     */
    public T element(Integer position) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne <code>true</code> si la liste chaînée contient l'élément spécifié.
     * @param element l'élément dont la présence est testée
     * @return <code>true</code> si et seulement si la liste chaînée contient un élément <code>x</code> tel que <code>element.equals(x)</code>.
     * @throws NullPointerException si l'élément spécifié est <code>null</code>
     */
    public boolean contient(T element) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Ajoute un élément à la fin de la liste chaînée.
     * @param element l'élément à ajouter
     * @throws NullPointerException si l'élément spécifié est <code>null</code>
     */
    public void ajouter(T element) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Supprime le dernier élément de liste chaînée.
     * @throws UnsupportedOperationException si la liste chaînée est vide
     */
    public void supprimer() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne l'union de la liste chaînée et de la liste chaînée spécifiée.
     * @param liste la liste chaînée avec laquelle calculer l'union
     * @return une nouvelle liste chaînée contenant tous les éléments distincts contenus dans cette liste chaînée ou dans <code>liste</code>
     * @throws NullPointerException si la liste chaînée spécifiée est <code>null</code>
     */
    public void union(ListeChainee<T> liste) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne la liste chaînée sous forme d'une chaîne de caractères.
     * @return la chaîne de caractères représentant la liste chaînée
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }


}
