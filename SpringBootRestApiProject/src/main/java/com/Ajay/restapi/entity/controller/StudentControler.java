package com.Ajay.restapi.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ajay.restapi.entity.Student;
import com.Ajay.restapi.repository.StudentRepository;



@RestController
public class StudentControler  {
	
	@Autowired
	StudentRepository repo;
	
	// get all the students 
	
	@GetMapping("/students")
	public List<Student> getAllStudent()
	{
		List<Student> students =	repo.findAll();
		return  students;
	}
	
	// get studnt by id 
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id)
	{	
	Student student = repo.findById(id).get();
		return student;	
	}
	
	//create  new studnet 
	
	@PostMapping("/student/add")
	public void createStudent(@RequestBody Student student)
	{
		repo.save(student);
	}
	
	
	
}
