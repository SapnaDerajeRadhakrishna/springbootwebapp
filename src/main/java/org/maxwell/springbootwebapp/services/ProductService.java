package org.maxwell.springbootwebapp.services;

import org.maxwell.springbootwebapp.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

}
