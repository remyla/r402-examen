import java.util.Collection;
import java.util.LinkedList;
/**
 * Cette classe modélise une liste chaînée, c'est-à-dire une structure de données représentant une collection ordonnée et de taille arbitraire d'éléments de même type, dont la représentation en mémoire de l'ordinateur est une succession de cellules faites d'un contenu et d'un pointeur vers une autre cellule.
 * non-<code>null</code>. Les instances de cette classe sont immuables.
 */
public class listeChainee<T> {

    /**
     * Construit une nouvelle liste chaînée vide.
     */
    public listeChainee() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Construit une nouvelle liste chaînée contenant tous les éléments d'une collection.
     *
     * @param elements la collection de T contenus dans la liste chaînée
     * @throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public listeChainee(Collection<T> elements) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * ajout d'un élément à la fin de la liste
     *
     * @param element
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public void add(T element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * ajout d'un élément à la position index
     *
     * @param index
     * @param element
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public void addIndex(int index, T element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * ajoute tout les éléments de la collection à la fin de la liste
     *
     * @param c
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public void addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * vide complètement la liste
     */
    public void clear() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * retourne l'élément à la position index
     *
     * @param index
     * @return l'élément à la position index
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public T get(int index) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * retourne le premier index de l'élément
     *
     * @param element
     * @return l'index de l'élément
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public int firstIndexOf(T element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * retourne l'index de l'élément
     *
     * @param element
     * @return in tableau d'index de l'élément
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public int[] indexOf(T element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * renvoie si la liste est vide ou non
     *
     * @return vrai si la liste est vide et faux sinon
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * supprime l'élément à la position index
     *
     * @param index
     * @return l'élément supprimé
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public T remove(int index) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * modifie l'élément à la position index
     *
     * @param element
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public void modify(int index, T element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * retourne le nombre d'éléments de la liste
     *
     * @return int le nombre d'éléments de la liste
     */
    public int getSize() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * retourne si la liste contient l'élément
     *
     * @param element
     * @return vrai si la liste contient l'élément et faux sinon
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public boolean contains(T element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * retourne une liste contenant les éléments de la liste entre fromIndex et toIndex
     *
     * @param fromIndex
     * @param toIndex
     * @return une sous liste contenant les éléments de la liste entre fromIndex et toIndex
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public LinkedList<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * supprime l'élément de la liste
     *
     * @param element
     * @return vrai si l'élément a été supprimé et faux sinon
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public boolean remove(T element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * supprime tous les éléments de la liste present dans c
     *
     * @param c
     * @return vrai si tous les éléments ont été supprimés et faux sinon
     * throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * transforme la liste chainee en tableau
     * @return un tableau contenant les éléments de la liste
     */
    public T[] toArray() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * retourne une représentation textuelle de la liste chaînée.
     *
     * @return une représentation textuelle de la liste chaînée
     */
    public String toString() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }
}
