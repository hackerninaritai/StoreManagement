package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {

	private Integer customerId;
	private String customerName;
	private Float customerDiscountRate;
}
