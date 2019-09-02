package com.cg.parallelproject1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.parallelproject1.model.Customer;


public interface CustomerDao extends JpaRepository<Customer, Integer>{

	public Customer findByIdAndPassword(int id,String password);
}
