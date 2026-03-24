package com.phillipealmeida.restaurant.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public record
ProductRequestDTO(
    @NotBlank(message = "O nome é obrigatório")
    String name,
    
    String description,
    
    @Positive(message = "O preço deve ser positivo")
    BigDecimal price
) {}
