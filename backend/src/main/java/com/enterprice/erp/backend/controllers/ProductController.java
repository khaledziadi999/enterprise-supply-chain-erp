package com.enterprice.erp.backend.controllers;

import com.enterprice.erp.backend.entities.Product;
import com.enterprice.erp.backend.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products") // هذا هو الرابط الذي سندخل عليه من المتصفح
@RequiredArgsConstructor
public class ProductController {

    //    (Service)
    private final ProductService productService;

    //
    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product savedProduct = productService.createProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

    //
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
}