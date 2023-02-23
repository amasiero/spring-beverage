package com.andreymasiero.beverage.services;

import java.util.List;
import java.util.UUID;

import com.andreymasiero.beverage.model.Beer;


public interface BeerService {
    List<Beer> findAll();
    Beer findById(UUID id);
}
