package com.fkipper.studies.jwt.controllers;

import com.fkipper.studies.jwt.model.dto.ProductRequestDTO;
import com.fkipper.studies.jwt.model.dto.ProductResponseDTO;
import com.fkipper.studies.jwt.services.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDTO> postProduct(@RequestBody @Valid ProductRequestDTO body){
        ProductResponseDTO responseDTO = productService.create(body);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts(){
        var productList = productService.findAll();
        return ResponseEntity.ok(productList);
    }
}
