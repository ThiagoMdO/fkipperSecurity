package com.fkipper.studies.jwt.services;

import com.fkipper.studies.jwt.model.dto.ProductRequestDTO;
import com.fkipper.studies.jwt.model.dto.ProductResponseDTO;
import com.fkipper.studies.jwt.model.entities.Product;
import com.fkipper.studies.jwt.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public ProductResponseDTO create(ProductRequestDTO requestDTO){
        return createNewProduct(requestDTO);
    }

    public List<ProductResponseDTO> findAll(){
        return repository.findAll().stream().map(ProductResponseDTO::new).toList();
    }

    private ProductResponseDTO createNewProduct(ProductRequestDTO requestDTO){
        var save = repository.save(new Product(requestDTO));
        return new ProductResponseDTO(save);
    }
}
