package com.example.Toystore.Service;

import com.example.Toystore.model.Product;
import com.example.Toystore.model.Purchase;

import java.util.List;
import java.util.Optional;

public interface IproductService {

    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
    public Product saveProductWithImage(Product product, byte[] image);
    public Optional<byte[]> getProductImage(Long id);
}
