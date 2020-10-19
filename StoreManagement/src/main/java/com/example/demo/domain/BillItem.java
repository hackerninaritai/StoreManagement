package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BillItem {

	private Integer billItemId;
	private Integer itemId;
	private Integer billId;
	private Integer quantity;
}
