package HomeWork9;

import java.time.LocalDateTime;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private final int id;
    private static int nextId = 1;
    private String productType;
    private double productPrice;
    private boolean hasDiscount;
    private LocalDateTime additionTime;

    public Product(String productType, double productPrice, boolean hasDiscount) {
        this.id = nextId;
        nextId++;
        this.productType = productType;
        this.productPrice = productPrice;
        this.hasDiscount = hasDiscount;
        this.additionTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getProductType() {
        return productType;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public LocalDateTime getAdditionTime() {
        return additionTime;
    }

    public boolean hasDiscount() {
        return hasDiscount;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " +
                "Product type: " + productType + ", " +
                "Price: " + productPrice + ", " +
                "Discount: " + hasDiscount + ", " +
                "Addition time: " + additionTime;
    }


    @Override
    public int compareTo(Product o) {
        return (int) (this.getProductPrice() - o.getProductPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(productPrice, product.productPrice) == 0 &&
                hasDiscount == product.hasDiscount &&
                Objects.equals(productType, product.productType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productType, productPrice, hasDiscount, additionTime);
    }
}
