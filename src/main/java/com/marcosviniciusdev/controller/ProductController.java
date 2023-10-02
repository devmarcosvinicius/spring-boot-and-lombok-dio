package com.marcosviniciusdev.controller;

import com.marcosviniciusdev.model.ClientModel;
import com.marcosviniciusdev.model.ProductModel;
import com.marcosviniciusdev.repository.ClientRepository;
import com.marcosviniciusdev.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/listall")
    public ResponseEntity<List<ProductModel>> listAll() {
        return ResponseEntity.ok(productRepository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<ProductModel> save(@RequestBody ProductModel product) {
        return ResponseEntity.ok(productRepository.save(product));
    }

}