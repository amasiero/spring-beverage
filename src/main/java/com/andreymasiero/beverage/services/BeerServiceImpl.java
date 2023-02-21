package com.andreymasiero.beverage.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.andreymasiero.beverage.model.Beer;
import com.andreymasiero.beverage.model.BeerStyle;

public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {
        return Beer.builder()
                .id(id)
                .version(1)
                .name("Super Bock")
                .style(BeerStyle.LAGER)
                .upc("1234")
                .price(new BigDecimal("1.50"))
                .quantityOnHand(230)
                .createdOn(LocalDateTime.now())
                .updatedOn(LocalDateTime.now())
                .build();
    }
}
