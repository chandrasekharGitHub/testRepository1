package com.angular.spring.app.service;

import java.util.List;

import com.angular.spring.app.model.Expense;

public interface ExpenseService {
	public Expense save(Expense expense);
	
	public List<Expense> findAll();
}
