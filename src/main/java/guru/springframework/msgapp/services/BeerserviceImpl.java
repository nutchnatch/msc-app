package guru.springframework.msgapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import guru.springframework.msgapp.web.model.BeerDto;

import java.util.UUID;

@Slf4j
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

    @Override
    public void updateBeer(UUID id, BeerDto beerDto) {

    }

    @Override
    public void deleteById(UUID id) {
        log.debug("Deleting a beer...");
    }
}
