package com.yaz.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yaz.entity.Customer;
import com.yaz.ows.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value = "/frusers", produces = "application/json; charset=UTF-8")
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@PostMapping(value = "/frusers", produces = "application/json; charset=UTF-8")
	public Customer addCustomer(@RequestBody Customer theCustomer){
		
		theCustomer.setId(0);
		
		customerService.saveCustomer(theCustomer);
		
		return theCustomer;
	}
	
	@PutMapping(value = "/frusers", produces = "application/json; charset=UTF-8")
	public Customer updateCustomer(@RequestBody Customer theCustomer){
		
		customerService.saveCustomer(theCustomer);
		
		return theCustomer;
	}
	
	@DeleteMapping("/frusers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId){
		
		Customer tempCustomer = customerService.getCustomer(customerId);
		
		if(tempCustomer == null)
			throw new CustomerNotFoundException("Customer id not found - " + customerId);
		
		customerService.deleteCustomer(customerId);
		
		return "Deleted Customer id - " + customerId;
	}
	
	@PostMapping(value = "/frusers/user/pass", produces = "application/json; charset=UTF-8")
	public Customer getCustomer(@RequestHeader String userName, @RequestHeader String password){
		Customer theCustomer = customerService.getCustomer(userName, password);
		
		if(theCustomer == null)
			throw new CustomerNotFoundException("UserName or password not found - " + userName + " " +password);
		
		return theCustomer;
	}
	
	@PostMapping(value = "/frusers/user", produces = "application/json; charset=UTF-8")
	public Customer getCustomer(@RequestHeader String userName){
		Customer theCustomer = customerService.getCustomer(userName);
		
		if(theCustomer == null)
			throw new CustomerNotFoundException("UserName not found - " + userName);
		
		return theCustomer;
	}
	
	@PostMapping(value = "/frusers/find", produces = "application/json; charset=UTF-8")
	public Customer getCustomer(@RequestHeader int customerId){
		Customer theCustomer = customerService.getCustomer(customerId);
		
		if(theCustomer == null)
			throw new CustomerNotFoundException("Customer id not found - " + customerId);
		
		return theCustomer;
	}
	
	
	@PostMapping(value = "/frusers/multiple", produces = "application/json; charset=UTF-8")
	public Customer[] addCustomers(@RequestBody Customer[] theCustomers){
		
		for(int i = 0; i < theCustomers.length; i++) {
			theCustomers[i].setId(0);
			
			customerService.saveCustomer(theCustomers[i]);
		}
		
		return theCustomers;
	}
}
