package com.angular.spring.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.spring.app.model.Expense;
import com.angular.spring.app.repository.ExpenseRepository;

@Service
public class ExpenseSerivceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	
	@Override
	public Expense save(Expense expense) {
		expenseRepository.save(expense);
		
		return expense;
	}
	
	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}
}