package com.angular.spring.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.spring.app.model.Expense;
import com.angular.spring.app.service.ExpenseService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService; 
	
	@PostMapping("/expenses")
	public ResponseEntity<Expense> save(@RequestBody Expense expense) {
		Expense expenseSaved = expenseService.save(expense);
		
		return new ResponseEntity<Expense>(expenseSaved, HttpStatus.OK);
	}
	
	@GetMapping("/expenses")
	public ResponseEntity<List<Expense>> get(){
		List<Expense> expenses = expenseService.findAll();
		
		return new ResponseEntity<List<Expense>>(expenses, HttpStatus.OK);
	}
}
