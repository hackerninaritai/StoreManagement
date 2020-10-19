package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

@CrossOrigin(origins = "*", maxAge = 3600L)
@RestController
@RequestMapping(path = "/api/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping(path = "/insert")
	public ResponseEntity<?> insertCustomer(@RequestBody Customer customer) {
		if (customer.getCustomerDiscountRate() == null) {
			customer.setCustomerDiscountRate(0F);
		}
		Integer returnCode = customerService.insert(customer);
		return new ResponseEntity<Object>("return code: " + returnCode, HttpStatus.OK);
	}

	@GetMapping(path = "")
	public ResponseEntity<?> findByCustomerName(@RequestParam Optional<String> customerName) {
		if (customerName.isPresent()) {
			return new ResponseEntity<Object>(customerService.findByCustomerName(customerName.get()), HttpStatus.OK);
		}
		return new ResponseEntity<Object>(customerService.findAll(), HttpStatus.OK);
	}

}
