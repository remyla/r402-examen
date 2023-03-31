import java.util.Collection;
import java.util.NoSuchElementException;

public class ListeChainee {

    /**
     * Construit une nouvelle liste chaînée vide.
     */
    public ListeChainee() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Construit une nouvelle liste chaînée contenant tous les éléments distinct d'une collection.
     * @param objets la collection d'éléments contenus dans la liste chaînée
     * @throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public ListeChainee(Collection<Object> objets) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne le nombre d'éléments dans la liste (sa cardinalité).
     * @return le nombre d'éléments distincts contenus dans la liste
     */
    public int taille() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne <code>true</code> si la liste contient l'élément spécifié.
     * @param o l'élément dont la présence est testée
     * @return <code>true</code> si et seulement si la liste contient un élément <code>x</code> tel que <code>o.equals(x)</code>.
     */
    public boolean contient(Object o) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne un objet contenu dans la liste. Le choix de l'objet est arbitraire, mais différents appels à cette
     * méthode pour une liste donné retournent toujours le même élément.
     * @return un objet contenu dans la liste
     * @throws NoSuchElementException si la liste ne contient aucun élément
     */
    public Object element() throws NoSuchElementException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne l'union de la liste et de la liste spécifié.
     * @param e la liste avec lequel calculer l'union
     * @return une nouvelle liste contenant tous les éléments distincts contenus dans cette liste ou dans <code>e</code>
     */
    public ListeChainee union(ListeChainee e) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }


    /**
     * La méthode début, permet de mettre l'index sur le premier élément de la liste.
     */
    public void debut() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * La méthode fin, permet de mettre l'index sur le dernier élément de la liste.
     */
    public void fin() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * La méthode insertion_début, ajoute un élément au début de la liste, et met l'index sur ce nouvel élément.
     */
    public void insertion_debut() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * La méthode supprimer_fin, supprime le dernier élément de la liste et déplace l'index au dernier élément de la liste.
     */
    public void supprimer_fin() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * La méthode deplacer déplace l'index sur l'élément suivant si son argument est vrai ou sur l'élément précédent si l'argument est faux.
     */
    public void deplacer() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * La méthode lire retourne la valeur de l'élément.
     */
    public void lire() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * La méthode modifier modifie la valeur de l'élément.
     */
    public void modifier() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }



}
