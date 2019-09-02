package com.cg.parallelproject1.service;

import java.util.List;

import com.cg.parallelproject1.model.Customer;
import com.cg.parallelproject1.model.Transaction;


public interface CustomerService {

	public List<Customer> findAll();

	public void save(Customer customer);


	public Customer findById(Integer id);


	
	public Customer findByIdAndPassword(int id,String password);
	
}
