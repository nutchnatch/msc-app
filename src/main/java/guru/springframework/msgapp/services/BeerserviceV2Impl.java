package guru.springframework.msgapp.services;

import guru.springframework.msgapp.web.model.v2.BeerDtoV2;
import guru.springframework.msgapp.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerserviceV2Impl implements BeerserviceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.GOSE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID id, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID id) {
        log.debug("Deleting a beer...");
    }
}
