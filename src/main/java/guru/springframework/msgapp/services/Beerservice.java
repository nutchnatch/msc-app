package guru.springframework.msgapp.services;

import guru.springframework.msgapp.web.model.BeerDto;

import java.util.UUID;

public interface Beerservice {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
