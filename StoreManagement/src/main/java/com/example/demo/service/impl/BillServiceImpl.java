package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BillItemMapper;
import com.example.demo.dao.BillMapper;
import com.example.demo.domain.Bill;
import com.example.demo.domain.BillItem;
import com.example.demo.service.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	BillItemMapper billItemMapper;
	
	@Autowired
	BillMapper billMapper;

	@Override
	public int insert(Bill bill) {
		return billMapper.insert(bill);
	}

	@Override
	public List<Bill> findAll() {
		return billMapper.findAll();
	}

	@Override
	public List<Bill> findAllByBillId(Integer billId) {
		return billMapper.findAllByBillId(billId);
	}

}
