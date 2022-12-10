package com.bank.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="account")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
	@Id
	private String id;
	
	@Column(name="customer_id")
	private String customerId;
	
	@Column(name="product_id")
	private String productId;
	
	private String headlines;
	
	@Column(name="total_amount")
	private Double totalAmount;
}
