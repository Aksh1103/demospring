package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApi {
	@Autowired
//	private StudentModel stm;
	@GetMapping("myapi")
	public String sayHello()
	{
		return "this is first api ";
	}
//	public ResponseEntity<Student> createEntry(@RequestMapping Student st){
//	
//	
//
//}
}