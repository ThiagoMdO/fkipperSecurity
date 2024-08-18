package com.fkipper.studies.jwt.config;

import com.fkipper.studies.jwt.model.entities.Product;
import com.fkipper.studies.jwt.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@RequiredArgsConstructor
public class InstantiationProduct implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        var product1 = Product.builder()
        .name("Bike")
        .price(199.00)
        .build();

        var product2 = Product.builder()
        .name("Computer")
        .price(559.63)
        .build();

        productRepository.saveAll(Arrays.asList(product1, product2));

    }
}
