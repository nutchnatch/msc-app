package guru.springframework.msgapp.services;

import org.springframework.stereotype.Service;
import guru.springframework.msgapp.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerserviceImpl implements Beerservice {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Alez tout le monde!")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
