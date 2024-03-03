import HomeWork9.Product;
import HomeWork9.ProductFilter;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamTaskTest {
    private static final Product product1 = new Product("Book", 15.0, true);
    private static final Product product2 = new Product("Book", 450.0, true);
    private static final Product product3 = new Product("C", 350.0, true);
    private static final Product product4 = new Product("Book", 400.0, false);
    private static final Product product5 = new Product("Book", 249.99, true);
    private static final Product product6 = new Product("Book", 250.0, false);
    private static final Product product7 = new Product("C", 600.0, true);
    private static final Product product8 = new Product("Book", 65.0, false);
    private static final Product product9 = new Product("Book", 83.33, true);

    private static final List<Product> testProductsBookPresent = List.of(
            product2,
            product7,
            product3,
            product1,
            product6,
            product5,
            product4,
            product8,
            product9
    );
    private static final List<Product> testProductsBookAbsent = List.of(
            new Product("A", 15.0, true),
            new Product("B", 450.0, true),
            new Product("C", 350.0, true),
            new Product("D", 400.0, false),
            new Product("E", 249.99, true),
            new Product("F", 250.0, false),
            new Product("G", 600.0, true)
    );
    private static final String productTypeSearch = "Book";
    private static final double productHigerPriceSearch = 250.;

    @Test
    void getProductsByTypeAndHigherPrice_BookPresent() {
        ProductFilter productFilter = new ProductFilter();
        List<Product> expectedProducts = List.of(
                product2,
                product4
        );

        List<Product> actualProducts = productFilter
                .getProductsByTypeAndHigherPrice(testProductsBookPresent, productTypeSearch, productHigerPriceSearch);

        assertEquals(expectedProducts, actualProducts);
    }

    @Test
    void getProductsByTypeAndHigherPrice_BookAbsent() {
        ProductFilter productFilter = new ProductFilter();
        List<Product> expectedProducts = List.of(

        );

        List<Product> actualProducts = productFilter
                .getProductsByTypeAndHigherPrice(testProductsBookAbsent, productTypeSearch, productHigerPriceSearch);

        assertEquals(expectedProducts, actualProducts);
    }

    @Test
    void getBooksWithDiscount_BookPresent() {
        ProductFilter productFilter = new ProductFilter();
        List<Product> expectedProducts = List.of(
                new Product(product2.getProductType(),
                        product2.getProductPrice() * (1 - productFilter.getDiscountRate() / 100),
                        false),
                new Product(product1.getProductType(),
                        product1.getProductPrice() * (1 - productFilter.getDiscountRate() / 100),
                        false),
                new Product(product5.getProductType(),
                        product5.getProductPrice() * (1 - productFilter.getDiscountRate() / 100),
                        false),
                new Product(product9.getProductType(),
                        product9.getProductPrice() * (1 - productFilter.getDiscountRate() / 100),
                        false)
        );

        List<Product> actualProducts = productFilter
                .getProductsByTypeWithDiscount(testProductsBookPresent, productTypeSearch);

        assertEquals(expectedProducts, actualProducts);
    }

    @Test
    void getBooksWithDiscount_BookAbsent() {
        ProductFilter productFilter = new ProductFilter();
        List<Product> expectedProducts = List.of(

        );

        List<Product> actualProducts = productFilter
                .getProductsByTypeWithDiscount(testProductsBookAbsent, productTypeSearch);

        assertEquals(expectedProducts, actualProducts);
    }

    @Test
    void getCheapestProductByType_ifPresent() {
        ProductFilter productFilter = new ProductFilter();
        Product expectedProduct = new Product("Book", 13.5, false);

        Product actualProduct = productFilter
                .getCheapestProductByType(testProductsBookPresent, productTypeSearch)
                .orElse(new Product("", 0.0, false));

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    void getCheapestProductByType_ifAbsent() {
        ProductFilter productFilter = new ProductFilter();
        Product expectedProduct = new Product("", 0.0, false);

        Product actualProduct = productFilter
                .getCheapestProductByType(testProductsBookAbsent, productTypeSearch)
                .orElse(new Product("", 0.0, false));

        System.out.println(expectedProduct);
        System.out.println(actualProduct);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    void getThreeLastAddedProducts() throws InterruptedException {
        final Product product11 = new Product("Book", 15.0, true);
        TimeUnit.MILLISECONDS.sleep(1);
        final Product product21 = new Product("Book", 450.0, true);
        TimeUnit.MILLISECONDS.sleep(1);
        final Product product31 = new Product("C", 350.0, true);
        TimeUnit.MILLISECONDS.sleep(1);
        final Product product41 = new Product("Book", 400.0, false);
        TimeUnit.MILLISECONDS.sleep(1);
        final Product product51 = new Product("Book", 249.99, true);
        TimeUnit.MILLISECONDS.sleep(1);
        final Product product61 = new Product("Book", 250.0, false);
        TimeUnit.MILLISECONDS.sleep(1);
        final Product product71 = new Product("F", 600.0, true);

        final List<Product> testProductsList = List.of(
                product21,
                product71,
                product31,
                product11,
                product61,
                product51,
                product41
        );
        ProductFilter productFilter = new ProductFilter();
        List<Product> expectedProducts = List.of(
                product51,
                product61,
                product71
        );

        List<Product> actualProducts = productFilter.getThreeLastAddedProducts(testProductsList);

        assertEquals(expectedProducts, actualProducts);
    }

    @Test
    void calculateTotalPrice_Y_P() {
        ProductFilter productFilter = new ProductFilter();
        double expectedResult = product1.getProductPrice() * (1 - productFilter.getDiscountRate() / 100) +
                product8.getProductPrice() +
                product9.getProductPrice() * (1 - productFilter.getDiscountRate() / 100);

        double actualResult = productFilter
                .calculateTotalPrice_Y_P(testProductsBookPresent, productTypeSearch, 75.0)
                .orElse(0.0);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void groupProductsByType() {
        ProductFilter productFilter = new ProductFilter();
        Map<String, List<Product>> expectedResult = new HashMap<>();
        testProductsBookPresent.forEach(product -> {
            String key = product.getProductType();
            if (expectedResult.containsKey(key)) {
                expectedResult.get(key).add(product);
            } else
                expectedResult.put(product.getProductType(), List.of(product));
        });

        Map<String, List<Product>> actualResult = productFilter
                .groupProductsByType(testProductsBookPresent);

        assertEquals(expectedResult, actualResult);
    }
}