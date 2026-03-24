package com.phillipealmeida.restaurant.product;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponseDTO saveProduct(ProductRequestDTO productRequestDTO){
        Product product = new Product();
        product.setName(productRequestDTO.name());
        product.setDescription(productRequestDTO.description());
        product.setPrice(productRequestDTO.price());
        
        Product savedProduct = productRepository.save(product);
        return mapToResponse(savedProduct);
    }

    public List<ProductResponseDTO> findAll() {
        return productRepository.findAll().stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    public Optional<ProductResponseDTO> findById(Long id){
        return productRepository.findById(id)
                .map(this::mapToResponse);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    private ProductResponseDTO mapToResponse(Product product) {
        return new ProductResponseDTO(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            product.getCreatedAt()
        );
    }

}
