package com.example.msscbeerservice.services;

import com.example.msscbeerservice.web.model.BeerDto;
import com.example.msscbeerservice.web.model.BeerPagedList;
import com.example.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface BeerService {

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);
}
