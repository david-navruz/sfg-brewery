package com.udemy.msccbrewery.services.v2;

import com.udemy.msccbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID id);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2);

    void updateBeer(UUID id, BeerDtoV2 beerDtoV2);

    void deleteById(UUID beerId);
}
