package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {

	private Integer itemId;
	private String itemName;
	private Float itemPurchasePrice;
	private Float itemSellingPrice;
	private Integer itemInstock;

}
