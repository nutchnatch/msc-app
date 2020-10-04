package guru.springframework.msgapp.web.controller;

import guru.springframework.msgapp.services.CustomerService;
import guru.springframework.msgapp.web.model.BeerDto;
import guru.springframework.msgapp.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerID}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerID")UUID id) {
        return new ResponseEntity<>(this.customerService.getCustomerById(id), HttpStatus.OK);
    }
}
