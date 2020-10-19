package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Bill;

@Mapper
public interface BillMapper {
	int insert(Bill bill);

	List<Bill> findAll();

	List<Bill> findAllByBillId(Integer billId);

}
