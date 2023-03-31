import ecommerce.Client;
import ecommerce.Product;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ECommerceTests {

    // User Story 1
    @Test
    public void testAjouterUnArticleAuPanier() {
        Client a = new Client("A", "nom");
        Product tomate = new Product("tomate", new BigDecimal("1.5"));
        a.getShoppingCart().add(tomate);
        assertEquals(1, a.getShoppingCart().size());
    }

    @Test
    public void testAjouterDeuxArticlesAuPanier() {
        Client a = new Client("A", "nom");
        Product tomate = new Product("tomate", new BigDecimal("1.5"));
        Product poivron = new Product("poivron", new BigDecimal("1.5"));
        a.getShoppingCart().add(tomate);
        a.getShoppingCart().add(poivron);
        assertEquals(2, a.getShoppingCart().size());
    }

    @Test
    public void testAjouterDeuxFoisLeMemeArticleAuPanier() {
        Client a = new Client("A", "nom");
        Product tomate = new Product("tomate", new BigDecimal("1.5"));
        a.getShoppingCart().add(tomate);
        a.getShoppingCart().add(tomate);
        assertEquals(2, a.getShoppingCart().size());
    }

    @Test
    public void testAjouterUnProduitNullAuPanier() {
        Client a = new Client("A", "nom");
        assertThrows(NullPointerException.class, () -> {
            a.getShoppingCart().add(null);
        });
    }

    // User Story 2
    @Test
    public void testSupprimerUnArticleDuPanier() {
        Client a = new Client("A", "nom");
        Product tomate = new Product("tomate", new BigDecimal("1.5"));
        a.getShoppingCart().add(tomate);
        a.getShoppingCart().remove(tomate);
        assertEquals(0, a.getShoppingCart().size());
    }

    @Test
    public void testSupprimerUnArticleQuiNestPasDansLePanier() {
        Client a = new Client("A", "nom");
        Product tomate = new Product("tomate", new BigDecimal("1.5"));
        Product poivron = new Product("poivron", new BigDecimal("1.5"));
        a.getShoppingCart().add(tomate);
        a.getShoppingCart().remove(poivron);
        assertEquals(1, a.getShoppingCart().size());
    }

    @Test
    public void testSupprimerUnArticleNullDuPanier() {
        Client a = new Client("A", "nom");
        assertFalse(a.getShoppingCart().remove(null));
    }

}
