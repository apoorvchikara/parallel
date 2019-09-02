package com.cg.parallelproject1.service;

import java.util.List;

import com.cg.parallelproject1.model.Transaction;

public interface TransactionService {
	public List<Transaction>  findByCustomerId(int id);
}
