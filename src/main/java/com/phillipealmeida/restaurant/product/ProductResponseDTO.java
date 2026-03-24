package com.phillipealmeida.restaurant.product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProductResponseDTO(
    Long id,
    String name,
    String description,
    BigDecimal price,
    LocalDateTime createdAt
) {}
