package com.phillipealmeida.restaurant.infrastructure.repository;

import com.phillipealmeida.restaurant.infrastructure.entitys.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
