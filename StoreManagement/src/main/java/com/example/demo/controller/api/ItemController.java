package com.example.demo.controller.api;

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

import com.example.demo.domain.Item;
import com.example.demo.service.ItemService;

@CrossOrigin(origins = "*", maxAge = 3600L)
@RestController
@RequestMapping(path = "/api/item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@PostMapping(path = "/save")
	public ResponseEntity<?> saveItem(@RequestBody Item item) {
		Integer returnCode = itemService.insert(item);
		System.out.println("is called");
		return new ResponseEntity<Object>("return code: " + returnCode, HttpStatus.OK);
	}

	@GetMapping(path = "")
	public ResponseEntity<?> findByItemName(@RequestParam Optional<String> itemName,
			@RequestParam Optional<Integer> itemId) {
		if (itemName.isPresent()) {
			return new ResponseEntity<Object>(itemService.findByItemName(itemName.get()), HttpStatus.OK);
		}
		if (itemId.isPresent()) {
			return new ResponseEntity<Object>(itemService.findByItemId(itemId.get()), HttpStatus.OK);
		}
		return new ResponseEntity<Object>(itemService.findAll(), HttpStatus.OK);
	}

}
