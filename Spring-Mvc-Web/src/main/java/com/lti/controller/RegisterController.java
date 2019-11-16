package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.entity.Customer;
import com.lti.service.CustomerService;

@Controller
public class RegisterController {
@Autowired
private CustomerService customerservice;
	
	
	@RequestMapping(path="register.lti",method=RequestMethod.POST)
//Method-1
//public String register(HttpServletRequest request)
//Method-2
//public String register(@RequestParam("name") String name,@RequestParam("email") String email)
//form data can be stored automatically in an object
//Method-3
public String register(Customer customer)
{
		customerservice.register(customer);
	return "confirmation.jsp";
	
}
{
	
}
}
