package com.andreymasiero.beverage.controllers;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import com.andreymasiero.beverage.model.Beer;
import com.andreymasiero.beverage.services.BeerService;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeer(UUID id) {
        log.debug("Controller called for the beer | ID: {}", id);
        return beerService.getBeerById(id);
    }
}
