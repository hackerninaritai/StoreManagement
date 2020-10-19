package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.example.demo.dao.BillItemMapper;
import com.example.demo.dao.BillMapper;
import com.example.demo.domain.Bill;
import com.example.demo.service.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	BillItemMapper billItemMapper;

	@Autowired
	BillMapper billMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, value = "transactionManager")
	public int insert(Bill bill) {
		try {
			billMapper.insert(bill);
			Integer billId = bill.getBillId();
			bill.getBillItem().forEach(billItem -> {
				billItem.setBillId(billId);
				billItemMapper.insert(billItem);
			});
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
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
