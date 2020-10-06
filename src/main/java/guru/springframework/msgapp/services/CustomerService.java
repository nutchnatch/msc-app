package guru.springframework.msgapp.services;

import guru.springframework.msgapp.web.model.BeerDto;
import guru.springframework.msgapp.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID id, CustomerDto customerDto);

    void deleteById(UUID id);

}
