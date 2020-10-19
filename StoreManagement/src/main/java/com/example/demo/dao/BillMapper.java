package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import com.example.demo.domain.Bill;
import com.example.demo.sql.ComplicateSql;

@Mapper
public interface BillMapper {
	int insert(Bill bill);

	List<Bill> findAll();

	List<Bill> findAllByBillId(Integer billId);

	@SelectProvider(type = ComplicateSql.class, method = "select1")
	public String findOne();

}
