package com.marcosviniciusdev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity(name = "produto")
public class ProductModel {

    @Id
    private Long id;
    private String description;
    private BigDecimal valor;

}
