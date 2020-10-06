package guru.springframework.msgapp.services;

import guru.springframework.msgapp.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerserviceV2 {
    Object getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID id, BeerDtoV2 beerDto);

    void deleteById(UUID id);
}
