package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Component("rohit")
public class Rohit {
	
	
	public String hindu()
	{
		return "this is hindu collection api";
	}
	

}
