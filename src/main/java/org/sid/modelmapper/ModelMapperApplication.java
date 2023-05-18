package org.sid.modelmapper;

import org.sid.modelmapper.data.entities.Customer;
import org.sid.modelmapper.data.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ModelMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelMapperApplication.class, args);
		
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			Customer customer = Customer.builder().firstName("John").LastName("Draper").email("johndraper@gmail.com").build();
			customerRepository.save(customer);
		};
	}
	

	
}
