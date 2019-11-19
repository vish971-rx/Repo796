package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Customer;
import com.lti.repository.CustomerRepository;

//instead of @Component,use @Service
@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private SendMailService sendMailService;

	public void register(Customer customer)
	{
		customerRepository.addNewRecord(customer);
		sendMailService.send(customer.getEmail(),"hellooooooo","kesi ho?");
	}
}
