package com.enterprice.erp.backend.services;

import com.enterprice.erp.backend.entities.Product;
import com.enterprice.erp.backend.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    //
    private final ProductRepository productRepository;

    //
    public Product createProduct(Product product) {
        //
        return productRepository.save(product);
    }

    //
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    //
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // 4. دالة للبحث عن منتج باستخدام الباركود (SKU)
    public Optional<Product> getProductBySku(String sku) {
        return productRepository.findBySku(sku);
    }
}