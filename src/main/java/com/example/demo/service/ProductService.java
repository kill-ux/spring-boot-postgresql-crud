package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Product;

public interface ProductService {

    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);

    Product saveProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}
