package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Bill;

public interface BillService {
	int insert(Bill bill);

	List<Bill> findAll();

	List<Bill> findAllByBillId(Integer billId);
	
	public String findOne();
}
