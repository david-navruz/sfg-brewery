package com.udemy.msccbrewery.services;

import com.udemy.msccbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Heineken")
                .beerStyle("LAGER")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID id, BeerDto beerDto) {
        BeerDto beerToUpdate = BeerDto.builder().id(id).build();
        beerToUpdate.setBeerName(beerDto.getBeerName());
        beerToUpdate.setBeerStyle(beerDto.getBeerStyle());
    }

    @Override
    public void deleteById(UUID beerId) {
        BeerDto beerToDelete = BeerDto.builder().id(beerId).build();
        System.out.println("Deleting the Beer " + beerToDelete.getBeerName());
    }

}
