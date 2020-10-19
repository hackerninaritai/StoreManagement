package com.example.demo.domain;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bill {

	private Integer billId;
	private Customer customer;
	private List<BillItem> billItem;
	private Float billTotal;
}
