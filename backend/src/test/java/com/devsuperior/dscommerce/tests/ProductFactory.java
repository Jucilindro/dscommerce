package com.devsuperior.dscommerce.tests;

import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.entities.Product;
import org.springframework.security.core.parameters.P;

public class ProductFactory {

    public static Product createProduct() {
        Category category = CategoryFactory.createCategory();
        Product product = new Product(1L, "Console Playstation 5", "Venha se divertir com o nosso console", 3999.00, "https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg");
        product.getCategories().add(category);
        return product;
    }

    public static Product createProduct(String name) {
        Product product = createProduct();
        product.setName(name);
        return product;
    }
}
