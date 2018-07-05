package com.yaz.ows;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yaz.entity.Customer;

@Service
public interface CustomerService {

	public List<Customer> getCustomers();
	
	public Customer getCustomer(String userName, String password);
	
	public Customer getCustomer(String userName);

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}