package com.phillipealmeida.restaurant.infrastructure.repository;

import com.phillipealmeida.restaurant.infrastructure.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
