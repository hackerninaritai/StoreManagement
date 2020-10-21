package com.example.demo.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BillService;

@CrossOrigin(origins = "*", maxAge = 3600L)
@RestController
@RequestMapping(path = "/api/sql")
public class SqlBuilderController {
	@Autowired
	BillService billService;

	@GetMapping(path = "")
	public ResponseEntity<?> deleteOne(@RequestParam String id) {
		return new ResponseEntity<Object>(billService.findOne(), HttpStatus.OK);
	}

}
