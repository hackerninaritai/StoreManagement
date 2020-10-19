package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.BillItem;

@Mapper
public interface BillItemMapper {
	int insert(BillItem billItem);

	List<BillItem> findAll();

	List<BillItem> findAllByBillId(Integer billId);
}
