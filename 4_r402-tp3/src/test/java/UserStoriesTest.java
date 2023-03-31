import ecommerce.Client;
import ecommerce.Multiset;
import ecommerce.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStoriesTest {

    /**
     * Test de l'user stories 1
     *
     * 1) on devra ici créer un panier en créent un client (new Client), on pourra aussi consulter notre
     * panier avec la méthode getShoppingCart(). On devra aussi créer un multiset de type product
     *
     * 2)
     * En test préfix on aura: la création d'un client, avec son constructeur, puis on ajoutera les différents produit dans le multiset
     */


    @Nested
    @DisplayName("Un groupe de tests : user stories 1")
    class StoriesOneTest {

        Client client;
        Multiset<Product> shoppingCart;

        @BeforeEach
        void setupNestedTest() {
            System.out.println("Avant un test du groupe");
            client = new Client("Jean", "Dupont");

            shoppingCart = new Multiset<>();
            shoppingCart.add(new Product("Pomme", new BigDecimal(1.0)));
            shoppingCart.add(new Product("Tomate", new BigDecimal(2.0)));

            client.addProductToShoppingCart(shoppingCart);

        }

        @Test
        void shoppingCartIsNotVoid() {
            System.out.println("Premier test du groupe");
            assertTrue(client.getShoppingCart().size() > 0);
        }

        @Test
        void shoppingCartIsEqualToTwo() {
            System.out.println("Premier test du groupe");
            assertTrue(client.getShoppingCart().size() == 2);
        }

    }

    @Nested
    @DisplayName("Un groupe de tests : user stories 2")
    class StoriesTwoTest {

        Client client;
        Multiset<Product> shoppingCart;

        @BeforeEach
        void setupNestedTest() {
            System.out.println("Avant un test du groupe");
            client = new Client("Jean", "Dupont");

            shoppingCart = new Multiset<>();
            shoppingCart.add(new Product("Pomme", new BigDecimal(1.0)));
            shoppingCart.add(new Product("Tomate", new BigDecimal(2.0)));

            client.addProductToShoppingCart(shoppingCart);

        }

        @Test
        void shoppingCartRemoveAll() {
            System.out.println("Premier test du groupe");
            client.emptyShoppingCart();
            assertTrue(client.getShoppingCart().size() == 0);
        }

        @Test
        void shoppingCartIsEqualToOneFraise() {
            Product p = new Product("Fraise", new BigDecimal(2.0));
            System.out.println("Premier test du groupe");
            client.emptyShoppingCart();
            client.addProductToShoppingCart(p);
            assertTrue(client.getShoppingCart().contains(p));
        }

    }

}
