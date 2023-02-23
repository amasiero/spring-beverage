package com.andreymasiero.beverage.controllers;

import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andreymasiero.beverage.model.Beer;
import com.andreymasiero.beverage.services.BeerService;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/beers")
public class BeerController {
    private final BeerService beerService;

    @GetMapping
    public List<Beer> findAll() {
        return beerService.findAll();
    }

    @GetMapping("/{id}")
    public Beer findById(@PathVariable UUID id) {
        log.debug("Controller called for the beer | ID: {}", id);
        return beerService.findById(id);
    }
}

