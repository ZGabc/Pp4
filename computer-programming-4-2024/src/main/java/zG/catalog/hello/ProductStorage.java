package zG.catalog.hello;

import java.util.List;

public interface ProductStorage {
    List<Product> allProducts();
    void addProduct(Product newProduct);
    Product getProductBy(String id);
}
