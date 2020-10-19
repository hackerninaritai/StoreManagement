package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Customer;

public interface CustomerService {

	public int insert(Customer customer);

	public List<Customer> findAll();

	public List<Customer> findByCustomerName(String customerName);

}
