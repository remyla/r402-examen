package ecommerce;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Une instance de cette classe abstraite représente un objet identifié de manière unique. Deux instances de cette
 * classe représentent toujours deux objets distincts.
 */
public abstract class UniqueObject {

    private static final AtomicLong nextId = new AtomicLong();
    private final long id;

    public UniqueObject() {
        id = nextId.getAndIncrement();
    }

    /**
     * Indique si les deux objets sont égaux, ce qui ne peut être le cas que si <code>this == o</code>
     * @param o l'objet à comparer à <code>this</code>
     * @return true ssi <code>this == o</code>
     */
    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueObject uo = (UniqueObject) o;
        return id == uo.id;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(id);
    }
}
