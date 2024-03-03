package HomeWork9;

import java.util.*;
import java.util.stream.Collectors;

public class ProductFilter {
    private final double discountRate = 10;

    public double getDiscountRate() {
        return discountRate;
    }


    public List<Product> getProductsByTypeAndHigherPrice(List<Product> productList, String productType, double productPrice) {
        return productList.stream()
                .filter(product -> product.getProductType().equals(productType))
                .filter(product -> product.getProductPrice() > productPrice)
                .toList();
    }

    public List<Product> getProductsByTypeWithDiscount(List<Product> productList, String productType) {
        return productList.stream()
                .filter(product -> product.getProductType().equals(productType))
                .filter(product -> product.hasDiscount() == true)
                .map(product -> new Product(product.getProductType(),
                        (product.getProductPrice() - (product.getProductPrice() * discountRate / 100)),
                        false))
                .toList();
    }

    public Optional<Product> getCheapestProductByType(List<Product> productList, String productType) {
        Optional<Product> cheapestProduct = productList.stream()
                .filter(product -> product.getProductType().equals(productType))
                .map(product -> {
                    if (product.hasDiscount())
                        return new Product(product.getProductType(),
                                (product.getProductPrice() - (product.getProductPrice() * discountRate / 100)),
                                false);

                    else
                        return new Product(product.getProductType(),
                                product.getProductPrice(),
                                false);
                })
                .toList().stream()
                .min(Product::compareTo);
        if (cheapestProduct.isEmpty()) System.out.println("Продукт " + productType + " не знайдено.");
        return cheapestProduct;
    }

    public List<Product> getThreeLastAddedProducts(List<Product> productList) {
        return productList.stream()
                .sorted(Comparator.comparing(Product::getAdditionTime))
                .skip((long) (productList.size() - 3.0))
                .toList();
    }

    public OptionalDouble calculateTotalPrice_Y_P(List<Product> productList, String productType, double priceHighLimit) {
        return productList.stream()
                .filter(product -> product.getProductType().equals(productType))
                .map(product -> {
                    if (product.hasDiscount())
                        return new Product(product.getProductType(),
                                (product.getProductPrice() - (product.getProductPrice() * discountRate / 100)),
                                false);

                    else
                        return new Product(product.getProductType(),
                                product.getProductPrice(),
                                false);
                })
                .filter(product -> product.getProductPrice() <= priceHighLimit)
                .mapToDouble(Product::getProductPrice)
                .reduce(Double::sum);
    }

    public Map<String, List<Product>> groupProductsByType(List<Product> productList) {
        Map<String, List<Product>> productsCollection = productList.stream()
                .collect(Collectors.toMap(Product::getProductType, product -> List.of(product)));
        System.out.println(productsCollection);
        return productsCollection;
    }
}
