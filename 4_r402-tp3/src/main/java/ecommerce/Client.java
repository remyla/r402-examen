package ecommerce;

/**
 * Une instance de cette classe représente un compte client.
 */
public class Client extends Person {

    private final Multiset<Product> shoppingCart;

    /**
     * Crée un client avec un panier vide.
     * @param firstName le prénom du client
     * @param lastName le nom du client
     */
    public Client(String firstName, String lastName) {
        super(firstName, lastName);
        this.shoppingCart = new Multiset<>();
    }

    /**
     * Retourne le panier du client
     * @return le panier du client
     */
    public Multiset<Product> getShoppingCart() {
        return shoppingCart;
    }

}
