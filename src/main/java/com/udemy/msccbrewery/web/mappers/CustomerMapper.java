package com.udemy.msccbrewery.web.mappers;

import com.udemy.msccbrewery.domain.Customer;
import com.udemy.msccbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);


}
