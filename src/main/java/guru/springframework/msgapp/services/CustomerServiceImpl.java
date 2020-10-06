package guru.springframework.msgapp.services;

import guru.springframework.msgapp.web.model.BeerDto;
import guru.springframework.msgapp.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Raphael Nadal")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {

    }

    @Override
    public void deleteById(UUID id) {
        log.debug("Deleting a customer...");
    }
}
