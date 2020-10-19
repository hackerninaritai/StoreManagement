package com.example.demo.domain;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bill {

	private Integer billId;
	private Integer customerId;
	private Integer itemId;
	private List<BillItem> billItem;
	private Float billTotal;
}
