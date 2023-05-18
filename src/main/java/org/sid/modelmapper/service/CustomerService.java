package org.sid.modelmapper.service;

import org.sid.modelmapper.data.dto.CustomerDTO;
import org.sid.modelmapper.data.entities.Customer;

import java.util.List;

public interface CustomerService {


    List<Customer> getAllCustomer();

    List<CustomerDTO> getAllCustomerDTO();

    CustomerDTO getCustomerDTO(Long id);



}

