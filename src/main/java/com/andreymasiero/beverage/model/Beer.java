package com.andreymasiero.beverage.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Beer {
    private UUID id;
    private Integer version;
    private String name;
    private BeerStyle style;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
