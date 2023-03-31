import ecommerce.Client;
import ecommerce.Person;
import ecommerce.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class ecommerceTest {

    @Test
    @DisplayName("Test de la methode getPanier")
    void testGetPanier() {
        Client c = new Client("patrick", "lalanne");
        List<Product> panier = new Vector<>();
        assertEquals(c.getPanier(), panier);
    }

    @Test
    @DisplayName("Test de la methode ajoutPanier")
    void testAjoutPanier() {
        Product p = new Product("test", new BigDecimal(1));
        Client c = new Client("patrick", "lalanne");
        c.ajoutPanier(p);
        assertEquals(c.getPanier().get(0), p);
    }

    @Test
    @DisplayName("Test de la methode enleverPanier")
    void testEnleverPanier() {
        Product p = new Product("test", new BigDecimal(1));
        Client c = new Client("patrick", "lalanne");
        c.ajoutPanier(p);
        c.enleverPanier(p);
        assertEquals(c.getPanier().size(), 0);
    }

}
