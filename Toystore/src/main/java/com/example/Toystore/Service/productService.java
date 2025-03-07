package com.example.Toystore.Service;

import com.example.Toystore.Repository.IProductRepository;
import com.example.Toystore.model.Product;
import com.example.Toystore.exception.ProductNotFoundException; // Import the custom exception
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productService implements IproductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> getAllProducts() {
        return iProductRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return iProductRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @Override
    public Product createProduct(Product product) {
        return iProductRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        if (iProductRepository.existsById(id)) {
            product.setId(id);
            return iProductRepository.save(product);
        }
        throw new ProductNotFoundException(id);
    }

    @Override
    public void deleteProduct(Long id) {
        if (iProductRepository.existsById(id)) {
            iProductRepository.deleteById(id);
        } else {
            throw new ProductNotFoundException(id);
        }
    }

    @Override
    public Product saveProductWithImage(Product product, byte[] image) {
        product.setImage(image);
        return iProductRepository.save(product);
    }

    @Override
    public Optional<byte[]> getProductImage(Long id) {
        return iProductRepository.findById(id)
                .map(Product::getImage);
    }
}
