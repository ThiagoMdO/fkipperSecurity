package com.fkipper.studies.jwt.model.entities;

import com.fkipper.studies.jwt.model.dto.ProductRequestDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Entity(name = "product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotBlank
    @NotNull (message = "You need to tip the name of the product")
    @Column(unique = true)
    private String name;

    @NotNull
    @Positive (message = "The price of the product need to be positive value")
    private Double price;

    public Product(ProductRequestDTO data){
        this.price = data.price();
        this.name = data.name();
    }
}
