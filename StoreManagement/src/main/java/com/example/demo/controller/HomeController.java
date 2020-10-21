package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class HomeController {

	@GetMapping(path = "")
	public String getHome() {
		return "index.html";
	}
	
	@GetMapping(path="item")
	public String getItem() {
		return "item.html";
	}

}
