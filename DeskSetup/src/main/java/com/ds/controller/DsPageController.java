package com.ds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ds")
public class DsPageController {
	
	@GetMapping("/index")
	public String index() {
		return "test";
	}
	
}
