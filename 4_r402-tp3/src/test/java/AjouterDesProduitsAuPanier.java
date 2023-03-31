import ecommerce.Client;
import ecommerce.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AjouterDesProduitsAuPanier {

    private static Client Luke;
    private static Product PS5;

    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("Test d'ajout de produit dans un panier client");
        Luke = new Client("Luke","Gontier");
        PS5 = new Product("PlayStation 5", new BigDecimal(25.60));
    }

    @BeforeEach
    void setUpBeforeEach(){
        Luke.getShoppingCart().clear();
    }

    @Test
    @DisplayName("Ajout de produit dans le panier")
    void ajoutDeProduitDansLePanier(){
        Luke.getShoppingCart().add(PS5);
        assertTrue(Luke.getShoppingCart().contains(PS5));
    }


}
