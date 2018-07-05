package com.yaz.dao;

import java.util.List;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.yaz.entity.Customer;
//import com.yaz.entity.HesapHareketi;
//import com.yaz.entity.Kampanya;

@Transactional
@EnableTransactionManagement
public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
	public Customer getCustomer(String userName, String password);
	
	public Customer getCustomer(String userName);	
}
