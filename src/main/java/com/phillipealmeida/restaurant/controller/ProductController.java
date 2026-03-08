package com.phillipealmeida.restaurant.controller;

import com.phillipealmeida.restaurant.business.service.ProductService;
import com.phillipealmeida.restaurant.infrastructure.entitys.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> searchProductForId(@PathVariable Long id) {
        Optional<Product> product = productService.searchProductForId(id);
        return ResponseEntity.ok(product);
    }

    @GetMapping
    public String test() {
        return "ok";
    }
}
