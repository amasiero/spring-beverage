package com.andreymasiero.beverage.model;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Customer {
    private UUID id;
    private String name;
    private Integer version;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
