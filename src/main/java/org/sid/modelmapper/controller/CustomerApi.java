package org.sid.modelmapper.controller;
import org.sid.modelmapper.common.Paths;
import org.sid.modelmapper.data.dto.CustomerDTO;
import org.sid.modelmapper.data.entities.Customer;
import org.sid.modelmapper.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Paths.API)
public class CustomerApi {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @GetMapping("/customers/dto")
    List<CustomerDTO> getAllCustomerDTO(){
        return customerService.getAllCustomerDTO();
    }

    @GetMapping("customers/dto/{id}")
    CustomerDTO getCustomerDTO(@PathVariable Long id){
       return customerService.getCustomerDTO(id);
    }

}
