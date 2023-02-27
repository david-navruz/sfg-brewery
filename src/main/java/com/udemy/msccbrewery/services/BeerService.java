package com.udemy.msccbrewery.services;

import com.udemy.msccbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID id);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID id, BeerDto beerDto) ;

    void deleteById(UUID beerId);

}
