package ecommerce;

import java.util.Objects;

public class Person extends UniqueObject {

    private final String firstName;

    private final String lastName;

    /**
     * Crée une personne
     * @param firstName le prénom de la personne
     * @param lastName le nom de la personne
     */
    protected Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Retourne le prénom de la personne
     * @return le prénom de la personne
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Retourne le nom de la personne
     * @return le nom de la personne
     */
    public String getLastName() {
        return lastName;
    }

}
