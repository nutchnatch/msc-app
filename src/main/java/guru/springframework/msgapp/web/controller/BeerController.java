package guru.springframework.msgapp.web.controller;

import guru.springframework.msgapp.services.Beerservice;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import guru.springframework.msgapp.web.model.BeerDto;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final Beerservice beerservice;

    public BeerController(Beerservice beerservice) {
        this.beerservice = beerservice;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerservice.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(BeerDto beerDto) {
        BeerDto savedBeerDto = this.beerservice.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location: ", "/api/v1/beer/" + savedBeerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
}
