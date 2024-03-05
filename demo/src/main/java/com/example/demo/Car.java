package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

	@Autowired
	private Dog dog;
	
	@Autowired
	private Ajay ajay; 
	
	@Autowired
	private Rohit rohit;
	
	@Autowired
	private Deepak deepak;
	
	@GetMapping("/okmessage")
	public String okmessage()
		{
		return dog.fun();	
		}
	
	@GetMapping("/myapimet")
	public String myapimet()
	{
		return ajay.aksh();
	}
	

	@GetMapping("/hindubro")
	public String hhindu()
	{	
		System.out.println("rohit hindu bro");
		return rohit.hindu();
	}
	
	@GetMapping("/dpkk")
	public String dddpak()
	{	System.out.println("deepak method ");
		return deepak.dpk();
	}
	
	
	
	
	
}
