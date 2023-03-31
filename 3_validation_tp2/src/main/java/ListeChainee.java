import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * Cette classe modélise une liste chainée les contenus sont garantis
 * non-<code>null</code>. Les instances de cette classe sont immuables.
 */
public class ListeChainee {

    /**
     * Permet de stocker l'index courant dans la liste chainée
     * L'index pourra etre de type element si on réalise un struct element permettant
     * d'associer un index, un valeur, des méthodes pour obtenir l'element suivant ou précedent
     * pour chacune des valeurs de la liste chainée
     */
    protected int index;

    /**
     * Construit une nouvelle liste chainée vide
     */
    public ListeChainee(){
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Construit une nouvelle liste chainée contenant tous les éléments distinct d'une collection.
     *
     * @param objets la collection d'objet contenus dans la liste chainée
     * @throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public ListeChainee(Collection<Object> objets) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne le nombre d'éléments dans la liste chainee (sa cardinalité).
     *
     * @return le nombre d'éléments distincts contenus dans l'ensemble
     */
    public int taille() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne <code>true</code> si la liste chainée contient l'élément spécifié.
     *
     * @param o l'élément dont la présence est testée
     * @return <code>true</code> si et seulement si la liste chainée contient un élément <code>x</code> tel que <code>o.equals(x)</code>.
     */
    public boolean contient(Object o) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne un objet contenu dans la liste chainée. Le choix de l'objet est arbitraire, mais différents appels à cette
     * méthode pour un ensemble donné retournent toujours le même élément.
     *
     * @return un objet contenu dans l'ensemble
     * @throws NoSuchElementException si l'ensemble ne contient aucun élément
     */
    public Object element() throws NoSuchElementException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne l'union de la liste chainée et de celle spécifiée.
     *
     * @param l la liste chainée qui sera ajoutée
     * @return une nouvelle liste chainée contenant tous les éléments distincts contenus dans la liste ou dans <code>l</code>
     */
    public ListeChainee union(ListeChainee l) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne l'élément à la tete de la liste chainée
     * Cette méthode fait appel à la méthode element()
     * @return la tete de la liste
     */
    public Object obtenirTete(){
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne l'élément à la queue de la liste chainée
     * Cette méthode fait appel à la méthode element()
     * @return la queue de la liste
     */
    public Object obtenirQueue(){
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Rajoute l'element au debut de la liste chainée
     * @param o l'element a ajouter au debut de la liste chainee
     * @throws NullPointerException si la o est <code>null</code>
     */
    public void insertionDebut(Object o){
        throw new UnsupportedOperationException("méthode non implémentée");
    }


    /**
     * Rajoute l'element a la fin de la liste chainée
     * @param o l'element a ajouter a la fin de la liste chainee
     * @throws NullPointerException si la o est <code>null</code>
     */
    public void insertionFin(Object o){
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Supprime le dernier element de la liste chainee
     */
    public void supprimerFin(){
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Supprime le premier element de la liste chainee
     */
    public void supprimerDebut(){
        throw new UnsupportedOperationException("méthode non implémentée");
    }

}
