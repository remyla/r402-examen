/**
 * Cette classe modélise une liste chaînée, c'est-à-dire une collection d'objets distincts. Les objets contenus sont accessible grâce a un index.
 * Il est possible d'ajouter des éléments au début et d'en supprimer a la fin et de déplacer l'index afin de modifier ou lire un objet
 */
public class ListeChainee {

    private int index;

    /**
     * Construit une nouvelle liste chaînée vide et défini l'index de la liste chaînée a 0.
     */
    public ListeChainee() {
        this.index = 0;
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Permet d'ajouter un élément au début d'une liste chainée.
     *
     * @param element l'élément devant être ajouté au début de la liste chaînée
     */
    public void ajouterDebut(Object element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Permet de supprimer et retourner le dernier élément d'une liste chainée.
     *
     * @return Object Le dernier element de la liste chaînée qui est supprimé.
     */
    public Object supprimerFin() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Permet de déplacer l'index sur la liste chaînée
     *
     * @param avancer Si avancer vaut true, déplace l'index de un élément.
     */
    public void deplacer(boolean avancer) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * retourne l'élément qui est contenu a l'index actuel dans la liste chaînée
     *
     * @return Object L'élément étant positionné a l'index.
     */
    public Object lire() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Permet de modifier la valeur actuel a l'index de la liste chaînée par un élément passé en parametre
     *
     * @param element la valeur a affecter a la place de la valeur actuel pour l'index de la liste chaînée
     */
    public void modifier(Object element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne la valeur actuelle de l'index
     *
     * @return int La valeur actuelle de l'index
     */
    public int lireIndex() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }
}
