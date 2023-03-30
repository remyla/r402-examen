package ecommerce;

import java.math.BigDecimal;

/**
 * Une instance de cette classe représente un produit à vendre.
 */
public class Product extends UniqueObject {

    private final String productName;

    private BigDecimal price;

    public Product(String productName, BigDecimal price) {
        this.productName = productName;
        this.price = price;
    }

    /**
     * Retourne le nom du produit
     * @return le nom du produit
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Retourne le prix du produit
     * @return le prix du produit
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Modifie le prix du produit
     * @param price le nouveau prix du produit
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
