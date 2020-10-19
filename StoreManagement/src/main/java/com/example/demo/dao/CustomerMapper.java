package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Customer;

@Mapper
public interface CustomerMapper {

	int insert(Customer customer);

	List<Customer> findAll();

	List<Customer> findByCustomerName(String customerName);

}
