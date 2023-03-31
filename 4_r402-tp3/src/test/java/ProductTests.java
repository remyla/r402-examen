import ecommerce.Client;
import ecommerce.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductTests {
    @Test
    @DisplayName("Creation d'un produit")
    void testNewProduit() {
        Product p = new Product("produit1",new BigDecimal(4095.1));
        assertNotNull(p);

        assertEquals(new BigDecimal(4095.1),p.getPrice());

        assertEquals("produit1",p.getProductName());

        p.setPrice(new BigDecimal(4895.1));

        assertEquals(new BigDecimal(4895.1),p.getPrice());
    }
}
