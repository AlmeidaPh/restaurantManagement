package com.phillipealmeida.restaurant.product;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/products")
    public ResponseEntity<ProductResponseDTO> saveProduct(@Valid @RequestBody ProductRequestDTO productRequestDTO){
        ProductResponseDTO saveProduct = productService.saveProduct(productRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveProduct);
    }

    @GetMapping("/products")
    public List<ProductResponseDTO> findAll(){
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductResponseDTO> findById(@PathVariable Long id) {
        return productService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        if (productService.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

}
