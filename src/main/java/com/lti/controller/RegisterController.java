package com.lti.controller;


import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
public String register(Customer customer, @RequestParam("profilePic") MultipartFile mf)
{
		System.out.println(mf.getOriginalFilename());
		
		String path = "d:/Uploads/";
		String finalpath = path + mf.getOriginalFilename();
		try {
			mf.transferTo(new File(finalpath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		customer.setProfilePicName(mf.getOriginalFilename());
		customerservice.register(customer);
	return "confirmation.jsp";
	
}
{
	
}
}
