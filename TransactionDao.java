package com.cg.parallelproject1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.parallelproject1.model.Transaction;

public interface TransactionDao extends JpaRepository<Transaction, Integer> {

	public List<Transaction>  findByCustomerId(int id);
}
