package ecommerce;

import org.junit.jupiter.api.Test;
import pl.StyczenMarta.ecommerce.catalog.Product;
import pl.StyczenMarta.ecommerce.catalog.ProductStorage;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class HashMapProductStorageTest {
    @Test
    void itAllowsToStoreProduct() {
        //Arrange
        Product product = thereIsExampleProduct();
        ProductStorage hashmapStorage = thereIsHashMapStorage();
        //Act
        hashmapStorage.addProduct(product);
        //Assert
        List<Product> products = hashmapStorage.allProducts();
        assertThat(products)
                .hasSize(1)
                .extracting(Product::getName)
                .contains("test-it");

//        Product testProduct = new Product(UUID.randomUUID(), "test it", "desc");

    }


    @Test
    void itAllowsToLoadAllProducts() {

    }

    @Test
    void getItAllowsToLoadProductsById() {

    }

    private ProductStorage thereIsHashMapStorage() {
        return null;
    }

    private Product thereIsExampleProduct() {
        return new Product(UUID.randomUUID(), "test it", "desc", BigDecimal.valueOf(10));
    }

}
