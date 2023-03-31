/**
 * Représente un Maillon, un élément d'une liste chaînée.
 * element est l'élément contenu dans le maillon.
 * suivant est le maillon suivant dans la liste chaînée.
 */
public class Maillon {
    private Object element;
    private Maillon suivant;

    public Maillon(Object element, Maillon suivant) {
        this.element = element;
        this.suivant = suivant;
    }

    public Object getElement() {
        return element;
    }

    public Maillon getSuivant() {
        return suivant;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setSuivant(Maillon suivant) {
        this.suivant = suivant;
    }
}
