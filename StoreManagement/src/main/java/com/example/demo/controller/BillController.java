package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Bill;
import com.example.demo.service.BillService;

@CrossOrigin(origins = "*", maxAge = 3600L)
@RestController
@RequestMapping(path = "/api/bill")
public class BillController {

	@Autowired
	BillService billService;

	@GetMapping(path = "")
	public ResponseEntity<?> findAll() {
		return new ResponseEntity<Object>(billService.findAll(), HttpStatus.OK);
	}

	@PostMapping(path = "/insert")
	public ResponseEntity<?> insert(@RequestBody Bill bill) {
		Integer id = billService.insert(bill);
		return new ResponseEntity<Object>("id: " + id, HttpStatus.OK);
	}

	@GetMapping(path = "/123")
	public ResponseEntity<?> findOne() {
		return new ResponseEntity<Object>(billService.findOne(), HttpStatus.OK);
	}

}
