package org.sid.modelmapper.service;

import org.modelmapper.ModelMapper;
import org.sid.modelmapper.data.dto.CustomerDTO;
import org.sid.modelmapper.data.entities.Customer;
import org.sid.modelmapper.data.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public List<CustomerDTO> getAllCustomerDTO() {
         List<Customer> Customers = customerRepository.findAll();
         List<CustomerDTO> customerDTOS = new ArrayList<>();

         for(Customer customer: Customers){
             CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
             customerDTOS.add(customerDTO);
         }
         return customerDTOS;
    }

    @Override
    public CustomerDTO getCustomerDTO(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        CustomerDTO customerDTO = modelMapper.map(customer,CustomerDTO.class);
        return customerDTO;
    }

}
