package com.andreymasiero.beverage.services;

import java.util.List;
import java.util.UUID;

import com.andreymasiero.beverage.model.Beer;


public interface BeerService {
    List<Beer> listBeers();
    Beer getBeerById(UUID id);
}
