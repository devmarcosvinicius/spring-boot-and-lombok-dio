package com.marcosviniciusdev.repository;

import com.marcosviniciusdev.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
