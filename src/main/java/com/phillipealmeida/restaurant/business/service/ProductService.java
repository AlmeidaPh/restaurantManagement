package com.phillipealmeida.restaurant.business.service;

import com.phillipealmeida.restaurant.infrastructure.entitys.Product;
import com.phillipealmeida.restaurant.infrastructure.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product){
        productRepository.saveAndFlush(product);
    }
    public Optional<Product> searchProductForId(Long id){
        return productRepository.findById(id);
    }

}
