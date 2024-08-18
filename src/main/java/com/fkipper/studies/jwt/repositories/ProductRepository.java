package com.fkipper.studies.jwt.repositories;

import com.fkipper.studies.jwt.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
