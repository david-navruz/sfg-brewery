package com.udemy.msccbrewery.web.mappers;

import com.udemy.msccbrewery.domain.Beer;
import com.udemy.msccbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);


}
