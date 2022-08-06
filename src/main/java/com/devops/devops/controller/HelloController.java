package com.devops.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/sayhello")
	public String sayHello() {
		return "Hi, hello";
	}
}
