package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to my controller";
	}

	@RequestMapping("/login")
	public String login() {
		return "Checking Authentication";
	}

}
