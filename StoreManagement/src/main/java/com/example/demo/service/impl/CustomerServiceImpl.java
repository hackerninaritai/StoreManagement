package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerMapper;
import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerMapper customerMapper;

	@Override
	public int insert(Customer customer) {
		return customerMapper.insert(customer);
	}

	@Override
	public List<Customer> findAll() {
		return customerMapper.findAll();
	}

	@Override
	public List<Customer> findByCustomerName(String customerName) {
		return customerMapper.findByCustomerName(customerName);
	}

}
