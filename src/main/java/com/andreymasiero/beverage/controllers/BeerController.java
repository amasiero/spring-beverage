package com.andreymasiero.beverage.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import com.andreymasiero.beverage.services.BeerService;

@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;
}
