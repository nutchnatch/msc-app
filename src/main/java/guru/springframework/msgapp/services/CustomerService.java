package guru.springframework.msgapp.services;

import guru.springframework.msgapp.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);
}
