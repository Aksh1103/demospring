package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Secapi {

	
	@GetMapping("/mySECapi")
	public String sayHello()
	{
		return "this is SEC api ";
	}
	
}