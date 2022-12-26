package com.angular.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angular.spring.app.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}