package ecommerce;

import java.util.*;

/**
 * Une instance de cette classe est un multiensemble, une collection non ordonnée où un élément peut apparaître
 * plusieurs fois.
 * Les éléments contenus dans cette classe sont non-nulls.
 * @param <T> le type des éléments contenu dans le multiensemble
 */
public class Multiset<T> extends AbstractCollection<T> implements Collection<T> {

    private final HashMap<T, Integer> content;

    private int modCount = 0;

    /**
     * Construit un multiensemble vide
     */
    public Multiset() {
        content = new HashMap<>();
    }

    /**
     * Construit un multiensemble contenant tous les éléments d'une collection
     * @param collection
     * @throws NullPointerException si collection contient un élément null
     */
    public Multiset(Collection<T> collection) {
        content = new HashMap<>();
        this.addAll(collection);
    }

    /**
     * Un itérateur sur les éléments du multiensemble. L'itérateur n'offre pas de garantie sur l'ordre des éléments.
     * L'itérateur retourne chaque élément autant de fois qu'il est présent dans le multiensemble.
     * @return un itérateur sur les éléments du multiensemble
     */
    @Override
    public Iterator<T> iterator() {
        return new MultisetIterator(content.keySet().iterator());
    }

    /**
     * Retourne le nombre d'éléments dans le multiensemble
     * @return le nombre d'éléments dans le multiensemble
     */
    @Override
    public int size() {
        Integer s = 0;
        for (Integer i: content.values()) {
            s += i;
        }
        return s;
    }

    /**
     * Ajoute un élément au multiensemble
     * @param t l'élément à ajouter
     * @return true si le multiensemble a été modifié. Pour cette opération, c'est toujours le cas.
     * @throws NullPointerException si t est null
     */
    @Override
    public boolean add(T t) {
        if (t == null) { throw new NullPointerException("adding null element to multiset"); }
        Integer qty = content.get(t);
        if (qty == null) {
            content.put(t, 1);
        } else {
            content.replace(t, qty + 1);
        }
        modCount++;
        return true;
    }

    /**
     * Supprime une instance d'un objet du multiensemble
     * @param o l'élément à supprimer
     * @return true si le multiensemble a été modifié suite. C'est le cas si l'objet à supprimer était initialement
     * présent.
     */
    @Override
    @SuppressWarnings("All")
    public boolean remove(Object o) {
        Integer arity = content.get(o);
        if (arity == null) {
            return false;
        } else if (arity == 1) {
            content.remove(o);
        } else {
            content.replace((T) o, arity - 1);
        }
        modCount++;
        return true;
    }

    /**
     * Supprime toutes les instances d'un objet du multiensemble
     * @param o l'élément à supprimer
     * @return true si le multiensemble a été modifié. C'est le cas si au moins une instance de l'objet à supprimer
     * était initialement présente.
     */
    public boolean removeAll(Object o) {
        modCount++;
        return (content.remove(o) != null);
    }

    /**
     * Indique si le multiensemble contient l'objet
     * @param o l'objet dont la présence est testée
     * @return true si le multiensemble contient au moins une instance de l'objet
     */
    @Override
    @SuppressWarnings("All")
    public boolean contains(Object o) {
        return content.containsKey(o);
    }

    /**
     * Supprime tous les éléments du multiensemble
     */
    @Override
    public void clear() {
        content.clear();
        modCount++;
    }

    /**
     * Retourne le nombre d'occurrences de l'objet dans le multiensemble
     * @param t l'objet dont l'arité est mesurée
     * @return le nombre d'occurrences de l'objet dans le multiensemble
     */
    int getArity(T t) {
        Integer qty = content.get(t);
        return qty == null ? 0 : qty;
    }

    /**
     * Modifie le nombre d'occurrences de l'objet dans le multiensemble
     * @param t l'objet dont l'arité est modifiée
     * @param arity le nouveau nombre d'occurrences de l'objet dans le multiensemble
     * @throws IllegalArgumentException si arity < 0
     * @throws NullPointerException si t est null
     */
    void changeArity(T t, int arity) {
        if (arity < 0) { throw new IllegalArgumentException("arity cannot be negative"); }
        if (t == null) { throw new NullPointerException("changing arity of null element"); }

        if (arity == 0) {
            removeAll(t);
        } else {
            content.put(t, arity);
            modCount++;
        }
    }

    private class MultisetIterator implements Iterator<T> {

        int expectedModCount;

        MultisetIterator(Iterator<T> keyIterator) {
            this.keyIterator = keyIterator;
            this.lastKey = null;
            this.expectedModCount = modCount;
        }

        Iterator<T> keyIterator;

        T lastKey;

        Integer lastValue;

        @Override
        public boolean hasNext() {
            return keyIterator.hasNext()
                    || (lastKey != null && lastValue < Multiset.this.content.get(lastKey));
        }

        @Override
        public T next() {
            checkForComodification();
            if (lastKey == null || lastValue >= Multiset.this.content.get(lastKey)) {
                lastKey = keyIterator.next();
                lastValue = 1;
            } else {
                lastValue++;
            }
            return lastKey;
        }

        @Override
        public void remove() {
            checkForComodification();
            Integer arity = Multiset.this.content.get(lastKey);
            if (arity == 1) {
                keyIterator.remove();
                lastKey = null;
            } else {
                Multiset.this.content.replace(lastKey, arity - 1);
                lastValue--;
            }
        }

        private void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multiset<?> multiset = (Multiset<?>) o;
        return content.equals(multiset.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

}
