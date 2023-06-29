package com.udemy.msccbrewery.services;

import com.udemy.msccbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Thomas Wayne")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        CustomerDto customerToUpdate = CustomerDto.builder().id(customerId).build();
        customerToUpdate.setCustomerName(customerDto.getCustomerName());
        log.debug("Updating....");
    }

    @Override
    public void deleteById(UUID customerId) {
        CustomerDto customerToDelete = CustomerDto.builder().id(customerId).build();
        log.debug("Deleting.... ");
    }

}
