import ecommerce.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ClientTests {
    @Test
    @DisplayName("Creation d'un client")
    void testNewClient() {
        Client c = new Client("prenom", "nom");
        assertNotNull(c);
        assertNotNull(c.getShoppingCart());
    }

}
