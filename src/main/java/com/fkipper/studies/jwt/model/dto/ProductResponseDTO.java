package com.fkipper.studies.jwt.model.dto;

import com.fkipper.studies.jwt.model.entities.Product;

public record ProductResponseDTO(
    String id, String name, Double price
) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}
