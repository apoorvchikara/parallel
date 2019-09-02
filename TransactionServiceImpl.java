package com.cg.parallelproject1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.parallelproject1.dao.TransactionDao;
import com.cg.parallelproject1.model.Transaction;


@Service("service1")
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao transactiondao;
	@Override
	public List<Transaction> findByCustomerId(int id) {
		List<Transaction> list=transactiondao.findByCustomerId(id);
		
		return list;
	}
}
