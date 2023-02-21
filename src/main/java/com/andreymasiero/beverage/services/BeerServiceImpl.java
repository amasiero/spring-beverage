package com.andreymasiero.beverage.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.andreymasiero.beverage.model.Beer;
import com.andreymasiero.beverage.model.BeerStyle;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    private Map<UUID, Beer> beerMap;

    public BeerServiceImpl() {
        this.beerMap = new HashMap<>();
        Beer beer1 = Beer.builder()
                .id(UUID.fromString("06daad4b-1d8d-4b40-a786-e2b6924368dc"))
                .version(1)
                .name("Super Bock")
                .style(BeerStyle.LAGER)
                .upc("1234")
                .price(new BigDecimal("1.50"))
                .quantityOnHand(230)
                .createdOn(LocalDateTime.now())
                .updatedOn(LocalDateTime.now())
                .build();

        Beer beer2 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .name("Sagres")
                .style(BeerStyle.LAGER)
                .upc("1234")
                .price(new BigDecimal("1.30"))
                .quantityOnHand(230)
                .createdOn(LocalDateTime.now())
                .updatedOn(LocalDateTime.now())
                .build();

        Beer beer3 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .name("Dois corvos")
                .style(BeerStyle.PALE_ALE)
                .upc("1234")
                .price(new BigDecimal("3.50"))
                .quantityOnHand(230)
                .createdOn(LocalDateTime.now())
                .updatedOn(LocalDateTime.now())
                .build();

        beerMap.put(beer1.getId(), beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);
    }

    @Override
    public List<Beer> listBeers() {
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Beer getBeerById(UUID id) {
        log.debug("Service called for the beer | ID: {}", id);
        return beerMap.get(id);
    }
}
