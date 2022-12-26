package com.angular.spring.app.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="expenses")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Expense {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	private String expense;
	
	private String description;
	
	private BigDecimal amount;

	
	public Expense(String expense, String description, BigDecimal amount) {
		super();
		this.expense = expense;
		this.description = description;
		this.amount = amount;
	}
	
	
}
