package com.andreymasiero.beverage.services;

import java.util.UUID;

import com.andreymasiero.beverage.model.Beer;

public interface BeerService {
    Beer getBeerById(UUID id);
}
